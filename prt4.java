import java.util.*;
public class prt4 {
    public static void main(String[] args) {
        double ibalance = 5000;
        System.out.println("Your balance intially is: " + ibalance);
        System.out.println("Your balance after 1 month is: $" + (ibalance + (ibalance * 0.17)));
        System.out.println("Your balance after 2 months is: $" + ((ibalance + (ibalance * 0.17)) + (ibalance * 0.17)));
    }
}
