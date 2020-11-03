import java.util.Arrays;
public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public int size(){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      if (!(data[i].equals(null))){
        count ++;
      }
    }
    size = count;
    return size;
  }
  public boolean add(String element){
  if (data.length == size){
  data[size] = element;}
  System.out.println("DONE!");
  return true;
  }

  public String get(int index){
  return data[index];
  }

  public String set(int index, String element){
  data[index] = element;
  return Arrays.toString(data);
  }
}
