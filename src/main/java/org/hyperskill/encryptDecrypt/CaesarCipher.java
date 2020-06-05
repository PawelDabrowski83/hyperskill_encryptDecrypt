package org.hyperskill.encryptDecrypt;

import static org.hyperskill.encryptDecrypt.Main.LOWERCASE_A;
import static org.hyperskill.encryptDecrypt.Main.LOWERCASE_Z;
import static org.hyperskill.encryptDecrypt.Main.UPPERCASE_A;
import static org.hyperskill.encryptDecrypt.Main.UPPERCASE_Z;

public class CaesarCipher {

    public static String encode(String str, int key) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        return str.chars()
                .map(e -> moveChar((char) e, key))
                .collect(StringBuilder::new,
                    StringBuilder::appendCodePoint,
                    StringBuilder::append)
                .toString();
    }

    public static String decode(String str, int key) {
        return encode(str, key * -1);
    }

    public static char moveChar(char c, int range) {
        int charNumber = (int) c;
        int adjustedRange = range % 26;
        if (charNumber >= LOWERCASE_A && charNumber <= LOWERCASE_Z) {
            charNumber += adjustedRange;
            if (charNumber < LOWERCASE_A) {
                charNumber = LOWERCASE_Z - charNumber + LOWERCASE_A;
            }
            if (charNumber > LOWERCASE_Z) {
                charNumber = LOWERCASE_A + charNumber - LOWERCASE_Z;
            }
        }
        if (charNumber >= UPPERCASE_A && charNumber <= UPPERCASE_Z) {
            charNumber += adjustedRange;
            if (charNumber < UPPERCASE_A) {
                charNumber = UPPERCASE_Z - charNumber + UPPERCASE_A;
            }
            if (charNumber > UPPERCASE_Z) {
                charNumber = UPPERCASE_A + charNumber - UPPERCASE_Z;
            }
        }
        return (char) charNumber;
    }
}
