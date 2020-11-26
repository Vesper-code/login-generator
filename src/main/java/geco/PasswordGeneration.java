package geco;

import java.util.Random;

public class PasswordGeneration {

    public PasswordGeneration () { }

    /**
     * Genere un mot de passe avec les caractères de l'alphabet minuscule
     * @return le login genere
     */
    public String getRandomPassword() {
        Random rand = new Random();
        String s = "";
        for(int i = 0 ; i < 8 ; i++){
            char c = (char)(rand.nextInt(26) + 97);
            s += c;
        }
        return s;
    }
}
