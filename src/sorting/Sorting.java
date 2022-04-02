package com.company;

import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<com.company.Movie> list = new ArrayList<com.company.Movie>();
        list.add(new com.company.Movie(8.1,"How to Train Your Dragon",2010));
        list.add(new com.company.Movie(8.3,"Avengers: Endgame",2019));
        list.add(new com.company.Movie(8.3,"Your Name",2016));
        list.add(new com.company.Movie(8.2,"Toy Story 3",2010));
        list.add(new com.company.Movie(8.4,"Avengers: Infinity War",2018));
        System.out.println("Movies before sorting : ");
        for (com.company.Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
        Collections.sort(list);
        System.out.println("\nMovies after sorting : ");
        for (com.company.Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
    }
}
