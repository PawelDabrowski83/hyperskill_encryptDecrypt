package org.hyperskill.encryptDecrypt;
import static org.hyperskill.encryptDecrypt.Main.LOWERCASE_A;
import static org.hyperskill.encryptDecrypt.Main.LOWERCASE_Z;
import static org.hyperskill.encryptDecrypt.Main.UPPERCASE_A;
import static org.hyperskill.encryptDecrypt.Main.UPPERCASE_Z;

public class SwitchLetters {
    public static char findOppositeLetter(char c) {
        int charNumber = (int) c;
        if (charNumber >= LOWERCASE_A && charNumber <= LOWERCASE_Z) {
            int rangeToZ = LOWERCASE_Z - charNumber;
            return (char) (LOWERCASE_A + rangeToZ);
        }
        if (charNumber >= UPPERCASE_A && charNumber <= UPPERCASE_Z) {
            int rangeToZ = UPPERCASE_Z - charNumber;
            return (char) (UPPERCASE_A + rangeToZ);
        }
        return c;
    }

    public static String switchLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.chars()
                .map(e -> findOppositeLetter((char) e))
                .collect(StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append)
                .toString();
    }

}
