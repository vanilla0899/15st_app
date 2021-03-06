package com.example.a11st_app1;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoiveAdapter extends RecyclerView.Adapter<MoiveAdapter.ViewHolder>{
    ArrayList<Movie> items = new ArrayList<Movie>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {

        Movie item = items.get(position);
        viewholder.setItem(item);


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Movie item){
        items.add(item);
    }

    public void setItems(ArrayList<Movie> items){
        this.items = items;
    }

    public Movie getItem(int position){
        return items.get(position);
    }


    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView movieName;
        TextView whenstart;
        TextView totpeople;
        TextView myrank;
        TextView moneys;

        public ViewHolder(View itemView){
            super(itemView);
            movieName = itemView.findViewById(R.id.movieName);
            whenstart = itemView.findViewById(R.id.whenstart);
            totpeople = itemView.findViewById(R.id.totpeople);
            myrank = itemView.findViewById(R.id.myrank);
            moneys = itemView.findViewById(R.id.moneys);
        }
        public void setItem(Movie item) {

            movieName.setText(item.movieNm);
            whenstart.setText("개봉일:"+item.openDt);
            totpeople.setText("누적관객수:"+item.audiAcc);
            myrank.setText(item.rank+"위");
            moneys.setText("누적매출액: "+item.salesAcc+"원");




        }
    }
}
