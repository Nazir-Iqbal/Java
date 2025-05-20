class demo
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;
        int z = 25;

        // finding the greatest of three no.s

        if(x>y && x>z){
            System.out.println("x");
        }else if(y>z){
            System.out.println("y");
        }else{
            System.out.println("z");
        }

        // ternary operator
        int num = 11;
        String result = (num%2==0)? "Even" : "Odd";
        System.out.println(result);

        // switch cases
        int n = 0;
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Enter the Valid number");
        }
    }
}