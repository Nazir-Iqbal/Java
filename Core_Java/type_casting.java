class cast{

    public static void main(String args[]){
        byte b = 127;
        int a = 258;
        // explicit type casting
        b = (byte)a; // result in the num%256
        // implicit type casting
        // a = b;
        float f = 5.6f;
        int num = (int)f; // losing the valus after the point

        byte num1 = 30;
        byte num2 = 10;

        int result = num1*num2; // type promotion
        System.out.println(result);

        System.out.println(b);
        System.out.println(num);
    }
}