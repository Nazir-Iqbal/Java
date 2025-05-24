import tools.*;

class calc
{
    int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalc
{
    // method overriding 
    int add(int n1, int n2){
        System.out.println("Calling the overrided method");
        return n1 + n2 + 1;
    }
}

class Demo
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(2, 3));
    }
}