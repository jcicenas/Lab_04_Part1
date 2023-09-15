import java.util.*;
public class prt2 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        System.out.println("What is the price of your purchase?");
        double price = newscan.nextDouble();
        System.out.println("Your new price including a 5% sales tax is: " + (price + (price * 0.05)));
        newscan.close();

    }
}
