import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//***************************************************************************
public class Main {
    public static void main(String[] args) {
        CodeList codeList = new CodeList();

        codeList.showMenu();
        CodeList.displayProduct(codeList.list);
    }
}


//***************************************************************************
class CodeList {


//--------------------------------------------------------
//-------------------ARRAY LIST --------------------------
//--------------------------------------------------------

    ArrayList<ListOfCode> list = new ArrayList<>();

    //constructor
    public void Strage(){

        ListOfCode banana = new ListOfCode("Banana",4011);
        list.add(banana);

        ListOfCode galaApple = new ListOfCode("Gala Apple",4171);
        list.add(galaApple);

        ListOfCode lemon = new ListOfCode("Lemon",4053);
        list.add(lemon);

        ListOfCode rime = new ListOfCode("Rime",4048);
        list.add(rime);

        ListOfCode cherry = new ListOfCode("Cherry",4259);
        list.add(cherry);
    }

    static void displayProduct(ArrayList<ListOfCode> list) {
        for(ListOfCode nameAndCode: list){
            System.out.println( nameAndCode.getcode()+ ": " + nameAndCode.getName());
        }
    }

    class ListOfCode {
        private String name;
        private int code;

        public String getName() {
            return name;
        }

        public int getcode() {
            return code;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public ListOfCode(String name, int number) {
            this.name = name;
            this.code = number;
        }
    }

    void addProduct(){
        String addingName =  scanner.next();
        Integer addingCode = scanner.nextInt();
        ListOfCode input = new ListOfCode(addingName, addingCode);
        list.add(input);
    }

    void numberOfPracticeMode(){
        CodeList obj = new CodeList();
        var index = obj.getRandamElement(list);
    }

    private ListOfCode getRandamElement(ArrayList<ListOfCode> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


//--------------------------------------------------------
//------------------- SHOW MENU --------------------------
//--------------------------------------------------------
    Scanner scanner = new Scanner(System.in);

    void showMenu() {
        char option;


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
                    displayProduct(this.list);
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Type the name of the vegetable you would like to add: ");
                    System.out.println("First: the NAME of the vegetable/fruit");
                    System.out.println("Second: the CODE of the vegetable/fruit");
                    System.out.println("-------------------------------------------------------");
                    addProduct();
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("-------------------------------------------------------");
//                    System.out.println("Type the code for: " + list.get());


//                    option1 = scanner.next().charAt(0);

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



}



