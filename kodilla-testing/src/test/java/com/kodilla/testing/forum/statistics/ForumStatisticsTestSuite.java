package com.kodilla.testing.forum.statistics;

import com.example.kodillatesting.forum.statistics.ForumStatistics;
import com.example.kodillatesting.forum.statistics.Statistics;
import org.junit.jupiter.api.*;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Mock
    private Statistics stats;

    @Test
    void testCaseAverageCommentsPerUser() {
        // Given
        ForumStatistics forumStats = new ForumStatistics(stats);
        int posts = 1000;
        int users = 100;
        when(stats.usersNames().size()).thenReturn(users);
        when(stats.postsCount()).thenReturn(posts);
        // When
        forumStats.calculateAdvStatistics(stats);
        // Then
        Assertions.assertEquals(10.0,forumStats.getAveragePostsPerUser());
    }
}
