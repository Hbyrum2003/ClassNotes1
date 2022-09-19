import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your input in meters");
        double meters = myObj.nextDouble();
        double feet;
        double miles;
        double inches;

        feet = meters*3.28084;
        miles = meters/1609.33;
        inches = feet*12;
        System.out.println("Your meter input is equal to:" +feet);
        System.out.println("Your meter input is equal to" + miles);
        System.out.println("Your meter input in inches is: " + inches);
        }
}
