package au.com.servicevic.game;

import au.com.servicevic.game.util.CircularLinkedList;
import au.com.servicevic.game.util.Node;

import java.util.stream.IntStream;

public class GameExecution {


    private GameExecution() throws  IllegalAccessException {
        throw new IllegalAccessException("Utility class");
    }

    public static String play(int n, int k) {
        if (n == 0) {
            return "No child found.";
        }
        // put the players in the circle
        final CircularLinkedList childrenCircle = new CircularLinkedList();
        IntStream.rangeClosed(1, n).forEach(childrenCircle::addValue);

        // remove and return last
        StringBuilder sequenceOut = new StringBuilder();
        Node nextOut;
        Node current = childrenCircle.getHead();
        while (!childrenCircle.isEmpty()) {
            nextOut = childrenCircle.countFromTo(current, k);
            if (childrenCircle.hasOneElement()) {
                sequenceOut.append("Winner: ").append(nextOut.getId());
            } else {
                sequenceOut.append(nextOut.getId()).append(" ");
            }
            childrenCircle.deleteNode(nextOut);
            current = nextOut.getNext();
        }
        return sequenceOut.toString();
    }
}
