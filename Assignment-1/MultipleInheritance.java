interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class Duck implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("The duck is flying");
    }
    @Override
    public void swim(){
        System.out.println("The duck is swimming");
    }
}


public class MultipleInheritance{
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}