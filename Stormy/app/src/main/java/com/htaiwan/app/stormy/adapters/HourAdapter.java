package com.htaiwan.app.stormy.adapters;

import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import android.widget.Toast;

import com.htaiwan.app.stormy.R;
import com.htaiwan.app.stormy.weather.Hour;


/**
 * Created by app on 6/24/15.
 */

// 2. <HourAdapter.HourViewHolder>
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {
    private Hour[] mHours;
    private Context mContext;

    public HourAdapter(Context context,Hour[] hours) {
        mContext = context;
        mHours = hours;
    }

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hourly_list_item, parent, false);
        HourViewHolder viewHolder = new HourViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {
        holder.bindHour(mHours[position]);
    }

    @Override
    public int getItemCount() {
        return mHours.length;
    }

    // 1.建立ViewHolder
    public class HourViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView mTimeLabel;
        public TextView mSummaryLabel;
        public TextView mTemptureLabel;
        public ImageView mIconImageView;

        public HourViewHolder(View itemView) {
            super(itemView);

            mTimeLabel = (TextView) itemView.findViewById(R.id.timeLabel);
            mSummaryLabel = (TextView) itemView.findViewById(R.id.summaryLabel);
            mTemptureLabel = (TextView) itemView.findViewById(R.id.temptureLabel);
            mIconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);

            itemView.setOnClickListener(this);
        }

        public void bindHour(Hour hour) {
            mTimeLabel.setText(hour.getHour());
            mTemptureLabel.setText(hour.getTempeture() + "");
            mSummaryLabel.setText(hour.getSummary());
            mIconImageView.setImageResource(hour.getIconID());
        }

        @Override
        public void onClick(View v) {
            String time = mTimeLabel.getText().toString();
            String tempture = mTemptureLabel.getText().toString();
            String summary = mSummaryLabel.getText().toString();

            String message = String.format("At %s it will be %s and %s",time, tempture, summary);
            Toast.makeText(mContext,message,Toast.LENGTH_LONG).show();
        }
    }

}
