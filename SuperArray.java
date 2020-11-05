import java.util.Arrays;
public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    for (int i = 0; i < data.length; i++){
      if (data[i] == null){
        i = data.length;
      }
      else size = i + 1;
    }
    return size;
  }

  public boolean add(String element){
    size();
    String[] temp = new String[data.length + 1];
    if (data.length == size){
      for (int i = 0; i < data.length; i++){
       temp[i] = data[i];
    }
       data = temp;
    }
        data[size] = element;
    return true;
  }

  public String get(int index){
  return data[index];
  }

  public String set(int index, String element){
  String a = "";
  a = data[index];
  data[index] = element;
  return a;
  }

  private void resize(){
    String[] re = new String[size + 10];
    for(int i = 0; i < size + 1; i++){
      add(data[i]);
  }
  data = re;
  System.out.println(Arrays.toString(data));
}

  public boolean isEmpty(){
    boolean x = true;
    for (int i = 0; i < data.length; i++){
      if (data[i] != null){
        x = false;
      }
    }
    return x;
  }

  public String toString(){
    String[] str = new String[size + 1];
    for(int i = 0; i < size + 1; i++){
      str[i] = data[i];
    }
    return Arrays.toString(str);
  }

    public boolean contains(String s){
      int x = 0;
      for(int i = 0; i < size + 1; i++){
        if (data[i].equals(s)){
          x++;
        }
      }
      return x >= 1;
    }
  public void add(int index, String element){
    String str = "";
  }
}
