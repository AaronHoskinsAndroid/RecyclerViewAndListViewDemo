package examples.aaronhoskins.com.recyclerviewandlistviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import examples.aaronhoskins.com.recyclerviewandlistviewdemo.model.Movies;

public class MainActivity extends AppCompatActivity {
    ArrayList<Movies> movieList = new ArrayList<>();
    RecyclerView rvMovieRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        startActivity(new Intent(this, ListViewActivity.class));
//        finish();
        populateMovieList();
        initializeRecyclerView();


    }

    private void initializeRecyclerView() {
        rvMovieRecyclerView = findViewById(R.id.rvMovieRecyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        MovieRecyclerViewAdapter movieRecyclerViewAdapter = new MovieRecyclerViewAdapter(movieList);

        rvMovieRecyclerView.setLayoutManager(layoutManager);
        rvMovieRecyclerView.setAdapter(movieRecyclerViewAdapter);

        //Gather some input for new movie to add to list****
        Movies movies = new Movies();//Movie you created
        movieRecyclerViewAdapter.addMovie(movies);

    }

    private void populateMovieList() {
        movieList.add(new Movies("Avengers", "PG13", "People dont want the snap", "2012", "Disney"));
        movieList.add(new Movies("Super Man", "PG13", "Man who gets high all the time", "2013", "Disney"));
        movieList.add(new Movies("Star Wars", "PG13", "You are the father....IN SPACE", "2014", "Disney"));
        movieList.add(new Movies("Star Trek", "PG13", "Beam me up", "2015", "Disney"));
        movieList.add(new Movies("Van Wilder", "R", "No  one really knows", "2010", "Disney"));
        movieList.add(new Movies("Fight Club", "R", "I can not talk about it", "2001", "Disney"));
        movieList.add(new Movies("Dazed and Confused", "PG13", "It be alot cooler if you did", "2010", "Disney"));
        movieList.add(new Movies("Half Baked", "PG13", "Making cookies", "2010", "Disney"));
        movieList.add(new Movies("Fear and Loathing in Los Vegas", "R", "BATS!!!!", "2019", "Disney"));
        movieList.add(new Movies("ET", "PG", "Best example why never leave the group at a rest stop", "2004", "Disney"));
        movieList.add(new Movies("John Wick", "R", "PETA gone bad ass", "2005", "Disney"));
        movieList.add(new Movies("Matrix", "PG13", "There is no movie", "2007", "Disney"));

    }

}
