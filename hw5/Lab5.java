package Lessson5;


public class Lab5 {

    public static void main(String[] args) {

        Point3d myPoint = new Point3d(0, 0, 0);
        Point3d myOtherPoint = new Point3d(1, 1, 0);
        Point3d aThirdPoint = new Point3d(0, 1, 0);
        if (myPoint.equals(myOtherPoint) || myOtherPoint.equals(aThirdPoint) || myPoint.equals(aThirdPoint)){
            System.err.println("ERROR. Same points");
        } else {
            System.out.print(computeArea(myPoint, myOtherPoint, aThirdPoint));
        }
    }

    public static double computeArea(Point3d myPoint, Point3d myOtherPoint, Point3d aThirdPoint){

        double deltaX = myPoint.distanceTo(myOtherPoint);
        double deltaY = myOtherPoint.distanceTo(aThirdPoint);
        double deltaZ = myPoint.distanceTo(aThirdPoint);

        double p = (deltaX + deltaY + deltaZ) / 2;

        return (Math.sqrt(p * (p - deltaX) * (p -  deltaY) * (p -  deltaZ)));
    }
}
