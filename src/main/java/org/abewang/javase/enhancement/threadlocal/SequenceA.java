package org.abewang.javase.enhancement.threadlocal;

/**
 * @Author Abe
 * @Date 2018/8/9.
 */
public class SequenceA implements Sequence {
    private static int number;

    @Override
    public int getNumber() {
        number = number + 1;
        return number;
    }

    public static void main(String[] args) throws InterruptedException {
        Sequence seq = new SequenceA();

        Thread t1 = new ClientThread(seq);
        Thread t2 = new ClientThread(seq);
        Thread t3 = new ClientThread(seq);

        t1.start(); t1.join();
        t2.start(); t2.join();
        t3.start(); t3.join();
    }
}
