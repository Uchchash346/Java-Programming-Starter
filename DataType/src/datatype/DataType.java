package datatype;

public class DataType {

    public static void main(String[] args) {
        boolean b = true; // dynamic initialization 
        char c = 'a';
        short s = 32677;
        int i = 11276;
        float f = 10.2f;
        double d = 10.2;

//        System.out.println("b = " + b);
//        c = 'a';
//        System.out.println("c = " + c);
//        System.out.println("s = " + s);
//        System.out.println("i = " + i);
//        System.out.println("f = " + f);
//        System.out.println("d = " + d);
        System.out.printf("boolean b = %b\n", b);
        System.out.printf("Character c = %c\n", c);
        System.out.printf("Short s = %d\n", s);
        System.out.printf("Double d = %.3f\n", d);

    }

}
