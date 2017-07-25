package com.suo.image.adapter;//package com.suo.image.adapter;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//import net.tsz.afinal.FinalBitmap;
//
//import com.nostra13.universalimageloader.core.DisplayImageOptions;
//import com.nostra13.universalimageloader.core.ImageLoader;
//import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
//import com.suo.demo.R;
//import com.suo.image.activity.BaseActivity;
//import com.suo.image.activity.MainActivity;
//import com.suo.image.util.Log;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.WindowManager.LayoutParams;
//import android.widget.BaseAdapter;
//import android.widget.FrameLayout;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//public class ImageGridViewAdapter extends BaseAdapter {
//
//	private BaseActivity context;
//	private List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
//	private FinalBitmap fb;
//	
//	public ImageGridViewAdapter(BaseActivity context,List<Map<String, Object>> listItems, FinalBitmap fb) {
//		this.context = context;
//		this.listItems = listItems;
//		this.fb = fb;
//		Log.e("size:" + listItems.size());
//	}
//
//	@Override
//	public int getCount() {
//		// TODO Auto-generated method stub
//		return listItems.size();
//	}
//
//	@Override
//	public Object getItem(int arg0) {
//		// TODO Auto-generated method stub
//		return listItems.get(arg0);
//	}
//
//	@Override
//	public long getItemId(int arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public View getView(int position, View convertView, ViewGroup parent) {
//		
//		ViewHolder viewHolder = null;
//		if(convertView == null)
//		{
//			LayoutInflater inflater = LayoutInflater.from(context);
//			convertView = inflater.inflate(R.layout.image_gridview, null);
//			viewHolder = new ViewHolder();
//			viewHolder.image = (ImageView) convertView.findViewById(R.id.image_grid);
//			viewHolder.text = (TextView) convertView.findViewById(R.id.text_grid);
//			convertView.setTag(viewHolder);
//		}else{
//			viewHolder = (ViewHolder) convertView.getTag();
//		}
//		String url = (String) listItems.get(position).get("url");
//		String text = (String) listItems.get(position).get("text");
//		
//		fb.display(viewHolder.image, url);
////		SimpleImageLoader.display(context, viewHolder.image, url, R.drawable.default_image);
//		FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) viewHolder.image.getLayoutParams();
//		lp.height = MainActivity.height/4;
//		viewHolder.image.setLayoutParams(lp);
//		viewHolder.text.setText(text);
//		
//		return convertView;
//	}
//	
//	public final class ViewHolder
//	{
//		public ImageView image;
//		public TextView text;
//	}
//
//}
