package com.ulp.tp_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.widget.SimpleAdapter;

import com.ulp.tp_3.databinding.ActivityMainBinding;
import com.ulp.tp_3.databinding.MovieDetailsCardBinding;
import com.ulp.tp_3.models.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityVM viewModel;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = getApplicationContext();
        RecyclerView recyclerView = binding.moviesRecycleView;

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityVM.class);

        GridLayoutManager grid = new GridLayoutManager(context, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(grid);

        MainActivityAdapter adapter = new MainActivityAdapter(context, viewModel.getMovies().getValue(), getLayoutInflater());
        recyclerView.setAdapter(adapter);
    }
}