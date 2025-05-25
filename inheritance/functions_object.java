class Laptop
{
    String model;
    int price;

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass()) // checking the class type
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
    // public boolean equals(Laptop obj){
    //     return this.model.equals(obj.model) && this.price == obj.price;
    // }
    
}

class Demo
{
    public static void main(String[] args)
    {
        Laptop obj1 = new Laptop();
        obj1.model = "Dell Inspiron";
        obj1.price = 65000;

        Laptop obj2 = new Laptop();
        obj2.model = "Dell Inspiron";
        obj2.price = 65000;

        // Laptop obj2 = new Laptop();
        // obj2.model = "Asus Gaming";
        // obj2.price = 70000;

        System.out.println(obj1.equals(obj2));
    }
}