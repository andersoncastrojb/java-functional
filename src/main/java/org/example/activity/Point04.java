package org.example.activity;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Point04 {

    static class Books {
        private String name;
        private String author;
        private Integer score;

        public Books(String name, String author, Integer score) {
            this.name = name;
            this.author = author;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Books{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", score='" + score + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Supplier<Books> adventureBook = () -> new Books("Indiana jones", "George Lucas", 9);
        Supplier<Books> horrorBook = () -> new Books("The thing", "unknown", 6);
        Supplier<Books> romanceBook = () -> new Books("stand of kisses", "unknown", 8);

        Predicate<Integer> scoreIsGreaterOrEqualThanSeven = s -> s >= 7;

        UnaryOperator<String> messageWhenBookIsRecommended = s -> "The book " + s + " is recommended";

        Consumer<Books> validateScore = b -> {
            if( scoreIsGreaterOrEqualThanSeven.test( b.getScore() ) ) {
                System.out.println( messageWhenBookIsRecommended.apply( b.name ) );
            }
        };

        Books books01 = adventureBook.get();
        Books books02 = horrorBook.get();
        Books books03 = romanceBook.get();

        validateScore.accept(books01);
        validateScore.accept(books02);
        validateScore.accept(books03);
    }
}
