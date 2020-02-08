import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.apps.service.MainService;

public class MainServiceTest {

    @Test
    public void test() {
        MainService mainService = new MainService();
        
        String actualName = mainService.getName();
        String expectedName = "John Wick";
        
        assertEquals(actualName, expectedName);
    }

}
