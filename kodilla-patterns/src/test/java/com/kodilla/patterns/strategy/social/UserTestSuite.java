package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User youngUser = new ZGeneration("ZGeneration");
        User middleUser = new YGeneration("YGeneration");
        User oldUser = new Millenials("Millennials");

        //When
        String youngShare = youngUser.sharePost();
        System.out.println("young user:" + youngShare);
        String middleShare = middleUser.sharePost();
        System.out.println("middle user:" + middleShare);
        String oldShare = oldUser.sharePost();
        System.out.println("old user:" + oldShare);

        //Then
        assertEquals(oldShare, "Facebook Post Shared.");
        assertEquals(middleShare, "Twitter Post Shared.");
        assertEquals(youngShare, "Snapchat Post Shared.");
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User youngUser = new ZGeneration("ZGeneration");
        //When
        String fromMethodShare = youngUser.sharePost();
        System.out.println("fromMethodShare:" + fromMethodShare);

        youngUser.setSocialPublisher(new FacebookPublisher());
        fromMethodShare = youngUser.sharePost();
        System.out.println("newYoungAgeSocial:" + fromMethodShare);

        //Then
        assertEquals("Facebook Post Shared.", fromMethodShare);
    }
}