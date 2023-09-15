import java.util.*;
public class prt3 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        System.out.println("Enter your maintenence costs for winter: ");
        double winter = newscan.nextDouble();
        System.out.println("Enter your maintenence costs for summer: ");
        double summer = newscan.nextDouble();
        System.out.println("Enter your maintenence costs for fall: ");
        double fall = newscan.nextDouble();
        System.out.println("Enter your maintenence costs for spring: ");
        double spring = newscan.nextDouble();
        System.out.println("Your total maintenence costs for the yeat are: " + summer + winter + fall+ spring);
        newscan.close();

    }

}

