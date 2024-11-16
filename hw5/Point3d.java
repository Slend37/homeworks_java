package Lessson5;

public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d (double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    public Point3d(){
        this(0,0,0);
    }

    public double getX() {
        return xCoord;
    }

    public void setX(double val) {
        this.xCoord = val;
    }

    public double getY() {
        return yCoord;
    }

    public void setY(double val) {
        this.yCoord = val;
    }

    public double getZ() {
        return zCoord;
    }

    public void setZ(double val) {
        this.zCoord = val;
    }

    public boolean equals(Point3d obj) {
        return (this.xCoord == obj.xCoord) && (this.yCoord == obj.yCoord) && (this.zCoord == obj.zCoord);
    }

    public double distanceTo(Point3d obj) {
        double deltaX = this.xCoord - obj.xCoord;
        double deltaY = this.yCoord - obj.yCoord;
        double deltaZ = this.zCoord - obj.zCoord;
        double result = Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
        return Math.round(result * 100.0) / 100.0;
    }

}
