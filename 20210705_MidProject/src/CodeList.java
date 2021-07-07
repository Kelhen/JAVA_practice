import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class CodeList {

//--------------------------------------------------------
//-------------------ARRAY LIST --------------------------
//--------------------------------------------------------

    ArrayList<ListOfCode> list = new ArrayList<>();

    // Adding to Arraylist: Name & Code
    public void storage(){

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

    // Showing the array ->  'Code: Name'
    static void displayProduct(ArrayList<ListOfCode> list) {
        for(ListOfCode nameAndCode: list){
            System.out.println( nameAndCode.getcode()+ ": " + nameAndCode.getName());
        }
    }

    class ListOfCode {
        //Name of vegetables and fruits
        private String name;
        //Code of vegetables and fruits
        private int code;

        //getter
        public String getName() {
            return name;
        }
        public int getcode() {
            return code;
        }
        //Constructor = class name
        public ListOfCode(String name, int code) {
            this.name = name;
            this.code = code;
        }
    }

    //CASE B: Adding the new name & number to Arraylist
    void addProduct(){
        String addingName =  scanner.next();
        Integer addingCode = scanner.nextInt();
        ListOfCode input = new ListOfCode(addingName, addingCode);
        list.add(input);
    }

    //CASE C: Quiz mode -> show name, and tyoe the code
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
                    storage();
                    displayProduct(list);
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