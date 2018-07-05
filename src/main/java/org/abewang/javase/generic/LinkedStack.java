package org.abewang.javase.generic;

/**
 * A stack implemented with an internal linked structure.
 *
 * @Author Abe
 * @Date 2018/5/12.
 */
public class LinkedStack<T> {
    // 非静态类才能访问外部类的类型参数
    private class  Node {
        T item;
        Node next;

        public Node() {
            item = null;
            next = null;
        }

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node top = new Node();  // End sentinel

    public void push(T item) {
        top = new Node(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s: "Phasers on Stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
