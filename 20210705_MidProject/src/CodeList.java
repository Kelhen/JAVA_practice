
import java.util.ArrayList;
import java.util.Scanner;

public class CodeList {

    void showMenu() {

        char option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("Enter Your Option");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("A : Review the code list");
            System.out.println("B : Add new code");
            System.out.println("C : Practice your code");
            System.out.println("D : End of the practice");
            option = scanner.next().charAt(0);
            System.out.println("\n");


            switch (Character.toLowerCase(option)){
                case 'a':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Remember the code below");
                    System.out.println("-------------------------------------------------------");
                    System.out.println();
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Type the name of the vegitable you would like to add: ");
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Type the code for: ");
                    System.out.println("-------------------------------------------------------");
                    break;

                default:
                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
                    break;
            }

        } while (option != 'D');
        System.out.println("Good job!! See you tomorrow!");
        scanner.close();

    }
//    Array array = new Array();

}


