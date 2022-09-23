package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {

    public  void validate(double A, double B, double C) {

        if (!(A > 0 && B > 0 && C > 0)||B-A>C) System.out.println("it's not a triangle");
        else if (A + B > C|| B + C > A && C + A > B) System.out.println("this is a valid triangle");
        else System.out.println("it's not a triangle");

    }
}
