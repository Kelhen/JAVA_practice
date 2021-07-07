public class Item {
    public Item(String name, Integer code){
        this.code=code;
        this.name=name;
    }

    private String name;
    private Integer code;

    public String toString() {
      return this.name + " : " + this.code;
    }
}
