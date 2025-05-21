class calculator
{
    public int add(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
}

class demo
{
    public static void  main(String args[]){
        int num1 = 4;
        int num2 = 5;

        // creating the object for the class
        calculator calc = new calculator(); 

        // int result = num1 +  num2;
        int result = calc.add(num1,num2);

        System.out.println(result);
    }
}