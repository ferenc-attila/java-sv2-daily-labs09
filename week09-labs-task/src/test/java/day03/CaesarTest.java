package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaesarTest {

    Caesar caesar = new Caesar(13);

    @Test
    void encryptsTest() {

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        assertEquals(s, caesar.encrypts(caesar.encrypts(s)));
    }
}