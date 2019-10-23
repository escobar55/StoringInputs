import java.util.Scanner;

public class StoringInput {
    public static void main(String [] args){

        Scanner key = new Scanner(System.in);
        System.out.println("Enter your first initial: ");
        String firstInitial = key.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = key.nextLine();

        System.out.println("Enter your house number: ");
        int houseNumber = key.nextInt();

        System.out.println("Enter your street name: ");
        key.nextLine(); //Eats the token space from the int line before
        String streetName = key.nextLine();

        System.out.println("Enter your street type: ");
        String streetType = key.nextLine();

        System.out.println("Enter your city: ");
        String city = key.nextLine();

     System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
     System.out.println(streetName + " " + streetType + " " + city);
    }
}
