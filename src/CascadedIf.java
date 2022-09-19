public class CascadedIf {
    public static void main(String[] args) {
        String menuChoice = "";
        String menu = "B - back U - up D - down F - forward";
        //input menu choice
        menuChoice = "U";

        if (menuChoice.equalsIgnoreCase("B"))
        System.out.println("You chose Back");
        else if (menuChoice.equalsIgnoreCase("U")){
            System.out.println("You chose Up");
        }
        else if (menuChoice.equalsIgnoreCase("F")){
            System.out.println("You chose Forward");

        }
        else if (menuChoice.equalsIgnoreCase("D")){
            System.out.println("You chose Down");


        }

    }
}
