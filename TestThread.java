class threading extends Thread {

    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("TMV");

        }

    }
}

class threading2 extends Thread {

    public void run() {

        for (int i = 0; i < 20; i++) {

            System.out.println("Welcome");

        }

    }
}

public class TestThread {

    public static void main(String args[]) {

        threading t1 = new threading();
        threading2 t2 = new threading2();

        t1.start();
        t2.start();

    }
}