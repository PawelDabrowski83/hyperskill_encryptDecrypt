package org.hyperskill.encryptDecrypt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwitchLettersTest {

    @Test
    public void shouldFindOppositeLetterGivenAReturnsZ() {
        // given
        char c = 'a';
        char expected = 'z';

        // when
        char actual = SwitchLetters.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenCReturnsX() {
        // given
        char c = 'c';
        char expected = 'x';

        // when
        char actual = SwitchLetters.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenUpperBReturnsUpperY() {
        // given
        char c = 'B';
        char expected = 'Y';

        // when
        char actual = SwitchLetters.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenHReturnsS() {
        // given
        char c = 'h';
        char expected = 's';

        // when
        char actual = SwitchLetters.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenUpperMReturnsUpperN() {
        // given
        char c = 'M';
        char expected = 'N';

        // when
        char actual = SwitchLetters.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenHashReturnsHash() {
        // given
        char c = '#';
        char expected = '#';

        // when
        char actual = SwitchLetters.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindOppositeLetterGivenExclamationReturnsExclamation() {
        // given
        char c = '#';
        char expected = '#';

        // when
        char actual = SwitchLetters.findOppositeLetter(c);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchLettersGivenABCReturnZYX() {
        // given
        String sentence = "abc";
        String expected = "zyx";

        // when
        String actual = SwitchLetters.switchLetters(sentence);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchLettersGivenUpperDReturnUpperW() {
        // given
        String sentence = "D";
        String expected = "W";

        // when
        String actual = SwitchLetters.switchLetters(sentence);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchLettersGivenSimpleSentenceReturnOppositeSentence() {
        // given
        String sentence = "Ala ma kota.";
        String expected = "Zoz nz plgz.";

        // when
        String actual = SwitchLetters.switchLetters(sentence);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchLettersGivenEmptyReturnEmpty(){
        // given
        String sentence = "";
        String expected = "";

        // when
        String actual = SwitchLetters.switchLetters(sentence);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchLettersGivenNullReturnEmpty(){
        // given
        String sentence = null;
        String expected = "";

        // when
        String actual = SwitchLetters.switchLetters(sentence);

        // then
        assertEquals(expected, actual);
    }

}
