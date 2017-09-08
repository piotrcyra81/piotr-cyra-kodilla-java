package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class ForumStatisticsTest {
    @Before
    public void listOfUsers() {
        List<String> forumUsersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            forumUsersList.add(i, "forumUser");
        }
    }
    @Test
    public void testWhenNumberOfPostAndCommentsIsThousand() {
        Statistics statisticsMock = mock(Statistics.class);

        Mockito.when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(1000);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);

        StatisticCalculation newStatistics = new StatisticCalculation();
        newStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(10, newStatistics.getAvgNumberOfPostsPerUser());
        Assert.assertEquals(10, newStatistics.getAvgNumberOfCommentsPerUser());
        Assert.assertEquals(1, newStatistics.getAvgNumberOfCommentsOnPost());
    }

    @Test
    public void testWhenNumberOfPostAndCommentsIsZero() {
        Statistics statisticsMock = mock(Statistics.class);


        Mockito.when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(0);
        Mockito.when(statisticsMock.postsCount()).thenReturn(0);

        StatisticCalculation newStatistics = new StatisticCalculation();
        newStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(0, newStatistics.getAvgNumberOfPostsPerUser());
        Assert.assertEquals(0, newStatistics.getAvgNumberOfCommentsPerUser());
        Assert.assertEquals(0, newStatistics.getAvgNumberOfCommentsOnPost());
    }

    @Test
    public void testWhenNumberOfCommentsIsBiggerThenPosts() {
        Statistics statisticsMock = mock(Statistics.class);

        Mockito.when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(10);
        Mockito.when(statisticsMock.postsCount()).thenReturn(1000);

        StatisticCalculation newStatistics = new StatisticCalculation();
        newStatistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(0, newStatistics.getAvgNumberOfPostsPerUser());
        Assert.assertEquals(0, newStatistics.getAvgNumberOfCommentsPerUser());
        Assert.assertEquals(0, newStatistics.getAvgNumberOfCommentsOnPost());
    }
}