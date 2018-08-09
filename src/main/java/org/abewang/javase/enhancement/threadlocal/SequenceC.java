package org.abewang.javase.enhancement.threadlocal;

/**
 * @Author Abe
 * @Date 2018/8/9.
 */
public class SequenceC implements Sequence {
    private static MyThreadLocal<Integer> numberContainer = new MyThreadLocal<Integer>() {
        @Override
        public Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
    }

    public static void main(String[] args) throws InterruptedException {
        Sequence seq = new SequenceC();

        Thread t1 = new ClientThread(seq);
        Thread t2 = new ClientThread(seq);
        Thread t3 = new ClientThread(seq);

        t1.start(); t1.join();
        t2.start(); t2.join();
        t3.start(); t3.join();
    }
}
