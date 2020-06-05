package org.hyperskill.encryptDecrypt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void shouldFindOppositeLetterGivenAReturnsZ() {
        // given
        char c = 'a';
        char expected = 'z';

        // when
        char actual = Main.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenCReturnsX() {
        // given
        char c = 'c';
        char expected = 'x';

        // when
        char actual = Main.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenUpperBReturnsUpperY() {
        // given
        char c = 'B';
        char expected = 'Y';

        // when
        char actual = Main.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenHReturnsS() {
        // given
        char c = 'h';
        char expected = 's';

        // when
        char actual = Main.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenUpperMReturnsUpperN() {
        // given
        char c = 'M';
        char expected = 'N';

        // when
        char actual = Main.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenHashReturnsHash() {
        // given
        char c = '#';
        char expected = '#';

        // when
        char actual = Main.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenExclamationReturnsExclamation() {
        // given
        char c = '#';
        char expected = '#';

        // when
        char actual = Main.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

}
