package Lessson5;

import java.time.LocalDate;

public class Lesson5 {
    public static void main(String[] args) {
        Point2d myPoint = new Point2d ();
        Point2d myOtherPoint = new Point2d (5,3);
        Point2d aThirdPoint = new Point2d ();

        Point3d myPoint2 = new Point3d ();
        Point3d myOtherPoint2 = new Point3d(0,3,4);
        Point3d aThirdPoint2 = new Point3d ();
        System.out.println(myPoint2.distanceTo(myOtherPoint2));


    }
}
