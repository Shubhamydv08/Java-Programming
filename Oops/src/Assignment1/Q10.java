package Assignment1;

public class Q10 {
    String name;
    int reg;
    double marks;
    void setData(String n,int r,double m) {
        this.name=n;
        this.reg=r;
        this.marks=m;
    }
    void displayData() {
        System.out.println("name = "+name +" registration no. "+ reg +"marks= "+ marks);
    }

    public static void main(String[] args) {
        Q10 student1 = new Q10();
        student1.setData("shubham",2141011156,84.5);
        student1.displayData();
    }
}
