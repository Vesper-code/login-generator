package geco;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private String [] logins = {"vesper", "quent"} ;
    private LoginService loginS = new LoginService(logins);

    @Test
    public void testLoginExists() {
        assertTrue(loginS.loginExists("vesper"));
        assertFalse(loginS.loginExists("vesper7"));
    }

    @Test
    public void testAddLogin() {
        assertFalse(loginS.loginExists("vesper7"));
        loginS.addLogin("vesper7");
        assertTrue(loginS.loginExists("vesper7"));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        List<String> list = loginS.findAllLoginsStartingWith("q");
        assertTrue(list.contains("quent"));
        assertFalse(list.contains("vesper"));
    }
    @Test
    public void testFindAllLogins() {
        List<String> list = loginS.findAllLogins();
        assertTrue(list.contains("quent"));
        assertTrue(list.contains("vesper"));
        assertFalse(list.contains("vesper7"));
    }

}
