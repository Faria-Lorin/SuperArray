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

}
