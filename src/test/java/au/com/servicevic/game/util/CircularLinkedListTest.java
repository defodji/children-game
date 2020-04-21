package au.com.servicevic.game.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {

    @Test
    void testIsEmpty() {
        CircularLinkedList list = new CircularLinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    void testHasOneElement() {
        CircularLinkedList list = new CircularLinkedList();
        list.addValue(1);
        assertTrue(list.hasOneElement());
    }

    @Test
    void testListWithOneElement() {
        CircularLinkedList list = new CircularLinkedList();
        list.addValue(1);
        assertEquals(1, list.getHead().getId());
        assertEquals(1, list.getTail().getId());
        assertEquals(1, list.getTail().getNext().getId());
        assertEquals(1, list.getHead().getPrevious().getId());
    }

    @Test
    void testListWithTwoElements() {
        CircularLinkedList list = new CircularLinkedList();
        list.addValue(1);
        list.addValue(2);
        assertEquals("1 2", list.toString());
    }

    @Test
    void testDeleteHead() {
        CircularLinkedList list = new CircularLinkedList();
        list.addValue(1);
        list.addValue(2);
        list.deleteNode(list.getHead());
        assertEquals("2", list.toString());
    }

    @Test
    void testDeleteTail() {
        CircularLinkedList list = new CircularLinkedList();
        list.addValue(1);
        list.addValue(2);
        list.deleteNode(list.getTail());
        assertEquals("1", list.toString());
    }

    @Test
    void testDeleteinTheMiddle() {
        CircularLinkedList list = new CircularLinkedList();
        list.addValue(1);
        list.addValue(2);
        list.addValue(3);
        list.deleteNode(list.getTail().getPrevious());
        assertEquals("1 3", list.toString());
    }

    @Test
    void testCountFromTo() {
        CircularLinkedList list = new CircularLinkedList();
        list.addValue(1);
        list.addValue(2);
        list.addValue(3);
        list.addValue(4);
        list.addValue(5);
        list.addValue(6);
        Node found = list.countFromTo(list.getHead(), 3);
        assertEquals(3, found.getId());
        Node newFound = list.countFromTo(found.getNext(), 4);
        assertEquals(1, newFound.getId());
    }
}