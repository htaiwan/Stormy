package com.htaiwan.app.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.htaiwan.app.stormy.R;
import com.htaiwan.app.stormy.weather.Day;

/**
 * Created by app on 6/21/15.
 */
public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;

    public DayAdapter(Context context, Day[] days) {
        mDays = days;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int position) {
        return mDays[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            // brand new
            convertView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            holder = new ViewHolder();
            holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconimageView);
            holder.temptureLabel = (TextView) convertView.findViewById(R.id.temptureLabel);
            holder.dayLabel = (TextView) convertView.findViewById(R.id.daynameLabel);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }

        Day day = mDays[position];

        holder.iconImageView.setImageResource(day.getIconId());
        holder.temptureLabel.setText(day.getTemptureMax() + "");
        holder.dayLabel.setText(day.getDayOfTheWeek());

        return null;
    }

    // ViewHolder Design Pattern ，  元件重複使用
    private static class ViewHolder {
        ImageView iconImageView;
        TextView temptureLabel;
        TextView dayLabel;
    }
}
