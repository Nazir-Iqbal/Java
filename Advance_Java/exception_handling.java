// creating the custom exception
class MyException extends Exception
{
    public MyException(String s){
        super(s);
    }
}

class Demo{
    public static void main(String[] args){
        int i = 10;
        int j = 100;

        try{
            int result = i/j;
            // System.out.println(result);
            // throw the exception
            if(result == 0){
                // throw new ArithmeticException("Don't want the result to be zero");
                throw new MyException("This is the custom exception");
            }
        }
        catch(ArithmeticException e){
            System.out.println("This is the exception of divide by 0 : " + e);
        }
        catch(MyException e){
            System.out.println("This is the exception  : " + e);
        }
        catch(Exception e){
            System.out.println("This is the some other exception.. " + e);
        }
    }
}