package module3_9a;

public class PrintNumbers {

    public static void main(String[] args) {

        // Thread to check divisibility by 2
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 15; i++){
                if (i % 2 == 0){
                    printTwo(i);
                }
            }
        });

        // Thread to check divisibility by 3
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                if (i % 3 == 0) {
                    printThree(i);
                }
            }
        });

        // Thread to check divisibility by 4
        Thread t4 = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                if (i % 4 == 0) {
                    printFour(i);
                }
            }
        });

        // Thread to check divisibility by 5
        Thread t5 = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                if (i % 5 == 0) {
                    printFive(i);
                }
            }
        });

        // Thread to print numbers not divisible by 2, 3, 4, or 5
        Thread tNum = new Thread(() -> {
            for (int i = 1; i <= 15; i++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0) {
                    printNumber(i);
                }
            }
        });

        // Start all threads
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        tNum.start();
    }

    // Function for divisibility by 2
    public static void printTwo(int number) {
        System.out.println(number + " is divisible by 2");
    }

    // Function for divisibility by 3
    public static void printThree(int number) {
        System.out.println(number + " is divisible by 3");
    }

    // Function for divisibility by 4
    public static void printFour(int number) {
        System.out.println(number + " is divisible by 4");
    }

    // Function for divisibility by 5
    public static void printFive(int number) {
        System.out.println(number + " is divisible by 5");
    }

    // Function for numbers not divisible by 2, 3, 4, or 5
    public static void printNumber(int number) {
        System.out.println(number + " is not divisible by 2, 3, 4, or 5");
    }
}
