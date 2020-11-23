import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) {
        int err = 0;
        SuperArray a = new SuperArray();

        System.out.println("----Testing size() and add(): ");
        System.out.println("Result: " + a.size()+"\tExpected: 0");
        for (int i = 0; i < 8; i++) {
            a.add("Kiwi" + i);
        }
        System.out.println("Result: " + a.size()+"\tExpected: 8");

        System.out.println("\n----Testing get(): ");
        System.out.println("Result: " + a.get(2)+"\tExpected: Kiwi2");
        System.out.println("Result: " + a.get(5)+"\tExpected: Kiwi5");
        System.out.println("Result: " + a.get(7)+"\tExpected: Kiwi7");

        System.out.println("\n----Testing set(): ");
        System.out.println("Previous:" + a.set(0, "Cookies") + "\tCurrent: " + a.get(0));
        System.out.println("Previous:" + a.set(2, "Mars") + "\tCurrent: " + a.get(2));
        System.out.println("Previous:" + a.set(4, "June") + "\tCurrent: " + a.get(4));
        System.out.println(a);

        a.add(3,"eureka!");
        System.out.println("\n----Testing add(3,'eureka!'): " + a);
        a.add(5,"snow");
        System.out.println("----Testing add(5,'snow'): " + a);


        a.remove(3);
        System.out.println("\n----Testing remove(3): " + a);
        a.remove(0);
        System.out.println("\n----Testing remove(0): " + a);
        a.remove(5);
        System.out.println("----Testing remove(5): " + a);
        a.remove(6);
        System.out.println("----Testing remove(6): " + a);

        System.out.println("\n----Testing indexOf('snow'): " + a.indexOf("snow"));
        System.out.println("----Testing indexOf('Cookies'): " + a.indexOf("Cookies"));
        System.out.println("----Testing indexOf('cookies'): " + a.indexOf("cookies"));


        System.out.println("\n----Testing isEmpty(): " + a.isEmpty() + "\tExpected: false");
        a.clear();
        System.out.println("\n----Testing clear(): "+ a.toString());
        System.out.println("\n----Testing isEmpty(): " + a.isEmpty() + "\tExpected: true\n");
        System.out.println("\n----Testing add(): ");
        a.add("g");
        System.out.println(a);
        System.out.println(a.size());
}
}
