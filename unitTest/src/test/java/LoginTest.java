import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Dictionary;
import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class LoginTest {

    Login login = org.mockito.Mockito.mock(Login.class);

    @Test
    @DisplayName("Check if userid and password are valid")
    void testFirst(){
        Dictionary dict = new Hashtable();
        dict.put("101", "Sydney");
        dict.put("102", "Brisbane");
        dict.put("103", "Melbourne");
        dict.put("104", "Perth");
        dict.put("107", "Nelson Bay");
        dict.put("108", "Canberra");
        assertFalse(Login.login("False", "False", dict));
        assertAll(() -> assertFalse(Login.login("False", "False", dict)),
                () -> assertFalse(Login.login("101", "False", dict)),
                () -> assertTrue(Login.login("108", "Canberra", dict)));
    }
}