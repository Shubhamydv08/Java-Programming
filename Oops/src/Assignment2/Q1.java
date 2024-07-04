package Assignment2;
import java.util.Scanner;
class Commission{
    int sales;

    public Commission(int sales) {
    }

    void commission(int sales) {
       this.sales=sales;
    }
    double getCommission() {
       if(sales<500)
           return (sales*0.02);
       else if(sales>500 && sales<5000)
           return (sales*0.05);
       else
           return (sales*0.08);

    }

}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sale amount : ");
        int sales = sc.nextInt();
        Commission c1 = new Commission(sales);
        if (sales<0)
            System.out.println("invalid input");
        else
            
            System.out.println("The total commission of the sale = "+c1.getCommission() );



    }
}
