public class Item {
  private String name;
  private Integer code;

  public Item(String name, Integer code){
      this.code=code;
      this.name=name;
  }

  public String getName() {
    return this.name;
  }

  public Integer getCode() {
    return this.code;
  }

  public String toString() {
      return this.name + " : " + this.code;
  }
}
