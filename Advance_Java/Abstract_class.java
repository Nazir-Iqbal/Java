package Advance_Java;

public class Abstract_class{

    public static void main(String[] args){
        Car obj = new updatedWagnor();
        
        obj.fly();
        obj.playMusic();
        obj.drive();
    }

}

abstract class Car{
    public abstract void drive();

    public abstract void fly();

    public void playMusic(){
        System.out.println("Music play...");
    }
}

abstract class wagnor extends Car{
    public void drive(){
        System.out.println("This car is Driving");
    }

}

class updatedWagnor extends wagnor{
    public void fly(){
        System.out.println("This car is flying");
    }
}
