package com.mkyong.web;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

public class WebInitializer_getServletMappings_2bb0527148_Test {

    private WebInitializer webInitializer;

    @Before
    public void setUp() {
        webInitializer = new WebInitializer();
    }

    @Test
    public void testGetServletMappings() {
        String[] expectedMapping = {"/"};
        String[] actualMapping = webInitializer.getServletMappings();
        assertArrayEquals(expectedMapping, actualMapping);
    }

    @Test
    public void testGetServletMappingsFailure() {
        String[] expectedMapping = {"/api"};
        String[] actualMapping = webInitializer.getServletMappings();
        assertArrayEquals("Servlet mappings do not match", expectedMapping, actualMapping);
    }

    @Test
    public void testGetServletMappingsWithIncorrectMapping() {
        String[] incorrectMapping = {"/incorrect"};
        String[] actualMapping = webInitializer.getServletMappings();
        assertNotEquals("Servlet mappings should not match", incorrectMapping, actualMapping);
    }
}
