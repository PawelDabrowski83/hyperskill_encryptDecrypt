package org.hyperskill.encryptDecrypt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherPlusTest {

    @Test
    public void shouldEncodeGivenWelcomeKey5ReturnsCipher() {
        // given
        String source = "Welcome to hyperskill!";
        int key = 5;
        String expected = "\\jqhtrj%yt%m~ujwxpnqq&";

        // when
        String actual = CaesarCipherPlus.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenCipherKey5ReturnsWelcome() {
        // given
        String source = "\\jqhtrj%yt%m~ujwxpnqq&";
        int key = 5;
        String expected = "Welcome to hyperskill!";

        // when
        String actual = CaesarCipherPlus.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenNullReturnsEmpty() {
        // given
        String source = null;
        int key = 1;
        String expected = "";

        // when
        String actual = CaesarCipherPlus.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldEncodeGivenEmptyReturnsEmpty() {
        // given
        String source = "";
        int key = 1;
        String expected = "";

        // when
        String actual = CaesarCipherPlus.encode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenNullReturnsEmpty() {
        // given
        String source = null;
        int key = 1;
        String expected = "";

        // when
        String actual = CaesarCipherPlus.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecodeGivenEmptyReturnsEmpty() {
        // given
        String source = "";
        int key = 1;
        String expected = "";

        // when
        String actual = CaesarCipherPlus.decode(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenAKey2ReturnsC() {
        // given
        char source = 'a';
        int key = 2;
        char expected = 'c';

        // when
        char actual = CaesarCipherPlus.moveChar(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenZKeyNeg2ReturnsX() {
        // given
        char source = 'z';
        int key = -2;
        char expected = 'x';

        // when
        char actual = CaesarCipherPlus.moveChar(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenLeftBracketKey2ReturnsStar() {
        // given
        char source = '(';
        int key = 2;
        char expected = '*';

        // when
        char actual = CaesarCipherPlus.moveChar(source, key);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMoveCharGivenZeroKeyNeg2ReturnsDot() {
        // given
        char source = '0';
        int key = -2;
        char expected = '.';

        // when
        char actual = CaesarCipherPlus.moveChar(source, key);

        // then
        assertEquals(expected, actual);
    }
}
