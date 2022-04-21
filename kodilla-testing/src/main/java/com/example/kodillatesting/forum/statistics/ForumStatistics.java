package com.example.kodillatesting.forum.statistics;

import com.example.kodillatesting.forum.ForumUser;

public class ForumStatistics {

    private Statistics statistics;
    public int totalUsers;
    public int totalComments;
    public int totalPosts;
    public double averageCommentsPerUser;
    public double averagePostsPerUser;
    public double averageCommentsPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(int totalComments) {
        this.totalComments = totalComments;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(int totalPosts) {
        this.totalPosts = totalPosts;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public void setAverageCommentsPerUser(double averageCommentsPerUser) {
        this.averageCommentsPerUser = averageCommentsPerUser;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public void setAveragePostsPerUser(double averagePostsPerUser) {
        this.averagePostsPerUser = averagePostsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void setAverageCommentsPerPost(double averageCommentsPerPost) {
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
    totalUsers = statistics.usersNames().size();
    totalComments = statistics.commentsCount();
    totalPosts = statistics.postsCount();
    averageCommentsPerUser = (double) totalComments / totalUsers;
    averagePostsPerUser = (double) totalPosts / totalUsers;
    averageCommentsPerPost = (double) totalComments / totalPosts;
}
}
