import java.util.ArrayList;

public class ArrayListSample{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java入門講座");
    list.add("さらに知識を増やそう!");

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}