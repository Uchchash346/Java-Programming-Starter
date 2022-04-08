package beginnerjava;

public class IncrementDecrement {

    public static void main(String[] args) {
        int x = 25;
        int y;

        y = x++;
        System.out.println("Before Post Increment, y = " + y);
        y = x;
        System.out.println("After Post Increment, y = " + y);
        y = ++x;
        System.out.println("Before Pre Increment, y = " + y);
        y = x;
        System.out.println("After Pre Increment, y = " + y);

        y = x--;
        System.out.println("Before Post Decrement, y = " + y);
        y = x;
        System.out.println("After Post Decrement, y = " + y);
        y = --x;
        System.out.println("Before Pre Decrement, y = " + y);
        y = x;
        System.out.println("After Pre Decrement, y = " + y);
    }
}
