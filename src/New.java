import java.util.Scanner; //import scanner

public class New {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        //string input
        String name = myObj.nextLine();

        //numerical input

        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        //output the input

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

    }






}