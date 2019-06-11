package examples.aaronhoskins.com.recyclerviewandlistviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import examples.aaronhoskins.com.recyclerviewandlistviewdemo.model.Movies;

public class MovieRecyclerViewAdapter
        extends RecyclerView.Adapter<MovieRecyclerViewAdapter.ViewHolder> {
    private ArrayList<Movies> movieList;

    public MovieRecyclerViewAdapter(ArrayList<Movies> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.movie_item, parent, false);
        //ViewHolder viewHolder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Movies itemsMovie = movieList.get(position);
        holder.tvTitle.setText(itemsMovie.getTitle());
        holder.tvDescription.setText(itemsMovie.getDescription());
        holder.tvStudio.setText(itemsMovie.getStudio());
        holder.tvRating.setText(itemsMovie.getParentRating());
        holder.tvYear.setText(itemsMovie.getReleaseYear());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), itemsMovie.getTitle(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public void addMovie(Movies movie) {
        movieList.add(movie);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvDescription;
        TextView tvRating;
        TextView tvStudio;
        TextView tvYear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvYear = itemView.findViewById(R.id.tvYear);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvRating = itemView.findViewById(R.id.tvRating);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvStudio = itemView.findViewById(R.id.tvStudio);
        }
    }
}
