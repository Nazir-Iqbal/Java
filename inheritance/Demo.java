import java.util.Vector;

import tools.*;

class Demo
{
    public static void main(String[] args){
        // Calc obj = new Calc();
        
        // System.out.println(obj.add());
        // System.out.println(obj.mul());

        // AdvCalc obj2 = new AdvCalc();
        // obj2.show();
        // obj2.num1 = 12;
        // obj2.num2 = 3;
        // System.out.println(obj.add());
        // System.out.println(obj.mul());
        // System.out.println(obj2.exp());

        VeryAdvCalc obj3 = new VeryAdvCalc();
        obj3.num1 = 36;
        obj3.num2 = 12;
        obj3.show();
        System.out.println(obj3.div()); // Calc
        System.out.println(obj3.exp()); // AdvCalc
        System.out.println(obj3.factor()); // VeryAdvCalc
    }
}