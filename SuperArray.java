import java.util.Arrays;
public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    for (int i = 0; i < data.length; i++){
      data[i] = "null";
    }
    size = 0;
  }

  public int size(){
    for (int i = 0; i < data.length; i++){
      if (!(data[i].equals("null"))){
        size ++;
      }
    }
    return size;
  }

  public boolean add(String element){
  if (data.length == size){
    String[] n = new String[size + 1 ];
    for ( int i = 0; i < size + 1; i++){
      n[i] = data[i];
    }
    n = data;
  }
  data[size] = element;
  return true;
  }

  public String get(int index){
  return data[index];
  }

  public String set(int index, String element){
  String[] a = new String[1];
  a[0] = data[index];
  data[index] = element;
  return a[0];
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
      if (!(data[i].equals("null"))){
        x = false;
      }
    }
    return x;
  }

}
