import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CodeList codeList = new CodeList();

//        codeList.showMenu();



        ArrayList<ListOfCode> list = new ArrayList<>();
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

        displayProduct(list);

    }

    static void displayProduct(ArrayList<ListOfCode> list) {
        for(ListOfCode nameAndCode: list){
            System.out.println( nameAndCode.getcode()+ ": " + nameAndCode.getName());
        }
    }


    public static class ListOfCode {
    private String name;
    private int code;

    public String getName() {
        return name;
    }

    public int getcode() {
        return code;
    }

    public ListOfCode(String name, int number) {
        this.name = name;
        this.code = number;
    }
}


}
