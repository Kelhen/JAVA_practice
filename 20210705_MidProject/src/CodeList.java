//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CodeList {
//
//    Scanner scanner = new Scanner(System.in);
//
//
//    ArrayList<ListOfCode> list = new ArrayList<>();
//    ListOfCode banana = new ListOfCode("Banana",4011);
//        list.add(banana);
//
//    ListOfCode galaApple = new ListOfCode("Gala Apple",4171);
//        list.add(galaApple);
//
//    ListOfCode lemon = new ListOfCode("Lemon",4053);
//        list.add(lemon);
//
//    ListOfCode rime = new ListOfCode("Rime",4048);
//        list.add(rime);
//
//    ListOfCode cherry = new ListOfCode("Cherry",4259);
//        list.add(cherry);
//
//
//    void showMenu() {
//        char option;
//
//
//        do {
//            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
//            System.out.println("Enter Your Option");
//            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
//            System.out.println("A : Review the code list");
//            System.out.println("B : Add new code");
//            System.out.println("C : Practice your code");
//            System.out.println("D : End of the practice");
//            option = scanner.next().charAt(0);
//            System.out.println("\n");
//
//
//            switch (Character.toLowerCase(option)){
//                case 'a':
//                    System.out.println("-------------------------------------------------------");
//                    System.out.println("Remember the code below");
//                    System.out.println("-------------------------------------------------------");
//                    displayProduct(list);
//                    System.out.println("\n");
//                    break;
//                case 'b':
//                    System.out.println("-------------------------------------------------------");
//                    System.out.println("Type the name of the vegitable you would like to add: ");
//                    System.out.println("-------------------------------------------------------");
//                    System.out.println("\n");
//                    break;
//                case 'c':
//                    System.out.println("-------------------------------------------------------");
//                    System.out.println("Type the code for: ");
//                    System.out.println("-------------------------------------------------------");
//                    break;
//
//                default:
//                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
//                    break;
//            }
//
//        } while (option != 'D');
//        System.out.println("Good job!! See you tomorrow!");
//        scanner.close();
//
//    }
//
//    static void displayProduct(ArrayList<ListOfCode> list) {
//        for(ListOfCode nameAndCode: list){
//            System.out.println( nameAndCode.getcode()+ ": " + nameAndCode.getName());
//        }
//    }
//
//
//    public static class ListOfCode {
//        private String name;
//        private int code;
//
//        public String getName() {
//            return name;
//        }
//
//        public int getcode() {
//            return code;
//        }
//
//        public ListOfCode(String name, int number) {
//            this.name = name;
//            this.code = number;
//        }
//    }
//
//}
//
