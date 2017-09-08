package com.kodilla.testing.forum.statistics;

public class StatisticCalculation {
    private int numberOfUsers;
    private int posts;
    private int numberOfComments;
    private int avgNumberOfPostsPerUser;
    private int avgNumberOfCommentsPerUser;
    private int avgNumberOfCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        posts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgNumberOfPostsPerUser = posts / numberOfUsers;
        avgNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        avgNumberOfCommentsOnPost = numberOfComments / posts;
    }
    public void showStatistics() {
        System.out.println("numberOfUsers: " + numberOfUsers);
        System.out.println("posts: " + posts);
        System.out.println("numberOfComments: " + numberOfComments);
        System.out.println("avgNumberOfPostsPerUser: " + avgNumberOfPostsPerUser);
        System.out.println("avgNumberOfCommentsPerUser: " + avgNumberOfCommentsPerUser);
        System.out.println("avgNumberOfCommentsOnPost: " + avgNumberOfCommentsOnPost);
    }
    int getnumberOfUsers() {
        return numberOfUsers;
    }
    int getPosts() {
        return posts;
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