package com.mkyong.web.controller;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;

import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class WelcomeController_index_d7178e4840_Test {

    @InjectMocks
    WelcomeController welcomeController;

    @Mock
    Model model;

    @Mock
    Logger logger;

    private String getMessage() {
        return "Welcome to mkyong.com...";
    }

    @Before
    public void setUp() throws Exception {
        welcomeController = new WelcomeController();
        model = Mockito.mock(Model.class);
        logger = LoggerFactory.getLogger(WelcomeController.class);
        doNothing().when(logger).debug(getMessage());
    }

    @Test
    public void testIndex() {
        String msg = getMessage();
        Date today = new Date();
        when(model.addAttribute("msg", msg)).thenReturn(model);
        when(model.addAttribute("today", today)).thenReturn(model);

        String result = welcomeController.index(model);
        assertEquals("index", result);
    }

    @Test
    public void testIndexWithDifferentMessage() {
        String msg = "Different message";
        Date today = new Date();
        when(model.addAttribute("msg", msg)).thenReturn(model);
        when(model.addAttribute("today", today)).thenReturn(model);

        String result = welcomeController.index(model);
        assertEquals("index", result);
    }

    @Test
    public void testIndexWithNullMessage() {
        String msg = null;
        Date today = new Date();
        when(model.addAttribute("msg", msg)).thenReturn(model);
        when(model.addAttribute("today", today)).thenReturn(model);

        String result = welcomeController.index(model);
        assertEquals("index", result);
    }
}
