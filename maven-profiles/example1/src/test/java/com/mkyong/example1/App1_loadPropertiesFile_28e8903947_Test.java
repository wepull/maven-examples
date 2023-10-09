import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import your.package.App1;

public class PropertiesFileTest {

    private ClassLoader classLoader;
    private App1 app1;

    public PropertiesFileTest() {
        classLoader = Mockito.mock(ClassLoader.class);
        app1 = new App1();
    }

    @Test
    public void testLoadPropertiesFile_IOException() throws IOException {
        // Given
        String filePath = "test.properties";
        Properties expectedProperties = new Properties();

        InputStream inputStream = Mockito.mock(InputStream.class);
        when(classLoader.getResourceAsStream(filePath)).thenReturn(inputStream);
        doThrow(new IOException("Fake IOException")).when(inputStream).read(any());

        // When
        Properties actualProperties = app1.loadPropertiesFile(filePath);

        // Then
        Assert.assertEquals(expectedProperties, actualProperties);
    }
}
