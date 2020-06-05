package org.hyperskill.encryptDecrypt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest {

    @Test
    public void shouldEncodeGivenAbcKey3ReturnDef() {
        // given
        String source = "abc";
        int key = 3;
        String expected = "def";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenUpperAZTYKKey3ReturnUpperDCWBN() {
        // given
        String source = "AZTYK";
        int key = 3;
        String expected = "DCWBN";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenAbcKeyNeg1ReturnZab() {
        // given
        String source = "abc";
        int key = -1;
        String expected = "zab";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenCapitalLoremKeyNeg1ReturnCapitalKnqdl() {
        // given
        String source = "Lorem";
        int key = -1;
        String expected = "Knqdl";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenEmptyReturnEmpty() {
        // given
        String source = "";
        int key = -1;
        String expected = "";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenNullReturnEmpty() {
        // given
        String source = null;
        int key = -1;
        String expected = "";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenAbcKey30ReturnEfg() {
        // given
        String source = "abc";
        int key = 30;
        String expected = "efg";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenAbcKeyNeg30ReturnWxy() {
        // given
        String source = "abc";
        int key = -30;
        String expected = "wxy";

        // when
        String actual = CaesarCipher.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenAbcKey3ReturnXyz() {
        // given
        String source = "abc";
        int key = 3;
        String expected = "xyz";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenUpperAZTYKKey3ReturnUpperXWQVH() {
        // given
        String source = "AZTYK";
        int key = 3;
        String expected = "XWQVH";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenAbcKeyNeg1ReturnBcd() {
        // given
        String source = "abc";
        int key = -1;
        String expected = "bcd";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenCapitalLoremKeyNeg1ReturnCapitalMpsfn() {
        // given
        String source = "Lorem";
        int key = -1;
        String expected = "Mpsfn";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenEmptyReturnEmpty() {
        // given
        String source = "";
        int key = -1;
        String expected = "";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenNullReturnEmpty() {
        // given
        String source = null;
        int key = -1;
        String expected = "";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenAbcKey30ReturnWxy() {
        // given
        String source = "abc";
        int key = 30;
        String expected = "wxy";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenAbcKeyNeg30ReturnEfg() {
        // given
        String source = "abc";
        int key = -30;
        String expected = "efg";

        // when
        String actual = CaesarCipher.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenAKey1ReturnB() {
        // given
        char c = 'a';
        int key = 1;
        char expected = 'b';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenHashKey1ReturnHash() {
        // given
        char c = '#';
        int key = 1;
        char expected = '#';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenAKeyNeg1ReturnZ() {
        // given
        char c = 'a';
        int key = -1;
        char expected = 'z';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenUpperAKeyNeg2ReturnUpperY() {
        // given
        char c = 'A';
        int key = -2;
        char expected = 'Y';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenUpperTKey1ReturnU() {
        // given
        char c = 'T';
        int key = 1;
        char expected = 'U';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenUpperAKey30ReturnUpperE() {
        // given
        char c = 'A';
        int key = 30;
        char expected = 'E';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenUpperAKeyNeg30ReturnUpperW() {
        // given
        char c = 'A';
        int key = -30;
        char expected = 'W';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenQKey30ReturnU() {
        // given
        char c = 'q';
        int key = 30;
        char expected = 'u';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenHKeyNeg30ReturnD() {
        // given
        char c = 'h';
        int key = -30;
        char expected = 'd';

        // when
        char actual = CaesarCipher.moveChar(c, key);

        // then
        assertEquals(expected, actual);
    }
}
