package fr.kata.unit.test.examples;

import java.util.Arrays;
import java.util.List;

public class ListExamples {

    static class Movie {
        private final String name;
        private final int year;

        public Movie(String name, int year) {
            this.name = name;
            this.year = year;
        }
    }

    private static List<Movie> givenDummyMovies() {
        // @formatter:off
        return Arrays.asList(
                new Movie("Lord of the Rings", 2001),
                new Movie("Avengers", 2012),
                new Movie("Léon", 1994),
                new Movie("OSS 117 : Rio ne répond plus", 2009),
                new Movie("300", 2007));
        // @formatter:on
    }

    // TODO : écrire une fonction qui ne retourne que les films plus vieux que X (année passée en paramètre)

}
