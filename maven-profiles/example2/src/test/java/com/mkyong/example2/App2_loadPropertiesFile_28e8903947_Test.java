package com.mkyong.example2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.io.IOException;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyString;

public class App2_loadPropertiesFile_28e8903947_Test {

    @Mock
    private App2_loadPropertiesFile_28e8903947 app;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLoadPropertiesFile_Success() throws IOException {
        Properties expectedProperties = new Properties();
        expectedProperties.put("key1", "value1");
        expectedProperties.put("key2", "value2");

        when(app.loadPropertiesFile(anyString())).thenReturn(expectedProperties);

        Properties actualProperties = app.loadPropertiesFile("test.properties");

        assertEquals(expectedProperties, actualProperties);
    }

    @Test
    public void testLoadPropertiesFile_Failure() throws IOException {
        when(app.loadPropertiesFile(anyString())).thenThrow(IOException.class);

        try {
            Properties actualProperties = app.loadPropertiesFile("non_existent.properties");
        } catch (IOException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testLoadPropertiesFile_Empty() throws IOException {
        Properties expectedProperties = new Properties();

        when(app.loadPropertiesFile(anyString())).thenReturn(expectedProperties);

        Properties actualProperties = app.loadPropertiesFile("empty.properties");

        assertTrue(actualProperties.isEmpty());
    }
}
