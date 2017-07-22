package com.example.deepa.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;



/**
 * Created by Deepa on 7/21/2017.
 */

public class ImageAdapter extends BaseAdapter {




        private Context mContext;

        // Keep all Images in array
        public Integer[] mThumbIds = {
                R.drawable.gingerbread, R.drawable.honeycomb,
                R.drawable.icecreamsandwich, R.drawable.jellybean,
                R.drawable.kitkat, R.drawable.lollipop

        };

        //CONSTRUCTOR
        public ImageAdapter(Context mContext) {
            this.mContext = mContext;
        }

        @Override

        public int getCount() {
            return mThumbIds.length;
        }

        @Override
        public Object getItem(int position) {
            return mThumbIds[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mThumbIds[position]);
            imageView.setPadding(10,10,10,10);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setLayoutParams(new GridView.LayoutParams(260, 290));
            return imageView;

        }
    }



