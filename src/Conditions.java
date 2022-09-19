public class Conditions {
    public static void main(String[] args) {
        final int DrivingAge = 16;
        int userAge = 18;
        if (userAge>= DrivingAge)
            System.out.println("You can drive!");
        else if (userAge<= DrivingAge) {
            System.out.println("You cannot drive!");
        }
    }
}
