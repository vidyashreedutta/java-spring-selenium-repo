package com.jpa.example.jpademo.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class QuoteServiceTest {

    @InjectMocks
    QuoteService quoteService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testQuoteService() {
        String output = quoteService.getAQuote();
        System.out.println(output);
        boolean checkOut =  checkOutput(output);
        assertEquals(true,checkOut);

    }

    private boolean checkOutput(String output) {
        return output != null;
    }
}