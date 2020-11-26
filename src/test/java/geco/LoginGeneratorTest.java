package geco;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginService loginService = new LoginService(new String[] {"JROL",
            "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    private LoginGenerator loginG = new LoginGenerator(loginService);

    @Test
    public void testCT() {
        loginG.generateLoginForNomAndPrenom("Du", "Paul");
        assertTrue(loginService.loginExists("PDU"));
    }

    @Test
    public void testCT1() {
        loginG.generateLoginForNomAndPrenom("Durand", "Paul");
        assertTrue(loginService.loginExists("PDUR"));
    }

    @Test
    public void testCT2() {
        loginG.generateLoginForNomAndPrenom("Ralling", "John");
        System.out.println(loginService.findAllLogins());
        assertTrue(loginService.loginExists("JRAL2"));
    }

    @Test
    public void testCT3() {
        loginG.generateLoginForNomAndPrenom("Rolling", "Jean");
        System.out.println(loginService.findAllLogins());
        assertTrue(loginService.loginExists("JROL1"));
    }

    @Test
    public void testCT4() {
        loginG.generateLoginForNomAndPrenom("Dùrand", "Paul");
        System.out.println(loginService.findAllLogins());
        assertTrue(loginService.loginExists("PDUR"));
    }
}
