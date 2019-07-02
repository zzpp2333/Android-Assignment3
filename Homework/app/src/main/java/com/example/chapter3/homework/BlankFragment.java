package com.example.chapter3.homework;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list_item, container, false);
        ListView mListView = v.findViewById(R.id.fragment_list);
        mListView.setAdapter(new MyAdapter());
        return v;
    }
    private class MyAdapter extends BaseAdapter{
        private int[] args = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        @Override
        public int getCount() {
            return args.length;
        }

        @Override
        public Object getItem(int position) {
            return args[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView;
            if(null == convertView){
                textView = new TextView(getContext());
            }else{
                textView = (TextView)convertView;
            }
            textView.setText("Item "+String.valueOf(args[position]));
            return textView;
        }
    }
}
