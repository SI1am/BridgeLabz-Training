// Implement a Custom Hash Map
// Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
// Hint: Use an array of linked lists to handle collisions using separate chaining.


package stacksqueuesandhashmaps;
import java.util.*;

class MyHashMap {

    static class Node {
        int key, value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 5;
    private LinkedList<Node>[] buckets;

    public MyHashMap() {

        buckets = new LinkedList[SIZE];

        for (int i = 0; i < SIZE; i++) {

            buckets[i] = new LinkedList<>();

        }
    }

    private int getIndex(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getIndex(key);

        for (Node node : buckets[index]) {
            if (node.key == key) {


                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node(key, value));
    }

    public Integer get(int key) {
        int index = getIndex(key);
        for (Node node : buckets[index]) {

            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    public void remove(int key) {

        int index = getIndex(key);
        buckets[index].removeIf(node -> node.key == key);
    }
}

public class CustomHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(6, 600);
        map.put(11, 1100);

        System.out.println("Value for key 6: " + map.get(6));

        map.remove(6);

        System.out.println("Value for key 6 after removal: " + map.get(6));
    }
}
