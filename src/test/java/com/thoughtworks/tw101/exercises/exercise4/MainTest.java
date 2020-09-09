package com.thoughtworks.tw101.exercises.exercise4;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class MainTest extends TestCase {

    @Test
    public void shouldReturnBookTitlesFromPartialBookTitle(){
        String[] books = {
                "Harry Potter and the Sorcerer's Stone",
                "An Introduction to Pottery",
                "Sorcerer Intro",
                "To the Stone-Cutters"
        };

        Library library = new Library(books, System.out);
        String[] actualFoundBooks = library.printBooksContaining("Potter");
        String[] expectedFoundBooks =
                Arrays.stream(books).filter(book -> book.contains("Potter")).toArray(String[]::new);

        assertEquals(actualFoundBooks, expectedFoundBooks);
    }

    @Test
    public void shouldNotFindBooksWhenListIsEmpty(){
        String[] books = {};
        Library library = new Library(books, System.out);
        String[] actualFoundBooks = library.printBooksContaining("Potter");
        String[] expectedFoundBooks = new String[] {};

        assertEquals(actualFoundBooks, expectedFoundBooks);
    }

//    @Test
//    public void shouldReturnBlankWhenThereIsNoMatchForPartialBookTitle(){
//
//    }
}