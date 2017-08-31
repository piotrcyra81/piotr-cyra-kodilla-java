package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser("Jan Kowalski", 'M', 1990,
                "01",10));
        userList.add(new ForumUser("Maria Nowak", 'F', 2000,
                "02", 20));
        userList.add(new ForumUser("Maciej Kwiatkowski", 'M', 2010,
                "03", 30));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}