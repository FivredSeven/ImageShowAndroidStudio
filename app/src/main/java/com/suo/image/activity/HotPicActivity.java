package com.suo.image.activity;

import java.util.ArrayList;
import java.util.List;

import net.tsz.afinal.FinalBitmap;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobQuery.CachePolicy;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

import com.bumptech.glide.Glide;
import com.suo.demo.R;
import com.suo.image.activity.Main_new.ImageAdapter;
import com.suo.image.adapter.ArrayListAdapter;
import com.suo.image.adapter.ViewHolder;
import com.suo.image.bean.ContentBean;
import com.suo.image.bean.ImageBean;
import com.suo.image.util.Density;
import com.suo.image.util.ImageLoaderUtil;
import com.suo.image.util.Log;
import com.suo.image.view.MyGridView;
import com.suo.image.view.TagView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HotPicActivity extends BaseActivity {

    private MyGridView imageGridView;
    private Button more;
    private Button btn_back;
    private Button btn_refresh;

    private ContentAdapter adapter;
    private ArrayList<ContentBean> contentBeanlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_pic);

        prepareData();
        initLayout();
        queryData(true);
    }

    private void prepareData() {
        adapter = new ContentAdapter(this);
        contentBeanlist = new ArrayList<ContentBean>();
    }

    private void initLayout() {
        btn_back = (Button) findViewById(R.id.btn_back);
        imageGridView = (MyGridView) findViewById(R.id.imageGridView);
        more = (Button) findViewById(R.id.more);
        btn_refresh = (Button) findViewById(R.id.btn_refresh);

        int width = Density.getSceenWidth(this);
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) imageGridView.getLayoutParams();
        lp.setMargins(width / 60, width / 60, width / 60, width / 60);
        imageGridView.setLayoutParams(lp);

        imageGridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HotPicActivity.this, HotContentActivity.class);
                intent.putExtra("contentBean", contentBeanlist.get(position));
                intent.putExtra("contentBeanList", contentBeanlist);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });

        btn_back.setOnClickListener(this);
        more.setOnClickListener(this);
        btn_refresh.setOnClickListener(this);
    }

    private void queryData(boolean top) {
        if (contentBeanlist != null && top) {
            contentBeanlist.clear();
            adapter.setList(contentBeanlist);
            imageGridView.setAdapter(adapter);
        }
        BmobQuery<ContentBean> bmobQuery = new BmobQuery<ContentBean>();
        // bmobQuery.addWhereEqualTo("age", 25);
        // bmobQuery.addWhereNotEqualTo("age", 25);
        // bmobQuery.addQueryKeys("objectId");
        bmobQuery.setLimit(50);
        bmobQuery.setSkip(contentBeanlist.size());
        bmobQuery.order("-zan");
        bmobQuery.addWhereGreaterThan("zan", 0);

        bmobQuery.findObjects(new FindListener<ContentBean>() {
            @Override
            public void done(List<ContentBean> list, BmobException e) {
                if (e == null) {
                    Log.e("查询成功：共" + list.size() + "条数据。");
                    if (list != null && list.size() > 0) {
                        contentBeanlist.addAll(list);
                        adapter.setList(contentBeanlist);
                        imageGridView.setAdapter(adapter);
                    } else {
                        showToast("已无更多数据啦.");
                    }
                } else {
                    Log.e("查询失败 :" + e.getMessage());
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()) {
            case R.id.btn_back:
                finish();
                break;
            case R.id.more:
                queryData(false);
                break;
            case R.id.btn_refresh:
                queryData(true);
                break;

            default:
                break;
        }
    }

    class ContentAdapter extends ArrayListAdapter<ContentBean> {

        private BaseActivity context;
//        private FinalBitmap fb;

        public ContentAdapter(BaseActivity context) {
            super(context);
            this.context = context;
        }

        public ContentAdapter(BaseActivity context, ListView listView) {
            super(context, listView);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.hot_image_gridview, parent, false);
            }

            ImageView image_grid = ViewHolder.get(convertView, R.id.image_grid);
            TextView text_grid = ViewHolder.get(convertView, R.id.text_grid);
            TagView iv_words_tag = ViewHolder.get(convertView, R.id.iv_words_tag);

            final ContentBean bean = (ContentBean) getItem(position);
            
//            fb = FinalBitmap.create(context);
//            fb.display(image_grid, bean.getContentUrl());
            ImageLoaderUtil.getInstance().loadImageByGlide(bean.getContentUrl(), image_grid, R.drawable.default_image);
            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) image_grid.getLayoutParams();
            lp.height = Density.getSceenHeight(context) / 4;
            image_grid.setLayoutParams(lp);
            iv_words_tag.setLayoutParams(lp);
            text_grid.setText(bean.getContentText());
            if (Main_new.readIds2.contains(""+bean.getId().intValue())) {
                text_grid.setTextColor(context.getResources().getColor(R.color.gray_line));
            } else {
                text_grid.setTextColor(context.getResources().getColor(R.color.image_black_text));
            }
            iv_words_tag.setText(""+bean.getZan().intValue());

            return convertView;
        }

    }

}
