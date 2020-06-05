package org.hyperskill.encryptDecrypt;

public class CaesarCipherPlus {

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

    public static char moveChar(char c, int key) {
        return (char) (c + key);
    }
}
