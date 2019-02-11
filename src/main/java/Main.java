import java.util.Scanner;

public class Main {

    public static void main(String[] argv){

        Scanner myscan = new Scanner(System.in);

       int fNum = myscan.nextInt();
       int sNum = myscan.nextInt();

       Calculator calc = new Calculator();


       calc.adder(fNum, sNum);
       calc.subtractor(fNum,sNum);
       calc.multiplicanas(fNum,sNum);
       calc.divider(fNum,sNum);





    }


}
