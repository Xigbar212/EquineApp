package com.example.starscream.firstapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecordsAdapter extends RecyclerView.Adapter<RecordsAdapter.MyViewHolder> {
    private ArrayList<RecordsItem> mRecordsList;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mtestName;
        public TextView mtestScore;
        public TextView mhorseName;
        public TextView mtestDate;

        public MyViewHolder (View itemView) {
            super(itemView);
            mtestName = itemView.findViewById(R.id.test_name);
            mtestScore = itemView.findViewById(R.id.test_score);
            mhorseName = itemView.findViewById(R.id.horse_name);
            mtestDate = itemView.findViewById(R.id.test_date);
        }
    }

    public RecordsAdapter(ArrayList<RecordsItem> recordList) {
        mRecordsList = recordList;
    }

    @NonNull
    @Override
    public RecordsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.records_item, parent, false);
        MyViewHolder evh = new MyViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecordsAdapter.MyViewHolder holder, int position) {
        RecordsItem currentItem = mRecordsList.get(position);

        holder.mtestName.setText(currentItem.getMtestName());
        holder.mtestScore.setText(currentItem.getMtestScore());
        holder.mhorseName.setText(currentItem.getMhorseName());
        holder.mtestDate.setText(currentItem.getMtestDate());
    }

    @Override
    public int getItemCount() {
        return mRecordsList.size();
    }
}
