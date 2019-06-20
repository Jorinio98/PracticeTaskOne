package com.vivatconsulting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWordsCounter {

    @Test(priority = 2)
    public void testWordsCounter(){

        Assert.assertEquals(WordsCounter.numberOfWords("Ronald macdonald lol or lolipops ???"),6 );


    }

    @Test( expectedExceptions = NullPointerException.class)
    public void testWordsCounterOnExceptions(){
        WordsCounter.numberOfWords("");

    }
}
