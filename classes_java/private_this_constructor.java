class Human
{
    private String name;
    private int age; 

    // default constructor
    public Human(){
        name = "Noob";
        age = -12;
    }

    // parametrised constructor
    public Human(int age,String name){
        this.age = age;
        this.name = name;
    }
    
    // implementing the getter and setter function
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class demo
{
    public static void main(String args[]){
        Human obj = new Human(12,"Titan");
        System.out.println(obj.getName() + " : " + obj.getAge());
        // obj.name = "Nazir"; // cannot acess this objects directly because they are private;
        // obj.age = 12; 

        obj.setName("Nazir");
        obj.setAge(21);

        System.out.println(obj.getName() + " : " + obj.getAge());

        // anonymous abject
        // new Human().show(); // every we call this new object is created
    }
}


// naming convention
// camel casing
// class and interface --> starts with capital letter
// var and methods --> starts with small letter
// constants --> all capital