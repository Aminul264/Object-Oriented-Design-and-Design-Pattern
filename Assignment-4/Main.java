
public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("Street -First Floor");
        int firstFloor = building.addStructure(floor1);
        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1w = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMens = floor1.addStructure(washroom1m);
        int firstWomans = floor1.addStructure(washroom1w);
        int firstCommon= floor1.addStructure(common1);
        
        building.enter();
        Housing currentFloor =(Housing)building.getStructure(firstFloor);
        currentFloor.enter();

        Room currentRom=(Room)currentFloor.getStructure(firstMens);
        currentRom.enter();
        currentRom=(Room)currentFloor.getStructure(firstCommon);

        currentRom.enter();
        building.exit();
    }
}