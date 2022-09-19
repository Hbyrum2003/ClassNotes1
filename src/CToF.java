import java.util.Scanner;


public class CToF {
    public static void main(String[] args) {
        Scanner celsius = new Scanner(System.in);
        System.out.println(" Enter your temperature in celsius");
        double temp = celsius.nextDouble();
        double Farhrenheit;
        Farhrenheit = temp * 1.8 + 32;
        System.out.println("Your temperature in fahrenheit is: " + Farhrenheit);




    }
}
