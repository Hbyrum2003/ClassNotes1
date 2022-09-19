import java.util.Scanner;


public class FuelCosts {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of gallons , the fuel efficiency, and the price of a gallon");
        double numberGallons = myObj.nextDouble();
        double fuelEfficiency = myObj.nextDouble();
        double priceGallon = myObj.nextDouble();
        double carRange;
        double costForGas;

        carRange = fuelEfficiency * numberGallons;
        costForGas = numberGallons*priceGallon;








        System.out.println("The number of gallons in your tank is:" + numberGallons);
        System.out.println("The fuel efficiency is: " + fuelEfficiency);
        System.out.println("The price per gallon is:$ " + priceGallon);
        System.out.println("The range you have in your car right now is:" + carRange);
        System.out.println("The cost for the amount of gas you have is:$ " + costForGas);

    }
}
