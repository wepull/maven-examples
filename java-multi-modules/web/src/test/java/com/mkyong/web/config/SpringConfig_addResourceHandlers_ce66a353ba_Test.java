package com.mkyong.web.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

public class SpringConfig_addResourceHandlers_ce66a353ba_Test {

    @Mock
    private ResourceHandlerRegistry resourceHandlerRegistry;

    @InjectMocks
    private SpringConfig springConfig;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        springConfig = new SpringConfig();
    }

    @Test
    public void testAddResourceHandlers() {
        springConfig.addResourceHandlers(resourceHandlerRegistry);
        Mockito.verify(resourceHandlerRegistry).addResourceHandler("/resources/**");
    }

    @Test
    public void testAddResourceHandlersWithNullRegistry() {
        springConfig.addResourceHandlers(null);
        Mockito.verify(resourceHandlerRegistry, Mockito.times(0)).addResourceHandler("/resources/**");
    }
}
