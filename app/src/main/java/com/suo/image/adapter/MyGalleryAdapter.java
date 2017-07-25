package com.suo.image.adapter;

import java.util.List;
import java.util.Map;

import net.tsz.afinal.FinalBitmap;

import com.bumptech.glide.Glide;
import com.suo.demo.R;
import com.suo.image.activity.BaseActivity;
import com.suo.image.img.SimpleImageLoader;
import com.suo.image.util.ImageLoaderUtil;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyGalleryAdapter extends BaseAdapter {

	private BaseActivity context;
//	private String[] urlList = new String[5];
	private List<Map<String, Object>> listItems;
//	private FinalBitmap fb;
//	private Bitmap bm;
	
	public MyGalleryAdapter(BaseActivity context, List<Map<String, Object>> listItems, FinalBitmap fb) {
		this.context = context;
		this.listItems = listItems;
//		this.fb = fb;
//		bm = BitmapFactory.decodeResource(context.getResources(), R.drawable.default_image);
	}

	@Override
	public int getCount() {
		
		return listItems.size();
	}

	@Override
	public Object getItem(int arg0) {
		
		return listItems.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		ViewHolder viewHolder = null;
		if(convertView == null)
		{
			LayoutInflater inflater = LayoutInflater.from(context);
			convertView = inflater.inflate(R.layout.picture_list_gallery_item, null);
			viewHolder = new ViewHolder();
			viewHolder.image = (ImageView) convertView.findViewById(R.id.galleryPicView);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		String url = (String) listItems.get(position).get("url");

		ImageLoaderUtil.getInstance().loadImageByGlide(url, viewHolder.image, R.drawable.default_image);
//        fb.display(viewHolder.image, url, bm);
//		SimpleImageLoader.display(context, viewHolder.image, url, R.drawable.default_image);
		
        return convertView;  
	}
	
	public final class ViewHolder
	{
		public ImageView image;
	}

}
