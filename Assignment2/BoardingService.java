public class BoardingService implements PetCareService {
    @Override
    public String getName() {

        return "Boarding";
    }
    @Override
    public double getPrice() {

        return 300.00;
    }
    @Override
    public void performService(String petName) {

        System.out.println("Boarding service performed on " + petName);
    }
}
