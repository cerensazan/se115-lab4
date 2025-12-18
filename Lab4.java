import java.util.Scanner;


    public class Lab4 {
        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
            int b;

            System.out.print("Enter the number of lines:");
            b = sc.nextInt();

            for (int y = 0; y < b; y++) {
                for (int x = 0; x <= y; x++) {
                    System.out.print("*");
                }
                System.out.println();
            }

//senario2
            int summ = 0;
            int x;
            int y;
            System.out.println("Enter start number:");
            x = sc.nextInt();
            System.out.println("Enter end number :");
            y = sc.nextInt();

            for (int i = x; i <= y; i++) {
                summ += i;

            }
            System.out.println(summ);

            //senario3
            long c;
            System.out.print("Enter the number end : ");
            c = sc.nextLong();
            long result = 1;

            for (long i = 1; i <= c; i++) {


                result *= i;

            }
            System.out.println(result);
//senario4

            int number = 1;
            int reversenumber = 0;
            int digit = 1;

            System.out.println("Enter the reversenumber:");
            number = sc.nextInt();

            while (number != 0) {
                digit = number % 10;
                reversenumber = reversenumber * 10 + digit;
                number = number / 10;

            }
            System.out.println(reversenumber);
            //senario5

            int k = 0;
            System.out.println("Enter a number: ");
            k = sc.nextInt();

            for (int i = 1; i <= k; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(" FizzBuzz ");
                } else if (i % 3 == 0) {
                    System.out.print(" Fizz ");
                } else if (i % 5 == 0) {
                    System.out.print(" Buzz ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
