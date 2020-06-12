package org.hyperskill.encryptDecrypt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandLineArgsTest {

    @Test
    public void shouldReadCLIWork1() {
        // given
        String input = "java Main -mode enc -key 5 -data \"Welcome to hyperskill!\"";
        CommandLineArgs expected = new CommandLineArgs.Builder()
                                    .mode("enc")
                                    .key(5)
                                    .data("Welcome to hyperskill!")
                                    .build();

        // when
        CommandLineArgs actual = CommandLineArgs.readCommand(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadCLIWork2() {
        // given
        String input = "java Main -key 5 -data \"\\jqhtrj%yt%m~ujwxpnqq&\" -mode dec";
        CommandLineArgs expected = new CommandLineArgs.Builder()
                .mode("dec")
                .key(5)
                .data("\\jqhtrj%yt%m~ujwxpnqq&")
                .build();

        // when
        CommandLineArgs actual = CommandLineArgs.readCommand(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadCLIWork3() {
        // given
        String input = "java Main -enc -key -5 -data \"Welcome to hyperskill!\"";
        CommandLineArgs expected = new CommandLineArgs.Builder()
                .mode("enc")
                .key(-5)
                .data("Welcome to hyperskill!")
                .build();

        // when
        CommandLineArgs actual = CommandLineArgs.readCommand(input);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReadCLIWork4() {
        // given
        String input = "java Main -data \"\\jqhtrj%yt%m~ujwxpnqq&\" -mode dec -key 111";
        CommandLineArgs expected = new CommandLineArgs.Builder()
                .mode("dec")
                .key(111)
                .data("\\jqhtrj%yt%m~ujwxpnqq&")
                .build();

        // when
        CommandLineArgs actual = CommandLineArgs.readCommand(input);

        // then
        assertEquals(expected, actual);
    }
}
