package com.example.starscream.firstapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.MyViewHolder> {
    private ArrayList<ArticleItem> mArticleList;
    
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView mArticleImage;
        public TextView mArticleTitle;
        public TextView mArticleInfo;

        public MyViewHolder (View itemView) {
            super(itemView);
            mArticleImage = itemView.findViewById(R.id.news_image);
            mArticleTitle = itemView.findViewById(R.id.article_title);
            mArticleInfo = itemView.findViewById(R.id.article_info);
        }
    }

    public ArticleAdapter(ArrayList<ArticleItem> articleList) {
        mArticleList = articleList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.articles_item, parent, false);
        MyViewHolder evh = new MyViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ArticleItem currentItem = mArticleList.get(position);

        holder.mArticleImage.setImageResource(currentItem.getArticleImage());
        holder.mArticleTitle.setText(currentItem.getArticleTitle());
        holder.mArticleInfo.setText(currentItem.getArticleInfo());
    }

    @Override
    public int getItemCount() {
        return mArticleList.size();
    }
}
