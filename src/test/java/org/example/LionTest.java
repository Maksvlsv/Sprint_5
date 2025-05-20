package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class LionTest {

    Feline felineMock;
    Lion lionMale;
    Lion lionFemale;

    @BeforeEach
    public void setUp() throws Exception {
        felineMock = mock(Feline.class);
        when(felineMock.getKittens()).thenReturn(1);
        when(felineMock.eatMeat()).thenReturn(List.of("Мясо"));

        lionMale = new Lion("Самец", felineMock);
        lionFemale = new Lion("Самка", felineMock);
    }

    @Test
    public void testDoesHaveMane_MaleLion() {
        assertTrue(lionMale.doesHaveMane());
    }

    @Test
    public void testDoesHaveMane_FemaleLion() {
        assertFalse(lionFemale.doesHaveMane());
    }

    @Test
    public void testGetKittens() {
        assertEquals(1, lionMale.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(List.of("Мясо"), lionMale.getFood());
    }

    @Test
    public void testInvalidSex_ThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Неизвестно", felineMock);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}