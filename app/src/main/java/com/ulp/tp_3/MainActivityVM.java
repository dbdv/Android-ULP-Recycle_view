package com.ulp.tp_3;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;

import com.ulp.tp_3.models.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityVM extends ViewModel {
    private MutableLiveData<List<Movie>> movies = new MutableLiveData<>(
            Arrays.asList(
                    new Movie("Piratas del Caribe", "Piratas en busca de tesoros", "Espen Sandberg", "Johnny Depp", R.drawable.piratas_del_caribe_cover),
                    new Movie("Buscando a Nemo", "Un pez en busca de su hijo", "Andrew Staton", "Albert Brooks", R.drawable.buscando_a_nemo_cover),
                    new Movie("John Wick", "Un mercenario retirado que vuelve a la acción", "Chad Stahelski", "Keanu Reaves", R.drawable.john_wick_cover)
            )
    );

    public MutableLiveData<List<Movie>> getMovies() {
        return movies;
    }

    public void setMovies(MutableLiveData<List<Movie>> movies) {
        this.movies = movies;
    }
}
