
class PetCareManagementSystem {
    private PetCareService groomingService;
    private PetCareService boardingService;

    public PetCareManagementSystem() {
        groomingService = new GroomingService();
        boardingService = new BoardingService();
    }

    public void listPetCareServices() {
        System.out.println("Available Pet Care Services:");
        System.out.println(groomingService.getName() + ": $" + groomingService.getPrice());
        System.out.println(boardingService.getName() + ": $" + boardingService.getPrice());
    }

    public void performService(String serviceName, String petName) {
        if (serviceName.equals(groomingService.getName())) {
            groomingService.performService(petName);
        } else if (serviceName.equals(boardingService.getName())) {
            boardingService.performService(petName);
        } else {
            System.out.println("Service not found: " + serviceName);
        }
    }
}






