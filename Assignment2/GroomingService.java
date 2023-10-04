public class GroomingService implements PetCareService {
    @Override
    public String getName() {
        return "Grooming";
    }
    @Override
    public double getPrice() {

        return 500.00;
    }
    @Override
    public void performService(String petName) {

        System.out.println("Grooming service performed on " + petName);
    }
}
