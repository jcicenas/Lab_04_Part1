public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 3;
        int intDifference = 4;
        int intProduct = 5;
        int intQuotient = 6;
        int intModulo = 7;
        double doubleOperandA = 8;
        double doubleOperandB = 9;
        double doubleSum = 10;
        double doubleProduct = 11;
        double doubleDifference = 12;
        double doubleQuotient = 13;
        double doubleModul = 14;
        
        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        doubleSum = doubleOperandA + doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        doubleModul = doubleOperandA % doubleOperandB;
        

        System.out.println("The sum using ints of "  + intOperandA + " " + intOperandB +  "  is " + intSum);
        System.out.println("The difference using ints of "  + intOperandA + " " + intOperandB +  "  is " + intDifference);
        System.out.println("The product using ints of "  + intOperandA + " " + intOperandB +  "  is " + intProduct);
        System.out.println("The Quotient using ints of "  + intOperandA + " " + intOperandB +  "  is " + intQuotient);
        System.out.println("The Modulus using ints of "  + intOperandA + " " + intOperandB +  "  is " + intModulo);
        System.out.println("The sum using doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleSum);
        System.out.println("The difference using doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleDifference);
        System.out.println("The Product using doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleProduct);
        System.out.println("The Quotient using doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleQuotient);
        System.out.println("The Modulus using doubles of "  + doubleOperandA + " " + doubleOperandB +  "  is " + doubleModul);
    }
}
