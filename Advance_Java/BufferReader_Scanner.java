import java.io.*;
import java.util.Scanner;

class Demo {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter the no. : ");
        
        // old way
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());

        // new way
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // System.out.println(num);

        // sc.close(); // closing the scanner
        // using try with resorces
        Scanner sc = new Scanner(System.in);
        // shortcut way
        // try(Scanner sc = new Scanner(System.in)){
        //     // scanner will automatically closed after the complete excution of the try block
        //     String n = sc.nextLine();

        // }
        try{
            String n = sc.nextLine();
            System.out.println(n);
        }
        finally{
            // this blok is used to close the resource
            sc.close();
        }
    }
}
