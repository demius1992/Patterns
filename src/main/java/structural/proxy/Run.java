package structural.proxy;

public class Run {

    public static void main(String[] args) {
        try {
            // Create a proxy
            MathematicsProxy proxy = new MathematicsProxy();

            // Calling math functions
            // addition
            System.out.printf("%s %.2f\n", "7 + 11 = ", proxy.Addition(7, 11));
            // subtraction
            System.out.printf("%s %.2f\n", "6 - 8 = ", proxy.Subtraction(6, 8));
            // multiplication
            System.out.printf("%s %.2f\n", "5 * 7 = ", proxy.Multiplication(5, 7));
            // division
            System.out.printf("%s %.2f\n", "33 / 11 = ", proxy.Division(33, 11));


        } catch (Exception ex) {
            System.out.println("Exception happened! Exception description\n" + ex.getMessage());
        }
    }
}
