import java.util.Arrays;
public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0.0) {
            throw new IllegalArgumentException("Initial Capacity " + initialCapacity
                + " cannot be negative");
        }
        initialCapacity = initialCapacity;
    data = new String[initialCapacity];
    size = 0;
    }

  public int size(){
    if (data[0] == null){
      size = 0;
    }
    else for (int i = 0; i < data.length; i++){
      if (data[i] != null){
        size = i + 1;
      }
      else i = data.length;
    }
    return size;
  }

  public boolean add(String element){
    size();
    boolean x = false;
    String[] temp = new String[size() + 1];
    if (data.length == size){
      for (int i = 0; i < size(); i++){
       temp[i] = data[i];
    }
    }
        data = temp;
        data[size] = element;
    if (data[size].equals("element")){
    x = true;
  }
  return x;
  }

  public String get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index
          + " is out of bounds");
    }
    return data[index];
  }

  public String set(int index, String element){
    String a = "";
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index
          + " is out of bounds");
    }
    else{
      a = data[index];
      data[index] = element;
    }
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
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index " + index
          + " is out of bounds");
    }
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
    String[] str = new String[size()];
    String[] temp = new String[size()];
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index
          + " is out of bounds");
    }
    for (int first = 0; first < index; first++){
      str[first] = data[first];
    }
    for (int last = index + 1; last < size; last++){
      str[last-1] = data[last];
    }
    temp[0] = data[index];
    data = str;
    return temp[0];
  }

  public int indexOf(String s){
    int ocurr = -1;
    if ( s != null){
    for (int i = 0; i < size(); i++){
      if (data[i].equals(s)){
        ocurr = i;
        i = size();
      }
    }
  }
  {data = data;}
    return ocurr;
  }

  public int lastIndexOf(String value){
    int ocurr = -1;
    for (int i = size() - 1; i >= 0; i--){
      if (data[i].equals(value)){
        ocurr = i;
        i = 0;
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

  public boolean equals(SuperArray other){
    boolean x = false;
    if (other.size()==size()){
      for (int i = 0; i < size(); i++){
        if (get(i) == null){
          if (other.get(i) == null){
            x = true;
          }
        }
        else if (other.get(i)==(get(i))){
          x = true;
        }
        else {
          x = false;
          i = size();
        }
      }
    }
    else {x = false;}
    return x;
  }

}
