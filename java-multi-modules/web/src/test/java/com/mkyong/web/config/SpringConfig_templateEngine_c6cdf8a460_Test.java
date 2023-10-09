package com.mkyong.web.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public class SpringConfig_templateEngine_c6cdf8a460_Test {

    @InjectMocks
    private SpringConfig springConfig;

    @Mock
    private SpringResourceTemplateResolver templateResolver;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testTemplateEngine_successCase() {
        when(templateResolver.getTemplateMode()).thenReturn(TemplateMode.HTML);
        
        SpringTemplateEngine templateEngine = springConfig.templateEngine();

        assertNotNull(templateEngine);
    }

    @Test
    public void testTemplateEngine_failureCase() {
        when(templateResolver.getTemplateMode()).thenReturn(null);

        SpringTemplateEngine templateEngine = springConfig.templateEngine();

        assertNotNull(templateEngine);
    }
}
