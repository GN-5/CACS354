import java.util.Scanner;

class CheckDuplicate {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int array[] = new int[5];
        int count = 0;

        while (count < 5) {
            System.out.println("Enter a number between 10 and 100.");

            int newNum;
            newNum = input.nextInt();

            if (newNum < 10 || newNum > 100) {
                System.out.println("Wrong Input, Please enter between 10 to 100.");
                continue;

            }

            boolean duplicate = false;

            for (int i = 0; i < count; i++) {
                if (newNum == array[i]) {
                    System.out.println("The number is dupicate. Try again.");
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                array[count] = newNum;
                count++;

                System.out.print("Unique values upto now: ");

                for (int i = 0; i < count; i++) {
                    System.out.print(" " + array[i]);
                }
                System.out.println();
            }

        }

        input.close();
    }
}