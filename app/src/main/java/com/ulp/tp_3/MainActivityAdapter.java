package com.ulp.tp_3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ulp.tp_3.models.Movie;

import java.util.List;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

    private Context context;
    private List<Movie> movies;
    private LayoutInflater inflater;

    public MainActivityAdapter(Context context, List<Movie> movies, LayoutInflater inflater) {
        this.context = context;
        this.movies = movies;
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public MainActivityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = inflater.inflate(R.layout.movie_item, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull MainActivityAdapter.ViewHolder holder, int position) {
        holder.title.setText(movies.get(position).getTitle());
        holder.director.setText(movies.get(position).getDirector());
        holder.cover_image.setImageResource(movies.get(position).getCover_id());
        holder.to_details_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("movie", movies.get(position));
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("movie", bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder {

        ImageView cover_image;
        TextView title, director;
        Button to_details_btn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cover_image = itemView.findViewById(R.id.cover_image);
            title = itemView.findViewById(R.id.title);
            director = itemView.findViewById(R.id.director);
            to_details_btn = itemView.findViewById(R.id.details_btn);
        }
    }
}
