package Lecture1;

public class Rectarea {
    public static void main(String[] args) {
        int area1;
        int area2;
        double area3;
        Rectangle rect1=new Rectangle();
        Rectangle rect2=new Rectangle();
        Circle obj = new Circle();
        obj.setdata(8);
        area3= obj.area3();
        System.out.println("area of Circle ;" + area3);
        rect1.getdata(45,56);
        area1=rect1.area();
        System.out.println(area1);
        rect2.length=12;
        rect2.width=14;
        area2=rect2.length*rect2.width;
        System.out.println(area2);
    }
}
class Rectangle{
    int length,width;
    public void getdata(int x,int y) {
        length = x;
        width = y;
    }
    int area(){
        int area=length*width;
        return area;
    }

}
class Circle{
    int radius;
    void setdata(int radius){
         this.radius = radius;

     }
     double area3(){
         double area3 =3.14*radius*radius;
                 return area3;
     }
}
