package com.suo.image.view;

import com.suo.image.util.Density;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

public class TagView extends TextView {

    private Context context;
    private int degrees ;
    private String abc;
    int width;//控件宽
    int height;//控件高
    int tagY = 3;//tag占控件高的比例 （几分之一）
    int tagH = 3;//tag的高度所占比例

    public TagView(Context context) {
        super(context);
        this.context = context;
        width = getWidth();
        height = getHeight();
        degrees = 10;
    }

    public TagView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public TagView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
    }
    
    
    @Override
    protected void onDraw(Canvas canvas) {
        System.out.println("degrees: "+degrees);
        super.onDraw(canvas);
        width = getWidth();
        height = getHeight();
        canvas.rotate(-45,0,height / 4);
        /*设置背景为白色*/
         Paint paint=new Paint();
         /*去锯齿*/
         paint.setAntiAlias(true);
         /*设置paint的外框宽度*/
         paint.setStrokeWidth(3);
         
         /*设置paint 的style为 FILL：实心*/
         paint.setStyle(Paint.Style.FILL);
         /*设置paint的颜色*/
         paint.setColor(Color.RED);
         /*画一个实心梯形*/
         Path path3=new Path();
//         path3.moveTo(0, 120);
//         path3.lineTo(21,99);
//         path3.lineTo(149,99);
//         path3.lineTo(170, 120);
         path3.moveTo(0, height / 4);
         path3.lineTo(height / 11, height/4 - height/11);
         path3.lineTo(5*height/14 - height/11, height/4 - height/11);
         path3.lineTo(5*height/14, height / 4);
         path3.close();
         canvas.drawPath(path3, paint);
         
         /*写字*/
         if (!TextUtils.isEmpty(abc)){
             paint.setTextSize(Density.getSceenHeight(context)/50);
             paint.setColor(Color.WHITE);
             canvas.drawText(abc, 5*height/28-height/24, height / 4 - height/50, paint);
//             canvas.drawTextOnPath(abc, path3, 0, 0, paint);
         }
    }

//    @Override
//    public void setText(CharSequence text, BufferType type) {
//        super.setText(text, type);
//        abc = text.toString();
//    }
    
    public void setText(String str){
        abc = str.toString();
        invalidate();
    }

}
