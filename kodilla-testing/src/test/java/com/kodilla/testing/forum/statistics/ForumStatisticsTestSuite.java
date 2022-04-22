package com.kodilla.testing.forum.statistics;

import com.example.kodillatesting.forum.ForumUser;
import com.example.kodillatesting.forum.statistics.ForumStatistics;
import com.example.kodillatesting.forum.statistics.Statistics;
import com.example.kodillatesting.library.Book;
import org.hamcrest.number.IsNaN;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.NaN;
import static org.mockito.Answers.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics stats;

    private List<String> generateUsers(int usersCount) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersCount; n++) {
            String user = "user" + n;
            resultList.add(user);
        }
        return resultList;
    }


    @Test
    void testCaseAvg100UsersPer0PostAnd0Comments() {
        // Given
        ForumStatistics forumStats = new ForumStatistics(stats);
        List<String> users100 = generateUsers(100);
        int posts0 = 0;
        int comments0 = 0;
        when(stats.usersNames()).thenReturn(users100);
        when(stats.postsCount()).thenReturn(posts0);
        when(stats.commentsCount()).thenReturn(comments0);
        // When
        forumStats.calculateAdvStatistics(stats);
        // Then
        Assertions.assertEquals(0,forumStats.getAveragePostsPerUser());
        Assertions.assertEquals(0,forumStats.getAverageCommentsPerUser());
    }

    @Test
    void testCaseAvg0UsersPer0PostsAnd0Comments() {
        // Given
        ForumStatistics forumStats = new ForumStatistics(stats);
        List<String> users0 = generateUsers(0);
        int posts0 = 0;
        int comments0 = 0;
        when(stats.usersNames()).thenReturn(users0);
        when(stats.postsCount()).thenReturn(posts0);
        when(stats.commentsCount()).thenReturn(comments0);
        // When
        forumStats.calculateAdvStatistics(stats);
        // Then
        Assertions.assertEquals(NaN,forumStats.getAveragePostsPerUser());
        Assertions.assertEquals(NaN,forumStats.getAverageCommentsPerUser());

    }

    @Test
    void testCaseAvg1000CommentsPer100Posts() {
        // Given
        ForumStatistics forumStats = new ForumStatistics(stats);
        int posts = 1000;
        int comments = 100;
        when(stats.postsCount()).thenReturn(posts);
        when(stats.commentsCount()).thenReturn(comments);
        // When
        forumStats.calculateAdvStatistics(stats);
        // Then
        Assertions.assertEquals(0.1,forumStats.getAverageCommentsPerPost());
    }

    @Test
    void testCaseAvg100CommentsPer100Posts() {
        // Given
        ForumStatistics forumStats = new ForumStatistics(stats);
        int posts = 100;
        int comments = 1000;
        when(stats.postsCount()).thenReturn(posts);
        when(stats.commentsCount()).thenReturn(comments);
        // When
        forumStats.calculateAdvStatistics(stats);
        // Then
        Assertions.assertEquals(10,forumStats.getAverageCommentsPerPost());
    }
}
