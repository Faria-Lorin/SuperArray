public class Demo{
  public static void printLoop(int n){
    for(int i = 1; i <= n; i++){
      for(int j = i; j <= n; j++){
         System.out.print(i);
    }
    System.out.println();
  }
}
  public static String arrToString(int[]arr){
    String sum = "";
    int n = 0;
    if (arr.length == 0){
        sum += "{}";
      }
    for (int i = 0; i < arr.length; i++){
        n = arr[i];
        if ( i == 0){
            sum += "{"+ n +", ";
          }
        else if ( i != arr.length - 1) {
            sum += n + ", ";
          }
        else {
            sum += n + "}";
          }
        }
    if (arr.length == 1){
        sum = "{" + arr[0] + "}";
      }
    return sum;
  }


  public static String arrayDeepToString(int[][] arr){
    String duo = "{";
    for (int i = 0; i < arr.length; i++){
      duo += Demo.arrToString(arr[i]);
      if (i != arr.length - 1){
        duo += ", ";
      }
        }
      duo += "}";
      return duo;
  }

  public static int[][] create2DArray( int rows, int cols, int maxValue){
    int values[][] = new int[rows][cols];
     for (int i = 0; i < rows; i++)
     {
        for (int j = 1; j < cols; j++)
        {
          values[i][j] = (int)(Math.random()*maxValue);
        }
     }
     return values;
}
public static int[][] create2DArrayRandomized( int rows, int cols, int maxValue){
  int values[][] = new int[rows][];
   for (int i = 0; i < rows; i++)
   { int col = (int)(Math.random()*cols);
     values[i] = new int[col + 1];
     for (int j = 0; j < col; j++)
      {
        values[i][j] = (int)(Math.random()*maxValue);
      }
   }
   return values;
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
public static SuperArray findOverlap(SuperArray a, SuperArray b){
  SuperArray c = new SuperArray();
    for (int i = 0; i < a.size(); i++){
      for (int j = 0; i < b.size(); i++){
        if (a.get(i).equals(b.get(j))){
          c.add(a.get(i));
        }
      }
    }
    return c;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray();
    for (int i = 0; i < a.size() + b.size(); i++){
      c.add(a.get(i));
      c.add(b.get(i));
    }
    for (int i = 0; i < c.size(); i++){
      if (c.get(i) == null){
        c.remove(i);
      }
    }

    return c;
  }

  public static void main(String[] args) {
   if (args.length == 0){
      Demo.printLoop(5);
    }
    Demo.printLoop(Integer.parseInt(args[0]));

    /*
    int[] arr = {1,2,3,4,5};
    System.out.println(Demo.arrToString(arr));
    int[][] arr2 = {{1, 2, 3}, {}, {8, 2, 3, 1}, {1}};
    System.out.println(Demo.arrayDeepToString(arr2));
    System.out.println((Demo.arrayDeepToString(Demo.create2DArray(10, 7, 3))));
    System.out.println((Demo.arrayDeepToString(Demo.create2DArrayRandomized(9,9,9))));
    */
    }
  }
