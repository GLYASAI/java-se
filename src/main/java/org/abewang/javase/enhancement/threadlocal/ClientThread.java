package org.abewang.javase.enhancement.threadlocal;

/**
 * @Author Abe
 * @Date 2018/8/9.
 */
public class ClientThread extends Thread {
    private Sequence seq;

    public ClientThread(Sequence seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + "=>" + seq.getNumber());
        }
    }
}
