package com.vvvd.yk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yk on 2017/9/23.
 */

public class MyAdapter extends BaseAdapter {
    private List<String> list;
    private Context context;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<String> list){
        this.context = context;
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    class ViewHolder{
        ImageView img;
        TextView tv;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if(viewHolder == null){
            viewHolder = new ViewHolder();
            view = inflater.inflate(R.layout.item,null);
            viewHolder.img = (ImageView) view.findViewById(R.id.img);
            viewHolder.tv = (TextView) view.findViewById(R.id.tv);

            viewHolder.img.setImageResource(Integer.parseInt(list.get(i).split("-")[0]));
            viewHolder.tv.setText(list.get(i).split("-")[1]);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        return view;
    }
}
