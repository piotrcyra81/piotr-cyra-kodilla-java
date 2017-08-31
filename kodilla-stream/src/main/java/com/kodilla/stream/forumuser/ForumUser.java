package com.kodilla.stream.forumuser;

public final class ForumUser {
    private final String userName;
    private final char sex;
    private final int yearOfBirth;
    private final String idUser;
    private final int numberOfPost;

    public ForumUser(final String userName, final char sex, final int yearOfBirth, final String idUser, final int numberOfPost) {
        this.userName = userName;
        this.sex = sex;
        this.idUser = idUser;
        this.numberOfPost = numberOfPost;
        this.yearOfBirth = yearOfBirth;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public String getIdUser() {
        return idUser;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    @Override
    public String toString() {
        return "Forum User{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDate='" + yearOfBirth + '\'' +
                ", idUser=" + idUser +
                ", numberOfPost='" + numberOfPost + '\'' +
                '}';
    }
}