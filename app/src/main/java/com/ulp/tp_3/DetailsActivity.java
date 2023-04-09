package com.ulp.tp_3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ulp.tp_3.databinding.MovieDetailsCardBinding;
import com.ulp.tp_3.models.Movie;

public class DetailsActivity extends AppCompatActivity {

    MovieDetailsCardBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MovieDetailsCardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getBundleExtra("movie");
        Movie movie = (Movie) bundle.getSerializable("movie");
        Log.d("info pa ver", movie.getTitle());
        binding.detailsCoverImage.setImageResource(movie.getCover_id());
        binding.detailsTitle.setText(movie.getTitle());
        binding.detailsDirector.setText(movie.getDirector());
        binding.detailsPlot.setText(movie.getPlot());
        binding.detailsProtagonists.setText(movie.getProtagosits());
        binding.detailsBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}