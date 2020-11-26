package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void testGetRandomPassword() {
        PasswordGeneration pwg = new PasswordGeneration();
        assertFalse(pwg.getRandomPassword().contains("0"));
        assertFalse(pwg.getRandomPassword().contains("1"));
        assertFalse(pwg.getRandomPassword().contains("2"));
        assertFalse(pwg.getRandomPassword().contains("3"));
        assertFalse(pwg.getRandomPassword().contains("4"));
        assertFalse(pwg.getRandomPassword().contains("5"));
        assertFalse(pwg.getRandomPassword().contains("6"));
        assertFalse(pwg.getRandomPassword().contains("7"));
        assertFalse(pwg.getRandomPassword().contains("8"));
        assertFalse(pwg.getRandomPassword().contains("9"));
        assertTrue(pwg.getRandomPassword().length() == 8);
    }
}
