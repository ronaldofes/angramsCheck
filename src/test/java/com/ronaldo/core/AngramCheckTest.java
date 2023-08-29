package com.ronaldo.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AngramCheckTest {


    private final AnagramCheck victim = new AnagramCheck();

    @Test
    void shouldReturnFalseWhenOnlySpacesGiven(){
        String word1 = "  ";
        String word2 = "  ";
        assertFalse(victim.isAnagram(word1,word2));
    }

    @Test
    void shouldReturnFalseWhenOnlyHasSpacesInSecondValue(){
        String word1 = "value";
        String word2 = "  ";
        assertFalse(victim.isAnagram(word1,word2));
    }
    @Test
    void shouldReturnTrueWhenTwoAngramsGiven(){
        String word1 = "DAdo";
        String word2 = "DOda";
        assertTrue(victim.isAnagram(word1,word2));
    }

    @Test
    void shouldReturnFalseWhenTwoDifferentsLenghtGiven(){
        String word1 = " daa";
        String word2 = "da";
        assertFalse(victim.isAnagram(word1,word2));
    }

    @Test
    void shouldReturnTrueWhenTwoAnagramsSentencesGiven(){
        String word1 = "William Shakespeare";
        String word2 = "I am a weakish speller";
        assertTrue(victim.isAnagram(word1,word2));
    }

    @Test
    void shouldReturnFalseWhenSpecialCharGiven(){
        String word1 = "New York Times!!";
        String word2 = "!!monkeys write";
        assertFalse(victim.isAnagram(word1,word2));
    }


    @Test
    void shouldReturnErrorWhenValueIsNull(){
        String word1 = null;
        String word2 = "!!monkeys write";
        Exception exception = assertThrows(NullPointerException.class,
              ()-> victim.isAnagram(word1,word2));
        assertEquals("Provide a non null value", exception.getMessage());
    }
}
