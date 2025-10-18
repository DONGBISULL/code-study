package main.java.lc.lt;

public class MyLinkedList {

    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private int size;
    private Node head;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index <= 0 || index >= size) {
            return -1;
        }
        Node cur = head;
        for (int i = 0; i < index ; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        if (size == 0) {
            head = new Node(val);
            size++;
            return;
        }
        // 현재 헤드
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        if (size == 0) {
            addAtHead(val);
            return;
        }
        Node cur = head;
        for (int i = 0; i < size - 1; i++) {
            cur = cur.next;
        }
        Node newNode = new Node(val);
        cur.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node prev = head;
        //  인덱스 전껄 가져옴
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        Node newNode = new Node(val);
        // 기존 항목 가져옴
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        Node prev = head;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
//        A - B - C (2)
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        // B
        prev.next = prev.next.next;
        size--;
    }
}
