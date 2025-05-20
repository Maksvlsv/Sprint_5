package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    Feline felineMock;
    Cat cat;

    @BeforeEach
    void setUp() {
        felineMock = Mockito.mock(Feline.class);
        cat = new Cat(felineMock);
    }

    @Test
    void testGetSound() {
        assertEquals("Мяу", cat.getSound(), "Проверка звука кошки");
    }

    @Test
    void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.eatMeat()).thenReturn(expectedFood);

        assertEquals(expectedFood, cat.getFood(), "Проверка пищи кошки");
        Mockito.verify(felineMock).eatMeat();
    }
}
