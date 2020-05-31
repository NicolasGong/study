package com.gyn.home;

public class MultThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(){
                @Override
                public void run() {
                    synchronized (MultThread.class) {
                        System.out.println("Thread name:" + this.getName());
                        try {
                            MultThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(this.getName() + " end!!!");
                    }
                }


        };
        t1.start();

        Thread.sleep(1000);

        Thread t2= new Thread(){
            @Override
            public void run() {
                synchronized (MultThread.class) {
                    try {
                        System.out.println("Thread name:" + this.getName());
                        MultThread.class.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }
        };
        t2.start();



    }

}
