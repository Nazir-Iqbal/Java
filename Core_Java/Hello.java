/* 
PS D:\Java> jshell
|  Welcome to JShell -- Version 21.0.7
|  For an introduction type: /help intro

jshell> 10+3
$1 ==> 13

jshell> 10-3
$2 ==> 7

jshell> System.out.print(10)
10
jshell> System.out.print("This is jshell");
This is jshell
*/

class Hello{
    public static void main(String a[]){

        // integer
        int num = 15;
        byte by = 127;
        short sh =  76;
        long l = 212323l;

        // decimal
        double d = 123.123; // by defaullt
        float f = 123.123f;

        // character
        char c = 'c';

        // boolean
        boolean bool = true;

        System.out.print("Hello World");
    }

}