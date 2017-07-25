package com.suo.image.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Gallery;

@SuppressWarnings("deprecation")
public class MyGallery extends Gallery {

	//������µ����   
	private float x;  
	//�ƶ�����ʱ�����   
	private float endx;   
	//����ȥʱѡ�е�����±�   
	private int selectedIndex;  
	private float mxwidth;
	
	public MyGallery(Context context) {
		super(context);
	}

	public MyGallery(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyGallery(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	/* (non-Javadoc)
	 * @see android.widget.Gallery#onFling(android.view.MotionEvent, android.view.MotionEvent, float, float)
	 */
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		int kEvent;
		if(isScrollingLeft(e1, e2)){ //Check if scrolling left
			kEvent = KeyEvent.KEYCODE_DPAD_LEFT;
		}
		else{ //Otherwise scrolling right
			kEvent = KeyEvent.KEYCODE_DPAD_RIGHT;
		}
		onKeyDown(kEvent, null);
		return true;
	}
	
	private boolean isScrollingLeft(MotionEvent e1, MotionEvent e2){
		        return e2.getX() > e1.getX();
		    }

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		int action = event.getAction();
		if (action == MotionEvent.ACTION_DOWN) {
			x = event.getX();    
			endx = 0;     
			selectedIndex = getSelectedItemPosition();
			if(selectedIndex == 0)
				mxwidth = getWidth() - x;
			if(selectedIndex == 0)     
				mxwidth = x;
		}else if (action == MotionEvent.ACTION_MOVE) {
			if(selectedIndex == 0 || selectedIndex == getCount() - 1){
				float mx = event.getX();
				Animation translate = null;
				endx = mx - x;
				if (selectedIndex == 0) {
					if (endx > 0 && endx < getWidth() && mx > x - mxwidth){
						translate = new TranslateAnimation(endx, endx, 0, 0);
						translate.setDuration(25);       
						translate.setFillAfter(true);       
						startAnimation(translate); 
					}else {        
						endx = 0;        
						selectedIndex = getSelectedItemPosition();      
					}
				}else {
					if (endx < 0 && endx > - getWidth() * 2 && mx < x + mxwidth) {
						translate = new TranslateAnimation(endx, endx, 0, 0);
						translate.setDuration(25);       
						translate.setFillAfter(true);       
						startAnimation(translate);
					}else {        
						endx = 0;        
						selectedIndex = getSelectedItemPosition();      
					}
				}
			}
		}else if (action == MotionEvent.ACTION_UP) {
			if((selectedIndex == 0 || selectedIndex == getCount() - 1)){
				int index = getSelectedItemPosition();
				if(index == 0 || index == getCount() - 1){
					if(endx != 0){
						Animation translate = new TranslateAnimation(endx, 0, 0, 0);
						translate.setDuration(300);
						translate.setFillAfter(true);
						startAnimation(translate);
					}
				}
			}
		}
		return super.onTouchEvent(event);
	}
}
