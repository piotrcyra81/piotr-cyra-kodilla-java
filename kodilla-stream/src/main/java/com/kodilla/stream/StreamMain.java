package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theUserDirectory = new Forum();

        Map<String, ForumUser> theResultOfUsers = theUserDirectory.getUserList().stream()
                .filter(forumuser -> forumuser.getSex() == 'M')
                .filter(forumuser -> forumuser.getNumberOfPost() > 1)
                .filter(forumuser -> forumuser.getYearOfBirth() > 1997)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumuser -> forumuser));

        System.out.println("# elements: " + theResultOfUsers.size());
        theResultOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}