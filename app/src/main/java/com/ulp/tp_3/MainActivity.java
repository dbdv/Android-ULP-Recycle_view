package com.ulp.tp_3;

import androidx.appcompat.app.AppCompatActivity;
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
    private Context context;
    private ArrayList<Movie> movies = new ArrayList<Movie>(
            Arrays.asList(
                    new Movie("Piratas del Caribe", "Piratas en busca de tesoros", "Espen Sandberg", "Johnny Depp", R.drawable.piratas_del_caribe_cover),
                    new Movie("Buscando a Nemo", "Un pez en busca de su hijo", "Andrew Staton", "Albert Brooks", R.drawable.buscando_a_nemo_cover),
                    new Movie("John Wick", "Un mercenario retirado que vuelve a la acción", "Chad Stahelski", "Keanu Reaves", R.drawable.john_wick_cover)
            )
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        context = getApplicationContext();
        RecyclerView recyclerView = binding.moviesRecycleView;

        GridLayoutManager grid = new GridLayoutManager(context, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(grid);

        MainActivityAdapter adapter = new MainActivityAdapter(context, movies, getLayoutInflater());
        recyclerView.setAdapter(adapter);
    }
}