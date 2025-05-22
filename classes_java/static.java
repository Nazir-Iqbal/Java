class mobile
{
    String brand;
    int price;
    static String name;

    // static block
    static
    {
        name = "nothing";
        System.out.println("In the static block");
    }

    // constructor
    public mobile(){
        brand = "x";
        price = 0;
        name = "nothing";
        System.out.println("In constructor");
    }

    void get(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // static method
    static void show(mobile obj){
        // System.out.println(brand + " : " + price + " : " + name);  // brand and price can belong to different classes
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

class demo
{
    public static void main(String args[]){

        mobile obj1 = new mobile();
        obj1.brand = "nokia";
        obj1.price = 1000;
        // obj1.name = "Mobile phone"; // no preferred to change static vriable via object

        
        mobile  obj2 = new mobile();
        obj2.brand = "apple";
        obj2.price = 10000;
        // obj2.name = "smart phone"; // no preferred to change static vriable via object
        mobile.name = "smart phone";
        
        obj1.get();
        obj2.get();

        // obj1.show(); // cannot call a static method via object of the class
        mobile.show(obj2);

        // forcefully calling a class
        // Class.forName("mobile");

    }  
}