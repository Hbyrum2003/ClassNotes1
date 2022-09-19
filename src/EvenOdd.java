
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Number");
        //integer input
        int num = myObj.nextInt();
        int num2 = myObj.nextInt();

        if (num > num2)
            System.out.println("The first number is bigger" + num);
        else if (num2> num) {
            System.out.println("The second number is bigger" + num2);

        }


    }
}
