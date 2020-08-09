package com.example.starscream.firstapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UpcommingEventsAdapter extends RecyclerView.Adapter<UpcommingEventsAdapter.MyViewHolder> {
    private ArrayList<UpcomingEventsItem> mUpcommingEventsList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mEventDate;
        public TextView mEventName;
        public TextView mEventTime;

        public MyViewHolder (View itemView) {
            super(itemView);
            mEventDate = itemView.findViewById(R.id.event_date);
            mEventName = itemView.findViewById(R.id.event_name);
            mEventTime = itemView.findViewById(R.id.event_time);
        }
    }

    public UpcommingEventsAdapter(ArrayList<UpcomingEventsItem> upcommingEventsList) {
        mUpcommingEventsList = upcommingEventsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_events_item, parent, false);
        MyViewHolder evh = new MyViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull UpcommingEventsAdapter.MyViewHolder holder, int position) {
        UpcomingEventsItem currentItem = mUpcommingEventsList.get(position);

        holder.mEventDate.setText(currentItem.getmEventDate());
        holder.mEventName.setText(currentItem.getmEventName());
        holder.mEventTime.setText(currentItem.getmEventTime());
    }

    @Override
    public int getItemCount() {
        return mUpcommingEventsList.size();
    }
}
