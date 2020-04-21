package au.com.servicevic.game.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CircularLinkedList {

    private static final Logger LOGGER = LoggerFactory.getLogger(CircularLinkedList.class);

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean hasOneElement() {
        return head != null && head.equals(tail);
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void addValue(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            head.setPrevious(newNode);
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }

        tail = newNode;
        tail.setNext(head);
    }


    public void deleteNode(Node nodeToDelete) {
        if (!isEmpty()) {
            if (head.equals(tail)) {
                head = null;
                tail = null;
            } else {
                if (nodeToDelete.equals(head)) {
                    head = head.getNext();
                    tail.setNext(head);
                    head.setPrevious(tail);
                } else if (nodeToDelete.equals(tail)) {
                    tail = tail.getPrevious();
                    tail.setNext(head);
                    head.setPrevious(tail);
                } else {
                    nodeToDelete.getPrevious().setNext(nodeToDelete.getNext());
                    nodeToDelete.getNext().setPrevious(nodeToDelete.getPrevious());
                }
            }
        }
    }


    public Node countFromTo(Node currentNode, int k) {
        Node nodeK = currentNode;
        for (int i = 1; i < k; i++) {
            nodeK = nodeK.getNext();
        }
        return nodeK;
    }

    @Override
    public String toString() {
        Node currentNode = head;
        StringBuilder display = new StringBuilder();
        if (head != null) {
            do {
                display.append(currentNode.getId() + " ");
                currentNode = currentNode.getNext();
            } while (currentNode != head);
        }
        return display.toString().trim();
    }

}
