import java.util.Scanner;

    public class Senario6 {
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the start number: ");
            int start = scanner.nextInt();
            System.out.print("Enter the end number: ");
            int end = scanner.nextInt();

            int current = start;
            int steps = 0;

            while (current != end && steps < 1000) {
                System.out.print("Step " + (steps + 1) + ": " + current);
                int next;

                if (current % 2 == 0) {
                    next = current / 2;
                    System.out.println(" even, n/2 = " + next);
                } else if (current % 3 == 0) {
                    next = current + 4;
                    System.out.println(" divisible by 3, n+4 = " + next);
                } else if (isPrime(current)) {
                    next = current * 2;
                    System.out.println(" prime, n*2 = " + next);
                } else {
                    next = current + 1;
                    System.out.println(" none apply, n+1 = " + next);
                }

                current = next;
                steps++;
            }

            if (current == end) {
                System.out.println("Reached end number " + end + " in " + steps + " steps!");
            } else {
                System.out.println("Infinite loop detected!");
            }

    }
}
