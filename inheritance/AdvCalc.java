import java.util.Vector;

public class AdvCalc extends Calc
{
    public void show(){
        System.out.println(num1 + " : " + num2);
    }

    public int exp(){
        int x = num1,y = num2;
        int ans = 1,pow = x;
        while(y!=0){
            if((y&1)==1) ans = ans * pow;
            pow = pow*x;
            y>>=1;
        }
        return ans;
    }
}