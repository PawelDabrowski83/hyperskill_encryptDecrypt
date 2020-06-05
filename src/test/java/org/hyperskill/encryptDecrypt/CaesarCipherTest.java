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

}
