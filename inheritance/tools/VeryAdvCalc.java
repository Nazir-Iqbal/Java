package tools;
import java.util.Vector;

public class VeryAdvCalc extends AdvCalc
{

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public Vector<Integer> factor(){
        Vector<Integer> vec1 = new Vector<>();
        int gcd = gcd(num1,num2);

        for(int i=1;i<=gcd;i++){
            if(num1%i == 0 && num2%i==0) vec1.add(i);
        }

        return vec1;
    }
}

// multi level inheritance
// Calc <--- AdvCalc <-- VeryAdvCalc