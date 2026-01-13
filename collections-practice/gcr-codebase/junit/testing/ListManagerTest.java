// package Junit.Test.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Junit.Test.ListManager;

import java.util.*;

class ListManagerTest {

    ListManager manager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        assertFalse(list.contains(10));
        manager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
        manager.removeElement(list, 2);
        assertFalse(list.contains(2));
    }

    @Test
    void testSize() {
        List<Integer> list = new ArrayList<>(List.of(1, 2));
        assertEquals(2, manager.getSize(list));
    }
}
