package au.com.servicevic.game.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void testNewNodeNext() {
        Node newNode = new Node(1);
        assertNull(newNode.getNext());
    }

    @Test
    void testNewNodePrevious() {
        Node newNode = new Node(1);
        assertNull(newNode.getPrevious());
    }

    @Test
    void testGetValue() {
        Node newNode = new Node(1);
        assertEquals(1, newNode.getId());
    }

    @Test
    void testNext() {
        Node newNode = new Node(1);
        Node next = new Node(2);
        newNode.setNext(next);
        assertEquals(next, newNode.getNext());
    }

    @Test
    void testPrevious() {
        Node newNode = new Node(1);
        Node prev = new Node(2);
        newNode.setPrevious(prev);
        assertEquals(prev, newNode.getPrevious());
    }

    @Test
    void testEquals() {
        Node newNode1 = new Node(1);
        Node newNode2 = new Node(1);
        newNode2.setPrevious(newNode1);
        assertTrue(newNode1.equals(newNode2));
    }
}