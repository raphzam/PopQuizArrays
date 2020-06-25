import java.util.Arrays;
import java.util.Scanner;

public class PopQuizArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numList = {25,14,56,15,36,56,77,18,29,49};
        int userElement;
        String userAnswer = "";
        
        //PRINT ARRAY TO USER
        System.out.println(Arrays.toString(numList));
        
        
        
        //ASK FOR ELEMENT AND RETURN INDEX

        do {
            System.out.println("What element are you looking for?");
            userElement = input.nextInt();
            input.nextLine(); // buffer

            for (int i = 0; i < numList.length; i++) {
                if (numList[i] == userElement){
                    System.out.printf("The element %d is at index %d\n", userElement, i);
                }

            }
            System.out.println("Search again? n to move on");
            userAnswer = input.nextLine();
        } while (!userAnswer.equalsIgnoreCase("n"));

        //MONTHS

        String[] monthList = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        //PRINT ARRAY TO USER
        System.out.println(Arrays.toString(monthList));

        //ASK FOR ELEMENT AND RETURN INDEX

        String userMonth = "";

        do {
            System.out.println("What element (month) are you looking for?");
            userMonth = input.nextLine();

            for (int i = 0; i < monthList.length; i++) {
                if (monthList[i].equalsIgnoreCase(userMonth) ){//january is at monthList[0]
                    System.out.printf("The element %s is at index %d\n", userMonth, i);
                }

            }
            System.out.println("Search again? n to move on");
            userAnswer = input.nextLine();

        } while (!userAnswer.equalsIgnoreCase("n"));

        System.out.println("Application exiting.");


    }
}
