import java.util.Arrays;
public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
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
    size();
    String[] str = new String[size];
    if (isEmpty()){
      return "{}";
    }
    else for(int i = 0; i < size; i++){
      if (data[i] != null){
      str[i] = data[i];
    }
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
    size();
    String[] str = new String[size+1];
    for (int first = 0; first < index; first++){
      str[first] = data[first];
    }
      str[index] = element;
    for (int last = index + 1; last < size + 1; last++){
      str[last] = data[last - 1];
    }
    data = str;
    }

  public void clear(){
    String[] no = new String[10];
    data = no;
  }

  public String remove(int index){
    size();
    String[] str = new String[size];
    if (index > size - 1){
      return "Failure to remove";
    }
    for (int first = 0; first < index; first++){
      str[first] = data[first];
    }
    for (int last = index + 1; last < size; last++){
      str[last-1] = data[last];
    }
    data = str;
    return toString();
  }

  public int indexOf(String s){
    size();
    int ocurr = -1;
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        ocurr = i;
        i = size;
      }
    }
    return ocurr;
  }

  public String[] toArray(){
    size();
    String[] safety = new String[size];
    for (int i = 0; i < size; i++){
      safety[i] = data[i];
    }
    return safety;
  }

  public static void removeDuplicates(SuperArray s){
    s.size();
    for (int i = 0; i < s.size();){
      if (s.indexOf(s.get(i)) != i){
          s.remove(i);
      }
      else i++;
    }
  }

  public int lastIndexOf(String value){
    size();
    int ocurr = -1;
    for (int i = size() - 1; i >= 0; i--){
      if (data[i].equals(value)){
        ocurr = i;
        i = size;
      }
    }
    return ocurr;
  }

}
