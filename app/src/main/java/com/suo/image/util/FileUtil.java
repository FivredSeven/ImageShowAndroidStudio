package com.suo.image.util;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import android.os.Environment;

public class FileUtil {

	private URL url = null;   
	private int FILESIZE = 4 * 1024; 
	
	/**
	 * 
	 * Deletes the directory passed in.
	 * 
	 * @param dir
	 *            Directory to be deleted
	 */

	public static void doDeleteEmptyDir(String dir) {

		boolean success = (new File(dir)).delete();

		if (success) {
//			Log.d("Successfully deleted empty directory: " + dir);
		} else {
//			Log.d("Failed to delete empty directory: " + dir);
		}

	}

	/**
	 * 
	 * Deletes all files and subdirectories under "dir".
	 * 
	 * @param dir
	 *            Directory to be deleted
	 * 
	 * @return boolean Returns "true" if all deletions were successful.
	 * 
	 *         If a deletion fails, the method stops attempting to
	 * 
	 *         delete and returns "false".
	 */

	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]));
				if (!success) {
					return false;
				}
			}
		}
		// The directory is now empty so now it can be smoked
		return dir.delete();
	}
	
	public static boolean deleteDir(String path){
		File f = new File(path);
		
		if(!FileUtil.deleteDir(f)){
			return false;
		}
		return f.delete();
	}
	
	public static boolean SDCardExists(){
		return Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED);
	}
	
	
	public static void writeObjToFile(Object obj, String filename) {
		// List��map���л�����
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos); // ���ཫ����д���ֽ���
			oos.writeObject(obj);
			byte[] data = baos.toByteArray();// �@ȡ��������л�����
			OutputStream os = new FileOutputStream(new File(filename));
			os.write(data);
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object readObjFromFile(String filename) {
		Object obj = null;
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			if (fis.available() > 0)
				obj = ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	/**  
     *   
     * @param urlStr  
     * @param path  
     * @param fileName  
     * @return   
     *      -1:文件下载出错  
     *       0:文件下载成功  
     *       1:文件已经存在  
     */  
    public int downFile(String urlStr, String path, String fileName){  
        InputStream inputStream = null;  
        try {  
        	File file = new File(path + fileName);
            if(file.exists()){  
                return 1;  
            } else {  
                inputStream = getInputStreamFromURL(urlStr);  
                File resultFile = write2SDFromInput(path, fileName, inputStream);  
                if(resultFile == null){  
                    return -1;  
                }  
            }  
        }   
        catch (Exception e) {  
            e.printStackTrace();  
            return -1;  
        }  
        finally{  
            try {  
                inputStream.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        return 0;  
    }  
    
    /**  
     * 根据URL得到输入流  
     * @param urlStr  
     * @return  
     */  
    public InputStream getInputStreamFromURL(String urlStr) {  
        HttpURLConnection urlConn = null;  
        InputStream inputStream = null;  
        try {  
            url = new URL(urlStr);  
            urlConn = (HttpURLConnection)url.openConnection();  
            inputStream = urlConn.getInputStream();  
              
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
          
        return inputStream;  
    } 
    
    /**  
     * 将一个InputStream里面的数据写入到SD卡中  
     * @param path  
     * @param fileName  
     * @param input  
     * @return  
     */  
    public File write2SDFromInput(String path,String fileName,InputStream input){  
        File file = null;  
        OutputStream output = null;  
        try {  
            createSDDir(path);  
            file = createSDFile(fileName);  
            output = new FileOutputStream(file);  
                            byte[] buffer = new byte[FILESIZE];  
  
            /*真机测试，这段可能有问题，请采用下面网友提供的  
                            while((input.read(buffer)) != -1){  
                output.write(buffer);  
            }  
                            */  
  
                           /* 网友提供 begin */  
                           int length;  
                           while((length=(input.read(buffer))) >0){  
                                 output.write(buffer,0,length);  
                           }  
                           /* 网友提供 end */  
  
            output.flush();  
        }   
        catch (Exception e) {  
            e.printStackTrace();  
        }  
        finally{  
            try {  
                output.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        return file;  
    }  
    
    /**  
     * 在SD卡上创建文件  
     * @param fileName  
     * @return  
     * @throws IOException  
     */  
    public File createSDFile(String fileName) throws IOException{  
        File file = new File(ImageUtils.image_path + fileName + ".txt");  
        file.createNewFile();  
        return file;  
    }  
    
    /**  
     * 在SD卡上创建目录  
     * @param dirName  
     * @return  
     */  
    public File createSDDir(String dirName){  
        File dir = new File(dirName);  
        dir.mkdir();  
        return dir;  
    } 
}
