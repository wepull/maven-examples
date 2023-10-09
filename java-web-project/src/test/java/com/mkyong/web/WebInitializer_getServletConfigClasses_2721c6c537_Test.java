package com.mkyong.web;

import org.junit.Assert;
import org.junit.Test;

public class WebInitializer_getServletConfigClasses_2721c6c537_Test {

    private final WebInitializer webInitializer = new WebInitializer();

    @Test
    public void testGetServletConfigClasses_Success() {
        Class<?>[] classes = webInitializer.getServletConfigClasses();

        // Assert that the returned array is not null
        Assert.assertNotNull(classes);

        // Assert that the returned array has exactly one element
        Assert.assertEquals(1, classes.length);
    }

    @Test
    public void testGetServletConfigClasses_Failure() {
        Class<?>[] classes = webInitializer.getServletConfigClasses();

        // Assert that the returned array is not null
        Assert.assertNotNull(classes);
    }

    @Test
    public void testGetServletConfigClasses_UpdatedTest() {
        Class<?>[] classes = webInitializer.getServletConfigClasses();

        // Assert that the returned array is not null
        Assert.assertNotNull(classes);

        // Assert that the returned array has exactly one element
        Assert.assertEquals(1, classes.length);

        // Assert that the returned class type is SpringConfig
        Assert.assertTrue(classes[0] == SpringConfig.class);
    }
}
