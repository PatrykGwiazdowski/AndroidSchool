package com.company;

import junit.framework.Assert;

/**
 *
 * Testing class
 */
public class MakKwakQueueTest {

    @org.junit.Test
    public void testGetAllQuotes() {
        MakKwakQueue queue = new MakKwakQueue(3);
        Assert.assertEquals("1.\n2.\n3.Mak\n",queue.getAllQuotes());
        queue = new MakKwakQueue(0);
        Assert.assertEquals("",queue.getAllQuotes());
    }
    @org.junit.Test
    public void testGetQuote(){
        MakKwakQueue queue = new MakKwakQueue(0);
        Assert.assertEquals("",queue.getQuote(2));
        Assert.assertEquals("Mak",queue.getQuote(3));
        Assert.assertEquals("Kwak",queue.getQuote(5));
        Assert.assertEquals("MakKwak",queue.getQuote(15));
    }
}