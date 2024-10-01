public class Prog {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            final int num = i;

            // Create threads for each function
            new Thread(() -> printTwo(num)).start();
            new Thread(() -> printThree(num)).start();
            new Thread(() -> printFour(num)).start();
            new Thread(() -> printFive(num)).start();
            new Thread(() -> printNumber(num)).start();

            try {
                Thread.sleep(100);  // To give time for all threads to print output
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printTwo(int num) {
        if (num % 2 == 0) {
            System.out.println("Divisible by 2: " + num);
        }
    }

    public static void printThree(int num) {
        if (num % 3 == 0) {
            System.out.println("Divisible by 3: " + num);
        }
    }

    public static void printFour(int num) {
        if (num % 4 == 0) {
            System.out.println("Divisible by 4: " + num);
        }
    }

    public static void printFive(int num) {
        if (num % 5 == 0) {
            System.out.println("Divisible by 5: " + num);
        }
    }

    public static void printNumber(int num) {
        if (num % 2 != 0 && num % 3 != 0 && num % 4 != 0 && num % 5 != 0) {
            System.out.println("Not divisible by 2, 3, 4, or 5: " + num);
        }
    }
}