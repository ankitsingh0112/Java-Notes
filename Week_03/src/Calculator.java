// to import separately
/*
import CalcTools.BasicCalc;
import CalcTools.AdvCalc;
 */
// to import all file at once
import CalcTools.*;

// NOTE : when we have to access anything outside the package then we have to make it public

public class Calculator {
    public static void main(String[] args) {
        BasicCalc c1 = new BasicCalc();
        AdvCalc c2 = new AdvCalc();
        int res1 = c1.add(3,5);
        int res2 = c2.mul(3,5);
        System.out.println(res1 + " " + res2);
    }
}
