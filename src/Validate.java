import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Accepts first name
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();

        //Accepts last name
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();

        //Accepts address
        System.out.println("Please enter your address:");
        String address = scanner.nextLine();

        //Accepts city
        System.out.println("Please enter your city:");
        String city = scanner.nextLine();

        //Accepts state
        System.out.println("Please enter your state:");
        String state = scanner.nextLine();

        //Accepts zip
        System.out.println("Please enter your  zip:");
        String zip = scanner.nextLine();

        //Accepts phone
        System.out.println("Please enter phone:");
        String phone = scanner.nextLine();

        //validate user input to check for error

        System.out.println("Validate Result:");
        System.out.println("  ");
        if(!ValidateInPut.validateFirstName(firstName))
            System.out.println("Invalid first Name");
        else if (!ValidateInPut.validateLastName(lastName))
            System.out.println("Invalid Last Name");
        else if (!ValidateInPut.validateAddress(address))
            System.out.println("Invalid Address");
        else if (!ValidateInPut.validateCity(city))
            System.out.println("Invalid city");
        else if (!ValidateInPut.validateState(state))
            System.out.println("Invalid State");
        else if (!ValidateInPut.validateZip(zip))
            System.out.println("Invalidate Zip");
        else if(!ValidateInPut.validatePhone(phone))
            System.out.println("Invalid Phone");
        else
            System.out.println("Valid data, Thank You");

    }
}
