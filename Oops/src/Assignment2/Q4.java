package Assignment2;
import java.util.*;
public class Q4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleType ob = new CircleType();
        System.out.println("Enter center of Circle (First x, Then y) : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Enter the radius ");
        double r = sc.nextDouble();
        ob.setCenter(x,y);
        ob.showPoint();
        ob.printCoordinate();
        ob.setRadius(r);

        ob.printArea();
        ob.printCircumference();
    }

}
class PointType{
    double x,y;
    PointType() {
        x=0;
        y=0;
    }
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y=y;
    }
    void showPoint() {
        if (x>=0) {
            if (y>=0) {
                System.out.println("these point is in first quardant");
            } else{
                System.out.println("this is fourth quardant");
            }
        }
        else {
            if(y>=0) {
                System.out.println("these point is in second quardant");
            }
            else {
                System.out.println("these point is in third quardant");
            }
        }
    }
    void printCoordinate () {
        System.out.println("("+ x + " , " +y + ")");
    }

     double getX() {
        return x;
    }
    double getY() {
        return y;
    }
}
class CircleType extends PointType {
    double radius;
    CircleType() {
        radius =0;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    void setCenter(double x,double y) {
        setX(x);
        setY(y);
    }
    void printRadius() {
        System.out.println("radius of the circle"+ radius);
    }
    void printArea() {
        double a = Math.PI*radius*radius;
        System.out.println("area of circle is = "+a);
    }
    void printCircumference(){
        double c = 2*Math.PI*radius;
        System.out.println("circumference =" + c);
    }
}