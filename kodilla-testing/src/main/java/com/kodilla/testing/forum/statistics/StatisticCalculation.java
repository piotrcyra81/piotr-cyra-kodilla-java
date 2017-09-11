package com.kodilla.testing.forum.statistics;

public class StatisticCalculation {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int avgNumberOfPostsPerUser;
    private int avgNumberOfCommentsPerUser;
    private int avgNumberOfCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        avgNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        avgNumberOfCommentsOnPost = numberOfComments / numberOfPosts;
    }

    public void showStatistics() {
        System.out.println("numberOfUsers: " + numberOfUsers);
        System.out.println("numberOfPosts: " + numberOfPosts);
        System.out.println("numberOfComments: " + numberOfComments);
        System.out.println("avgNumberOfPostsPerUser: " + avgNumberOfPostsPerUser);
        System.out.println("avgNumberOfCommentsPerUser: " + avgNumberOfCommentsPerUser);
        System.out.println("avgNumberOfCommentsOnPost: " + avgNumberOfCommentsOnPost);
    }

    int getNumberOfUsers() {
        return numberOfUsers;
    }

    int getNumberOfPosts() {
        return numberOfPosts;
    }

    int getNumberOfComments() {
        return numberOfComments;
    }

    int getAvgNumberOfPostsPerUser() {
        return avgNumberOfPostsPerUser;
    }

    int getAvgNumberOfCommentsPerUser() {
        return avgNumberOfCommentsPerUser;
    }

    int getAvgNumberOfCommentsOnPost() {
        return avgNumberOfCommentsOnPost;
    }
}