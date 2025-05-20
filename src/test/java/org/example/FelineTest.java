package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FelineTest {

    Feline feline;

    @BeforeEach
    void setUp() {
        feline = new Feline();
    }

    @Test
    void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, feline.eatMeat(), "Проверка пищи хищника");
    }

    @Test
    void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily(), "Проверка семейства");
    }

    @Test
    void testGetKittensDefault() {
        assertEquals(1, feline.getKittens(), "Проверка количества котят по умолчанию");
    }

    @Test
    void testGetKittensWithCount() {
        assertEquals(5, feline.getKittens(5), "Проверка количества котят по параметру");
    }
}
