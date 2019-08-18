package com.htp;

import java.util.Objects;
import java.util.StringJoiner;

public class Author {
    private final String firsName;
    private final String lastName;
    private final String parentalName;


    public Author(String firsName, String lastName, String parentalName) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.parentalName = parentalName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getParentalName() {
        return parentalName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firsName, author.firsName) &&
                Objects.equals(lastName, author.lastName) &&
                Objects.equals(parentalName, author.parentalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName, parentalName);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Author.class.getSimpleName() + "[", "]")
                .add("firsName='" + firsName + "'")
                .add("lastName='" + lastName + "'")
                .add("parentalName='" + parentalName + "'")
                .toString();
    }
}
