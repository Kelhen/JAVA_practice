import java.util.ArrayList;
import java.util.Random;

public class ItemList {
    private ArrayList<Item> list = new ArrayList<Item>();

    public ItemList(){
        // init list with items
        addItem("Banana",4011);
        addItem("Gala Apple",4171);
        addItem("Lemon",4053);
        addItem("Rime",4048);
        addItem("Cherry",4259);
    }

    public void displayList() {
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
