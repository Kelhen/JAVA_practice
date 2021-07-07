import java.util.ArrayList;
import java.util.Random;

public class ItemList {
    private ArrayList<Item> list;

    public ItemList(){
        list = new ArrayList<Item>();
        // init list with items
        list.add(new Item("Banana",4011));
        list.add(new Item("Gala Apple",4171));
        list.add(new Item("Lemon",4053));
        list.add(new Item("Rime",4048));
        list.add(new Item("Cherry",4259));
    }

    void displayList() {
        for (int counter = 0; counter < list.size(); counter++) {
            System.out.println(list.get(counter).toString());
        }
    }

    public void addItem(String name, Integer code){
        list.add(new Item(name, code));
    }

    public Item getRadomItem() {
        Random rand = new Random();
        Item randomItem = list.get(rand.nextInt(list.size()));
        return randomItem;
    }

}
