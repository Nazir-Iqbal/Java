import java.io.*;
import java.util.*;

class Main {
    public static void solve(Scanner sc, PrintWriter out) {
        out.println("Hello world");
    }

    public static void main(String[] args) throws IOException {
        // Redirect input and output
        FileInputStream fis = new FileInputStream("input.txt");
        System.setIn(fis);

        FileOutputStream fos = new FileOutputStream("output.txt");
        System.setOut(new PrintStream(fos));

        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc, out);
        }

        out.flush();
        sc.close();
        out.close();
    }
}