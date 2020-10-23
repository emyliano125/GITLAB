package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args) {
        Carte carte = new Carte("Fratii Karamazov", "Feodor", 1880, 1200);
       Biblioteca biblioteca =new Biblioteca();


       biblioteca.add(carte);
       biblioteca.add(new Carte("Procesul", "Kafka",1910,350));
       biblioteca.add(new Carte("Ender's Game","Orson Scott Card",1954,330));



        biblioteca.sort();//afisam in functie de nr de pagini
        //System.out.println(biblioteca);

        MyThread thr = new MyThread();

        System.out.println(Thread.currentThread().getName());
        thr.start();

        try {
            thr.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    for(int i=0;i<20;i++) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        }
    }


    }

