package org.abewang.javase.enhancement.threadlocal;

/**
 * @Author Abe
 * @Date 2018/8/9.
 */
public class SequenceB implements Sequence {
    private static ThreadLocal<Integer> numberContainer = ThreadLocal.withInitial(() -> 0);

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Sequence seq = new SequenceB();

        Thread t1 = new ClientThread(seq);
        Thread t2 = new ClientThread(seq);
        Thread t3 = new ClientThread(seq);

        t1.start(); t1.join();
        t2.start(); t2.join();
        t3.start(); t3.join();
    }
}
