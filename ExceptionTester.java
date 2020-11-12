public class ExceptionTester{
  public static void main(String[] args) {
    try{
      SuperArray exc = new SuperArray(-1);
    }
    catch(IllegalArgumentException e){
      System.out.println("Something's up with your Initial Capacity (You can't have negatives)");
    }
    try{
      SuperArray exc = new SuperArray(10);
    }
    catch(IllegalArgumentException e){
      System.out.println("Something's up with your Initial Capacity");
    }
    SuperArray exc = new SuperArray();
    for ( int i = 0; i < 20; i++){
      exc.add(""+i);
    }

    try{
      exc.get(90);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Are you sure your index is in bounds?");
    }

    try{
      exc.get(19);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Are you sure your index is in bounds?");
    }

    try{
      exc.set(21, "a");
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Is your index really in bounds? Check Again");
    }
    try{
      exc.set(15, "a");
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Is your index really in bounds? Check Again");
    }

    try{
      exc.add(51, "a");
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Hint: Your Index needs to be looked at");
    }
    try{
      exc.add(15, "a");
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Hint: Your Index needs to be looked at");
    }
    try{
      exc.remove(76);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Your index is out of bounds");
    }
    try{
      exc.remove(16);
    }
    catch(IndexOutOfBoundsException e){
      System.out.println("Your index is out of bounds");
    }

  }
}
