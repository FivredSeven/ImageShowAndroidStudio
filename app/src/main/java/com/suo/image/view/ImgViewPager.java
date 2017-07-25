package com.suo.image.view;

import java.util.ArrayList;
import java.util.List;

import com.nostra13.universalimageloader.utils.L;
import com.suo.demo.R;

import net.tsz.afinal.FinalBitmap;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 广告相册
 * 
 * ivp_ad = (ImgViewPager) findViewById(R.id.ivp_ad); //设置图片是否可循环，是否可展示底部文本字说明等
 * 如设置ivp_ad.setFlag(ImgViewPager.FLAG_SHOW_BOTTOM_VIEW); 则只图片不可自动无限循环滑动，
 * ivp_ad.setFlag(ImgViewPager.FLAG_IMG_NOLIMIT_LOOP|ImgViewPager .FLAG_SHOW_BOTTOM_ALL_VIEW);
 * //FLAG_SHOW_BOTTOM_ALL_VIEW全部或FLAG_SHOW_BOTTOM_DOT_VIEW点 ivp_ad.setImageIds(getImageResIDs());
 * ivp_ad.setImageDescriptions(getImageDescription()); ivp_ad.show(XxxActivity.this);
 * 
 */

public class ImgViewPager extends RelativeLayout {

    // 图片支持无限循环
    public static final int FLAG_IMG_NOLIMIT_LOOP = 0x1;
    // 显示底部全部内容
    public static final int FLAG_SHOW_BOTTOM_ALL_VIEW = 0x2;
    // 只显示底部点的内容
    public static final int FLAG_SHOW_BOTTOM_DOT_VIEW = 0x4;
    // 点宽度
    public static final int DOT_POINT_WIDTH = 10;
    // 点高度
    public static final int DOT_POINT_HEIGHT = 10;
    // 点间距
    public static final int DOT_POINT_GAP = 10;

    private ViewPager vp;
    // 在图片底部的View（包含描述和点）
    private View bottomView;
    private TextView tv_image_description;
    private LinearLayout ll_points;

    // 图片 从 网络中加载出来
    private String[] picUrls;
    // 图片从本地资源中加载出来
    private int[] imageIds;
    // 描述
    private String[] imageDescriptions;
    // 默认用图片从本地资源中取出来。
    private boolean isUseLocalImg = true;
    private ArrayList<ImageView> imageViewList;
    private int itemCount = 0;
    // 前一个点位置 保证切换时更换前一个点颜色
    private int previousSelectPosition;
    private int flag; // 支持的种类
    private boolean flagRefresh = true; //

    private FinalBitmap fb;
    private Context context;
    private ViewPagerAdapter adapter;
    private OnImgClickListener onImgClickListener;
    private Thread thread;

    /**
     * 轮播广告handler
     */
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            vp.setCurrentItem(vp.getCurrentItem() + 1);
            adapter.notifyDataSetChanged();
        }
    };

    public ImgViewPager(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initViewPage(context);
    }

    public ImgViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViewPage(context);
        initBottomView(context);
    }

    public ImgViewPager(Context context) {
        super(context);
        initViewPage(context);
    }

    private void initViewPage(Context context) {
        this.context = context;
        vp = new ViewPager(context);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        vp.setLayoutParams(lp);
        imageViewList = new ArrayList<ImageView>();
        fb = FinalBitmap.create(this.context);
        fb.configLoadingImage(R.drawable.default_image);
    }

    public interface OnImgClickListener {
        void onImgClick(int position);
    }

    public void setOnImgClickListener(OnImgClickListener onImgClickListener) {
        this.onImgClickListener = onImgClickListener;
    }

    @SuppressWarnings("deprecation")
    public void show(Context context) {
        imageViewList.clear();
        ll_points.removeAllViews();
        vp.removeAllViews();
        for (int i = 0; i < itemCount; i++) {
            ImageView iv = new ImageView(context);
            // type暂时修改为center_crop,wuhq
            iv.setScaleType(ScaleType.CENTER_CROP);
            if (isUseLocalImg) {
                iv.setBackgroundResource(imageIds[i]);
            } else {
                // bitmap加载就这一行代码，display还有其他重载，详情查看源码
                fb.display(iv, picUrls[i]);
            }

            final int curPos = i;
            iv.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (null != onImgClickListener) {
                        onImgClickListener.onImgClick(curPos);
                    }
                }
            });
            
            imageViewList.add(iv);

            // 添加点view对象
            View view = new View(context);
            view.setBackgroundResource(R.drawable.selector_img_viewpager_point);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(DOT_POINT_WIDTH, DOT_POINT_HEIGHT);
            lp.leftMargin = DOT_POINT_GAP;
            lp.rightMargin = DOT_POINT_GAP;
            view.setLayoutParams(lp);
            view.setEnabled(false);
            ll_points.addView(view);
        }
        // 是否有底部的广告显示
        if ((flag & FLAG_SHOW_BOTTOM_ALL_VIEW) == FLAG_SHOW_BOTTOM_ALL_VIEW) { // 显示底部全部内容
            addView(vp);
            ViewGroup.LayoutParams layoutParams = bottomView.getLayoutParams();
            if (null == layoutParams) {
                layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
            }
            LayoutParams relatLp = new LayoutParams(layoutParams.width,
                    layoutParams.height);
            relatLp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM); // 设置到底部中去
            addView(bottomView, relatLp);
            tv_image_description.setText(imageDescriptions[previousSelectPosition]);
            ll_points.getChildAt(previousSelectPosition).setEnabled(true);
        } else if ((flag & FLAG_SHOW_BOTTOM_DOT_VIEW) == FLAG_SHOW_BOTTOM_DOT_VIEW) { // 只显示底部点的内容
            addView(vp);
            tv_image_description.setVisibility(View.VISIBLE);
            bottomView.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            ViewGroup.LayoutParams layoutParams = bottomView.getLayoutParams();
            if (null == layoutParams) {
                layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
            }
            LayoutParams relatLp = new LayoutParams(layoutParams.width,
                    layoutParams.height);
            relatLp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM); // 设置到底部中去
            addView(bottomView, relatLp);
            tv_image_description.setText(imageDescriptions[previousSelectPosition]);
            ll_points.getChildAt(previousSelectPosition).setEnabled(true);
        } else {
            addView(vp);
        }

        adapter = new ViewPagerAdapter();
        vp.setAdapter(adapter);
        vp.setOnPageChangeListener(new OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                // 改变图片的描述信息
                tv_image_description.setText(imageDescriptions[position % itemCount]);
                // 切换选中的点
                ll_points.getChildAt(previousSelectPosition).setEnabled(false); // 把前一个点置为normal状态
                ll_points.getChildAt(position % itemCount).setEnabled(true); // 把当前选中的position对应的点置为enabled状态
                previousSelectPosition = position % itemCount;
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
        vp.setOnTouchListener(new OnTouchListener() {
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // TODO Auto-generated method stub
                vp.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        

        // 自动切换页面功能
        
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                boolean loop = (flag & FLAG_IMG_NOLIMIT_LOOP) == FLAG_IMG_NOLIMIT_LOOP;
//                while (loop && itemCount >= 3 && flagRefresh) {
//                    SystemClock.sleep(3000);
//                    handler.sendEmptyMessage(0);
//                }
//            }
//        };
//        thread = new Thread(runnable);
//        thread.start();
    }

    class ViewPagerAdapter extends PagerAdapter {
        private boolean loop = false;

        public ViewPagerAdapter() {
            loop = ((flag & FLAG_IMG_NOLIMIT_LOOP) == FLAG_IMG_NOLIMIT_LOOP) && itemCount >= 3;
        }

        @Override
        public int getCount() {
            if (loop) {
                return Integer.MAX_VALUE;
            } else {
                return itemCount;
            }
        }

        /**
         * 判断出去的view是否等于进来的view 如果为true直接复用
         */
        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == arg1;
        }

        /**
         * 销毁预加载以外的view对象, 会把需要销毁的对象的索引位置传进来就是position
         */
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            if (loop) {
                container.removeView(imageViewList.get(position % itemCount));
            } else {
                container.removeView(imageViewList.get(position));
            }
        }

        /**
         * 创建一个view
         */
        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView childView = null;
            if (loop) {
                int nowPosition = position % itemCount;
                // L.e("nowPosition---->:"+nowPosition+" position-->"+position+"  imageViewList.size():"+imageViewList.size()+" itemCount-->"+itemCount+" -->context"+context.getClass().getName());
                childView = imageViewList.get(nowPosition);
                if (childView.getParent() == container) {
                    // container.removeView(childView);
                    if (picUrls != null && !TextUtils.isEmpty(picUrls[nowPosition]) && null != childView) {
                        fb.display(childView, picUrls[nowPosition]);
                    } else {
                        if (picUrls == null) {
                            L.e("--?picUrls is null");
                        } else {
                            if (TextUtils.isEmpty(picUrls[nowPosition])) {
                                L.e("--?picUrls[nowPosition]) is null -->:");
                            }
                        }
                    }
                }
            } else {
                childView = imageViewList.get(position);
            }
            if (childView.getParent() != null) {
                L.e("ViewPagerAdapter----ViewPagerAdapter", "childView  has already parent..." + position);
            } else {
                container.addView(childView, 0);
            }
            return childView;
        }
    }

    // 加载转变的底部控件，
    private void initBottomView(Context context) {
        bottomView = View.inflate(context, R.layout.img_viewpager_bottom, null);
        tv_image_description = (TextView) bottomView.findViewById(R.id.tv_image_description);
        ll_points = (LinearLayout) bottomView.findViewById(R.id.ll_points);
    }

    /**
     * 示例 同时支持 图片无限循环， 显示底部的图片说明 setFlag(ImgViewPager.FLAG_IMG_NOLIMIT_LOOP|ImgViewPager .FLAG_SHOW_BOTTOM_VIEW);
     * 
     * @param flag
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }

    /**
     * 布局中，必须包含tv_image_description与ll_points 的。
     * 
     * @param context
     * @param bottomLayoutId xml布局id
     */
    public void setBottomView(Context context, int bottomLayoutId) {
        bottomView = View.inflate(context, bottomLayoutId, null);
        tv_image_description = (TextView) bottomView.findViewById(R.id.tv_image_description);
        ll_points = (LinearLayout) bottomView.findViewById(R.id.ll_points);
    }

    /**
     * 
     * <传入url字符串数组> <加载网络图片>
     * 
     * @param picUrls
     */
    public void setPicUrls(String[] picUrls) {
        this.picUrls = picUrls;
        itemCount = picUrls.length;
        isUseLocalImg = false; // 图片将从网络中加载
    }

    /**
     * 
     * <传入url字符串集合> <加载网络图片>
     * 
     * @param picUrls
     */
    public void setPicUrls(List<String> picUrls) {
        String[] pus = new String[picUrls.size()];
        for (int i = 0; i < picUrls.size(); i++) {
            pus[i] = picUrls.get(i);
        }
        this.picUrls = pus;
        itemCount = picUrls.size();
        isUseLocalImg = false; // 图片将从网络中加载
    }

    /**
     * 
     * <传入资源id数组> <加载内部资源图片>
     * 
     * @param imageIds
     */
    public void setImageIds(int[] imageIds) {
        this.imageIds = imageIds;
        itemCount = imageIds.length;
        isUseLocalImg = true; // 图片将从本地中加载
    }

    /**
     * 
     * <传入图片描述数组> <暂不显示>
     * 
     * @param imageDescriptions
     */
    public void setImageDescriptions(String[] imageDescriptions) {
        this.imageDescriptions = imageDescriptions;
    }

    /**
     * 
     * <传入图片描述集合> <暂不显示>
     * 
     * @param imageDescriptions
     */
    public void setImageDescriptions(List<String> imageDescriptions) {
        String[] imgDes = new String[imageDescriptions.size()];
        for (int i = 0; i < imageDescriptions.size(); i++) {
            imgDes[i] = imageDescriptions.get(i);
        }
        this.imageDescriptions = imgDes;
    }

    /**
     * 
     * <置空所有数据>
     * 
     */
    public void removeAllData() {
        this.picUrls = null;
        itemCount = 0;
        this.imageIds = null;
        this.imageDescriptions = null;
        this.imageViewList.clear();
    }

    public boolean isFlagRefresh() {
        return flagRefresh;
    }

    public void setFlagRefresh(boolean flagRefresh) {
        this.flagRefresh = flagRefresh;
    }

}