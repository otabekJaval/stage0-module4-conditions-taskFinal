package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {

    public static void main(String[] args) {
      printCompletelyDivided(25,5);
    }
    public static void printCompletelyDivided(int dividend, int divider) {

        if(divider==0) {System.out.println("division by zero");return;}

        double res = dividend / divider;

        System.out.println(res*divider==dividend?"can be divided completely":"cannot be divided completely");
    }
}
