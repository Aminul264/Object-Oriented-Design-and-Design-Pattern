import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetCareManagementSystem petCareSystem = new PetCareManagementSystem();


        // List all available pet care services
        petCareSystem.listPetCareServices();

        // Simulate performing a service on a pet
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Service Name :");
        String serviceName=scanner.nextLine();
        System.out.print("Enter PetName :");
        String petName=scanner.nextLine();

        System.out.println("Performing " + serviceName + " service on " + petName);
        petCareSystem.performService(serviceName, petName);
    }
}

