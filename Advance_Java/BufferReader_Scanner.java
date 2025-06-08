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
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);

        sc.close(); // closing the scanner
    }
}
