package com.suo.image.img;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.suo.image.activity.BaseActivity;
import com.suo.image.util.FileUtil;
import com.suo.image.util.Log;
import com.suo.image.util.Preference;
import com.suo.image.util.Pub;
import com.suo.image.util.Util;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

class ImageCacheObj implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1156096161502570515L;

	public ImageCacheObj(String fileName, int cacheTime) {
		this.FileName = fileName;
		this.CacheTime = cacheTime;
		this.CreateTime = new Date();
	}

	public String FileName; // �ļ���
	public Date CreateTime; // ����ʱ��
	public int CacheTime; // ����ʱ�䣬��λΪ����
}

public class ImageCache {
	/**
	 * ����
	 */
	private static ImageCache _instance = new ImageCache();

	private ImageCache() {
	}

	public static synchronized ImageCache getInstance() {
		return _instance;
	}

	private final String INDEX_FILE_NAME = "suo.img.idx";

	private ReferenceQueue<Drawable> queue = new ReferenceQueue<Drawable>();

	/**
	 * ����
	 */
	private Map<String, ImageCacheObj> m_index = new HashMap<String, ImageCacheObj>();

	/**
	 * ���� �˲����ڴ棬����������ͷŵ�
	 */
	//private Map<String, ImgSoftReference> m_cache = new HashMap<String, ImgSoftReference>();

	/**
	 * ���ƶ�����
	 * 
	 * @param url
	 * @return
	 */
	public boolean downloadDrawableByUrl(BaseActivity context, String url) {
		if ((null == url) || url.equals("")) {
			return false;
		}

		// ��黺��
		if (imageExists(url)) {
			return true;
		}

		// ��ʼ����ͼƬ
		try {
			InputStream is = new DefaultHttpClient().execute(new HttpGet(url))
					.getEntity().getContent();
			int position = url.lastIndexOf("/");
			String name = url.substring(position + 1, url.length() - 4);
			String imgPath = this.saveImage(name, is);
			
			Preference.putString(url, name);
			
			// д�뵽��������
			saveIndex(url, imgPath);
			is.close();
			//Log.d("�ļ�url:" + url + ",���سɹ�����");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	/**
	 * ����Image�ļ�
	 * 
	 * ����ͼƬ����sdcard/.imageShow/image����
	 * 
	 * @param is
	 *            ��������
	 * @param dir
	 *            ���ļ�Ŀ¼����SD�������Ŀ¼
	 * @return ���ر����ļ���·��
	 */
	private String saveImage(String name, InputStream is) {
		String filePath = "";
		if (FileUtil.SDCardExists()) {
			String path = Pub.getBaseDir() + "image";
			File fileDir = new File(path);
			if (!fileDir.exists()) {// �жϴ洢ͼƬ��Ŀ¼�Ƿ���ڣ��������򴴽�
				fileDir.mkdirs();
			}

//			String imgName = new SimpleDateFormat("yyyyMMddHHmmss")
//					.format(new Date()) + Math.random() * 100 + ".suo";// ����
			String imgName = name + ".jpg";

			File imgFile = new File(path, imgName);
			if (!imgFile.exists()) {
				try {
					FileOutputStream fos = new FileOutputStream(imgFile);
					byte[] buff = new byte[1024];
					int size = 0;
					while ((size = is.read(buff)) != -1) {
						fos.write(buff, 0, size);
					}
					fos.flush();
					fos.close();

					filePath = path + "/" + imgName;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return filePath;
	}

	/**
	 * ��ȡDrawable ���URL��ȡdrawable���������ڴ������ʱ�������ڴ�Ȼ�����
	 * 
	 * @param url
	 * @return
	 */
	public synchronized Drawable getDrawable(BaseActivity context, String url) {
		try {
			Drawable drawable = this._getDrawable(context, url);
			return drawable;
		} catch (OutOfMemoryError me) {
			recycleMemory();
			return this._getDrawable(context, url);
		}
	}

	private synchronized Drawable _getDrawable(BaseActivity context, String url) {
		//long startTime = System.nanoTime();
		//long endTime;
		// �������
		/*
		 * ȡ���ڴ滺�棬2012-12-13��shihaifeng
		ImgSoftReference _sr = null;
		while ((_sr = (ImgSoftReference) queue.poll()) != null) {
			m_cache.remove(_sr.url);
			Log.d("����������");
		}
		*/
		
		Drawable drawable = null;
		if ((null == url) || (url.length() == 0)) {
			return null;
		}
		// 1.�ӱ��ػ����ȡ
		//drawable = this.m_cache.get(url);
		/*ȡ���ڴ滺�棺2012-12-13��shihaifeng
		ImgSoftReference sr = this.m_cache.get(url);
		if (sr != null) {
			drawable = sr.get();
			//endTime = System.nanoTime();
			//Log.d("��ȡ�ļ���ʱ0��" + (endTime - startTime) / 1000);
			if(null != drawable)
				return drawable;
		}
		*/

		// 2.�ӱ����ļ���ȡ
//		String cachePath = this.getImagePath(url); 8.27 15:40
		
		
		String cachePath = Preference.getString(url, null);
		
		// endTime = System.nanoTime();
		// Log.d("��ȡ�ļ���ʱ1��" + (endTime - startTime) / 1000);
		if (cachePath != null) {
			// Log.d(cachePath);
			drawable = this.getLocalImage(cachePath);
			// Log.d("��SDCard ��ȡDrawable:" + drawable);
			// д����
			//this.m_cache.put(url, new ImgSoftReference(drawable, queue,url));
		}
		//endTime = System.nanoTime();
		//Log.d("��ȡ�ļ���ʱ2��" + (endTime - startTime) / 1000);

		return drawable;
	}

	/**
	 * �����ļ����� ����ͼƬ����sdcard/.imageshow/image����
	 */
	public void cleanUp() {
		if (!FileUtil.SDCardExists()) {
			return;
		}
		// ��ʼ����
		try {
			String path = Pub.getBaseDir() + "image";
			File fileDir = new File(path);
			if (!fileDir.exists()) {// �жϴ洢ͼƬ��Ŀ¼�Ƿ���ڣ����������˳�
				return;
			}
			// ����ļ�
			File[] fs = fileDir.listFiles();
			for (int i = 0; i < fs.length; ++i) {
				File f = fs[i];
				String filename = f.getAbsolutePath();
				// ����Ƿ����
				if (this.existsInIndex(filename)) {
					continue;
				}
				// ����Ƿ��������ļ�
				if (f.getName().equals(this.INDEX_FILE_NAME)) {
					continue;
				}
				// ɾ��
				f.delete();
//				Log.d("�ļ�:" + filename + ",�Ѿ�ɾ��");
			}
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	/**
	 * �ж�image�ļ��Ƿ��Ѿ�����
	 * 
	 * @param url
	 * @return
	 */
	private synchronized boolean imageExists(String url) {
		if (m_index.containsKey(url)) {
			String cachePath = this.getImagePath(url);
			if (Util.fileExists(cachePath)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * ����url--�ļ�������
	 * 
	 * @param url
	 * @param imagePath
	 */
	private synchronized void saveIndex(String url, String imagePath,
			int cacheTime) {

		this.m_index.put(url, new ImageCacheObj(imagePath, cacheTime));
	}

	/**
	 * �������� Ĭ�ϱ���5������
	 * 
	 * @param url
	 * @param imagePath
	 */
	private synchronized void saveIndex(String url, String imagePath) {
		saveIndex(url, imagePath, 60 * 24 * 5);
	}

	/**
	 * �������ȡ�ļ���
	 * 
	 * @param url
	 * @return
	 */
	private synchronized String getImagePath(String url) {
		ImageCacheObj obj = m_index.get(url);
		if (obj == null)
			return null;
		return obj.FileName;
	}

	/**
	 * �ж��ļ��Ƿ���� ��������Ƿ����,�����ڵģ��Ϳ���ɾ����
	 */
	private synchronized boolean existsInIndex(String filename) {
		if (this.m_filelist_not_exp.containsKey(filename)) {
			return true;
		}
		return false;
	}

	/**
	 * ��ȡ����ͼƬ ����ͼƬ����sdcard/.imageshow/image����
	 * 
	 * @param filePath
	 * @return
	 */
	private Drawable getLocalImage(String filePath) {
		filePath = Pub.getBaseDir() + "image/" + filePath + ".jpg";
		// �ӱ��ػ����ȡ
		Drawable drawable = null;
		try {
			File imgFile = new File(filePath);
			if (imgFile.exists()) {
				drawable = new BitmapDrawable(filePath);
			}
		} catch (Exception e) {
			drawable = null;
		}
		return drawable;
	}

	/**
	 * �����ڴ�
	 */
	private synchronized void recycleMemory() {
		//Log.d("�ڵ��ܸ���" + this.m_cache.size());
		Log.d("��ʼ�����ռ�");
		Util.printMemoryInfo();
		//this.m_cache.clear();
		System.gc();
		Util.printMemoryInfo();
	}

	/**
	 * ͼƬCache��ʼ�� ��ʼ�������������£� 1���������� 2�����?��Ҫ���ļ�
	 */
	public void initialize() {
		// 1.��������
		readIndexFromFile();
		//printIndex();
		// 2.���������߳�
		new Thread() {
			@Override
			public void run() {
				Log.d("���?����ʼ");
				long startTime = System.nanoTime();
				ImageCache.getInstance().cleanUp();
				long endTime = System.nanoTime();
				Log.d("���?����ɣ���������ʱ��" + (endTime - startTime)
						/ 1000);
			}
		}.start();
	}

	/**
	 * δ�����ļ��б�
	 */
	private Map<String, Boolean> m_filelist_not_exp = new HashMap<String, Boolean>();

	/**
	 * ��ȡ���� ���ļ��ж�ȡ�����ҹ���ʱ������
	 */
	private void readIndexFromFile() {
		if (!FileUtil.SDCardExists())
			return;
		String path = Pub.getBaseDir();
		path += INDEX_FILE_NAME;
		Map<String, ImageCacheObj> m = (Map<String, ImageCacheObj>) FileUtil
				.readObjFromFile(path);
		if (m != null) {
			Log.d("��������ʼ����... ...");
			// �������ڵ�����
			Date now = new Date();
			for (Map.Entry<String, ImageCacheObj> entry : m.entrySet()) {
				ImageCacheObj ico = entry.getValue();
				Calendar cal = Calendar.getInstance();
				cal.setTime(ico.CreateTime);
				cal.add(Calendar.MINUTE, ico.CacheTime);
				Date dt = cal.getTime();
				
				Log.d("�ع�����dt:" + dt + ",now " + now );
				// δ����
				if ((dt.after(now)) || (ico.CacheTime == 0)) {
					// Log.d("dt:" + dt + ",now " + now +
					// " was indexed.");
					this.m_index.put(entry.getKey(), entry.getValue());
					this.m_filelist_not_exp.put(ico.FileName, true);
				}
			}
		}
	}

	/**
	 * ͼƬCache���ջ� �����˳�ʱ����ã��������������ļ�
	 */
	public void finalize() {
		// ���������ļ�
		if (FileUtil.SDCardExists()) {
			String path = Pub.getBaseDir();
			path += INDEX_FILE_NAME;
			FileUtil.writeObjToFile(m_index, path);
			//Log.d("�����ɹ�");
		}
	}

	private void printIndex() {
		for (Map.Entry<String, ImageCacheObj> entry : m_index.entrySet()) {
			ImageCacheObj obj = entry.getValue();
			Log.d("key:" +entry.getKey()+ ",�ļ�:" + obj.FileName + "," + obj.CreateTime
					+ ",cacheTime:" + obj.CacheTime);
		}
	}
}

/**
 * ������
 * @author 61
 *
 */
class ImgSoftReference extends SoftReference<Drawable> {
	public String url;
	public ImgSoftReference(Drawable d, ReferenceQueue<Drawable> q, String url) {
		super(d,q);
		this.url = url;
	}
}