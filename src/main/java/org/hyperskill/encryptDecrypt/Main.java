package org.hyperskill.encryptDecrypt;

public class Main {

    protected static final int LOWERCASE_A = (int) 'a';
    protected static final int LOWERCASE_Z = (int) 'z';
    protected static final int UPPERCASE_A = (int) 'A';
    protected static final int UPPERCASE_Z = (int) 'Z';

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

}
