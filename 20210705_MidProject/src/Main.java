
import java.util.Scanner;

//***************************************************************************
public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        ItemList list = new ItemList();
        Scanner scanner = new Scanner(System.in);
        char option;

        do {
            System.out.println(
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("Enter Your Option");
            System.out.println(
                    "=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
            System.out.println("A : Review the code list");
            System.out.println("B : Add new code");
            System.out.println("C : Practice your code");
            System.out.println("D : End of the practice");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (Character.toLowerCase(option)) {
                case 'a':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Remember the code below");
                    System.out.println("-------------------------------------------------------");

                    list.displayList();
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Type the name of the vegetable you would like to add: ");
                    System.out.println("First: the NAME of the vegetable/fruit");
                    System.out.println("Second: the CODE of the vegetable/fruit");
                    System.out.println("-------------------------------------------------------");

                    String newName = scanner.next();
                    Integer newCode = scanner.nextInt();

                    list.addItem(newName, newCode);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("-------------------------------------------------------");
                    Item randItem = list.getRadomItem();
                    System.out.println("What is the code for " + randItem.getName() + " ?");
                    Integer answer = scanner.nextInt();
                    System.out.println(answer.toString() + " ? " + randItem.getCode().toString());
                    System.out.println(randItem.getCode().equals(answer));
                    if (randItem.getCode().equals(answer)) {
                        System.out.println("Pipon!!!");
                    } else {
                        System.out.println("BUBU");
                    }
                    System.out.println("-------------------------------------------------------");
                    break;
                case 'd':
                    System.out.println("Thanks for playing, bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
                    break;
            }

        } while (option != 'D');
            System.out.println("Good job!! See you tomorrow!");
            scanner.close();
    }

}
