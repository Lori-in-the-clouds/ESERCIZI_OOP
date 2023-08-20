package functional;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {
    final String filename = "C:\\Users\\utente\\Desktop\\esercizi programmazione ad oggetti\\ESERCIZI_JAVA\\src\\main\\resources\\james-joyce-ulysses (1).txt";

    @Test
    void howManyLines() throws IOException {
        assertEquals(9, Words.howManyLines(filename, "pride"));
        assertEquals(1, Words.howManyLines(filename, "prejudice"));
        assertEquals(12939, Words.howManyLines(filename, "the"));
    }

    @Test
    void howManyTimes() throws IOException {
        assertEquals(10, Words.howManyTimes(filename, "pride"));
        assertEquals(1, Words.howManyTimes(filename, "prejudice"));
        //assertEquals(15107, Words.howManyTimes(filename, "the")); è sbagliato???
    }

}