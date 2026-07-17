package Homework10.Task1;

import java.util.Objects;

public class User {
    private final int id;
    private final String username;
    private final String firstname;
    private final String surname;

    public User(int id, String username, String firstname, String surname) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + surname + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, firstname, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(firstname, user.firstname) &&
                Objects.equals(surname, user.surname);
    }
}