package com.kodilla.testing.forum.statistics;


public class UserStatistic {

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    int avgNumberOfPostsPerUser;
    int avgNumberOfCommentsPerUser;
    int avgNumberOfCommentsOnPost;

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgNumberOfPostsPerUser = numberOfPosts / numberOfUsers;
        avgNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        avgNumberOfCommentsOnPost = numberOfComments / numberOfPosts;
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