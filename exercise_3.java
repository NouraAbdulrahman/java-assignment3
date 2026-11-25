import java.util.Scanner;
public class exercise_3 {
    public static void main(String[] args) {

        //Q1
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            //Q2
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
     String text = input.nextLine();
     for (int b = text.length() - 1; b >= 0; b--) {
          System.out.print(text.charAt(b));
            }

            //Q3
      System.out.print("Enter a number: ");
     int num = input.nextInt();

     long factorial = 1;

     for (int c = 1; c <= num; c++) {
         factorial *= c;
            }

      System.out.println("Factorial = " + factorial);


            //Q4
            System.out.print("Enter the base: ");
            int base = input.nextInt();

            System.out.print("Enter the exponent: ");
            int exponent = input.nextInt();

            int result = 1;

            for (int d = 1; d <= exponent; d++) {
                result *= base;
            }

            System.out.println("Result = " + result);


            //Q5
            int evenSum = 0;
            int oddSum = 0;

            System.out.print("How many numbers? ");
            int n = input.nextInt();

            for (int e = 1; e <= n; e++) {
                System.out.print("Enter number " + e + ": ");
                int num2 = input.nextInt();

                if (num2 % 2 == 0) {
                    evenSum += num2;
                } else {
                    oddSum += num2;
                }
            }

            System.out.println("Sum of even numbers = " + evenSum);
            System.out.println("Sum of odd numbers = " + oddSum);


            //Q6
            System.out.print("Enter a positive integer: ");
            int num1 = input.nextInt();

            boolean isPrime = true;

            if (num1 <= 1) {
                isPrime = false;
            } else {
                for (int n1 = 2; n1< num1; n1++) {
                    if (num1 % n1 == 0) {
                        isPrime = false;
                        break;

                        //Q7
     for (int week = 1; week <= 4; week++) {
           System.out.println("Week " + week);
           for (int day = 1; day <= 7; day++) {
              System.out.println("Day" + day);
           }

           System.out.println();


                            //Q8

                            System.out.print("Enter a word: ");
                            String word = input.nextLine();

                            String reverse = "";

                            for (int m= word.length() - 1; m >= 0; m--) {
                                reverse += word.charAt(i);
                            }

                            if (word.equals(reverse)) {
                                System.out.println("Palindrome");
                            } else {
                                System.out.println("Not Palindrome");

                            }
                        }
                    }
                }
            }
        }
    }
}




