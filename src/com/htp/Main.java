package com.htp;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //    3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить
        //    * в класс Book для автора книги).

        final Set<Book> books = books();

        books
                .stream()
                .sorted(Comparator.comparing(book -> book.getAuthor().getFirsName()))
                .forEach(System.out::println);
    }

    private static Set<Book> books() {
        final Set<Book> result = new HashSet<>();

        result.add(new Book("The Great Gatsby", new Author("Scott", "Fitzgerald", null)));
        result.add(new Book("The Great Gatsby", new Author("Scott", "Fitzgerald", null)));
        result.add(new Book("The Great Gatsby", new Author("Scott", "Fitzgerald", null)));
        result.add(new Book("The Great Gatsby", new Author("Scott", "Fitzgerald", null)));
        result.add(new Book("The Great Gatsby", new Author("Scott", "Fitzgerald", null)));
        result.add(new Book("The Great Gatsby", new Author("Scott", "Fitzgerald", null)));
        result.add(new Book("The Great Gatsby", new Author("Scott", "Fitzgerald", null)));
        result.add(new Book("To Kill a Mockingbird", new Author("Harper", "Lee", null)));
        result.add(new Book("To Kill a Mockingbird", new Author("Harper", "Lee", null)));
        result.add(new Book("To Kill a Mockingbird", new Author("Harper", "Lee", null)));
        result.add(new Book("Harry Potter and the Sorcerer's Stone", new Author("J", "K", "R")));
        result.add(new Book("Harry Potter and the Sorcerer's Stone", new Author("J", "K", "R")));
        result.add(new Book("Harry Potter and the Sorcerer's Stone", new Author("J", "K", "R")));
        result.add(new Book("1984", new Author("George", "Orwell", null)));
        result.add(new Book("1984", new Author("George", "Orwell", null)));
        result.add(new Book("1984", new Author("George", "Orwell", null)));
        result.add(new Book("The Catcher in the Rye", new Author("J", "Salinger", null)));
        result.add(new Book("The Catcher in the Rye", new Author("J", "Salinger", null)));
        result.add(new Book("The Catcher in the Rye", new Author("J", "Salinger", null)));
        result.add(new Book("The Hobbit", new Author("J", "R", "R")));
        result.add(new Book("The Hobbit", new Author("J", "R", "R")));
        result.add(new Book("The Hobbit", new Author("J", "R", "R")));
        result.add(new Book("Fahrenheit 451", new Author("Ray", "Bradbury", null)));
        result.add(new Book("Anna Karenina", new Author("Leo", "Tolstoy", null)));
        result.add(new Book("Anna Karenina", new Author("Leo", "Tolstoy", null)));
        result.add(new Book("Anna Karenina", new Author("Leo", "Tolstoy", null)));
        result.add(new Book("War and Peace", new Author("Leo", "Tolstoy", null)));
        result.add(new Book("War and Peace", new Author("Leo", "Tolstoy", null)));
        result.add(new Book("War and Peace", new Author("Leo", "Tolstoy", null)));
        result.add(new Book("Middlemarch", new Author("George", "Fitzgerald", null)));
        result.add(new Book("Middlemarch", new Author("George", "Fitzgerald", null)));
        result.add(new Book("Middlemarch", new Author("George", "Fitzgerald", null)));
        result.add(new Book("The Adventures of Huckleberry Finn", new Author("Mark", "Twain", null)));
        result.add(new Book("The Adventures of Huckleberry Finn", new Author("Mark", "Twain", null)));
        result.add(new Book("The Adventures of Huckleberry Finn", new Author("Mark", "Twain", null)));

        return result;
    }
}

