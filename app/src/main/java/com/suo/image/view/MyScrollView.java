package com.suo.image.view;

import com.suo.image.activity.WordsActivity;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ScrollView;

public class MyScrollView extends ScrollView {

	private WordsActivity activity;
	
	public MyScrollView(Context context)
    {
        super(context);
    }
    
    public MyScrollView(Context context, AttributeSet attrs, int defStyle) { 
        super(context, attrs, defStyle); 
    } 
 
    public MyScrollView(Context context, AttributeSet attrs) { 
        super(context, attrs); 
    }

	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt) {
		if (t == oldt){
			activity.showAd();
		}
		super.onScrollChanged(l, t, oldl, oldt);
	}
	
	public void setContext(WordsActivity activity)
    {
        this.activity = activity;
    }
	
}
