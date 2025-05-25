class Demo
{
    public static void main(String[] args){
        int num = 10;
        // Interger num1 = new Integer(num); // boxing
        Integer num1 = num; // auto - boxing

        // num = num1.intValue(); //unboxing
        num  = num1; // auto unboxing

        // Primitive Type	    Wrapper Class
        // byte	            Byte
        // short	            Short
        // int	                Integer
        // long	            Long
        // float	            Float
        // double	            Double
        // char	            Character
        // boolean	            Boolean

        String str = "12";
        num = Integer.parseInt(str);
        System.out.println(3*num);
    }
}