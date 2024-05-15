package org.aryak.hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterHashingTest {

    @Test
    void getOccurence() {
        char ch[] = new char[]{'c', 'e', 'a', 'm', 'e'};
        CharacterHashing obj = new CharacterHashing(ch);
        int actual = obj.getOccurence('e');
        assertEquals(2, actual);
    }
}