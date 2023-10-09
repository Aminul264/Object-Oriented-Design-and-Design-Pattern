public class Room implements IStructure {
    public  String name;

    public  Room(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void location() {
        System.out.println("you are currently in "+this.getName()+". It has ");
    }

    @Override
    public void enter() {
        System.out.println("You have entered the "+this.getName());
    }

    @Override
    public void exit() {
        System.out.println("You have left the "+this.getName());
    }
}
