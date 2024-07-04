package Assignment1;
import java.util.Scanner;
public class Q7 {
    static void findDistinctProduct(int[]x , int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (x[i]!=x[j]|| x[i]==x[j]) {
                    if(x[i]*x[j] % 2 != 0) {
                        System.out.println(x[i]+ " " + x[j]);
                }
            }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n= sc.nextInt();
        System.out.println("enter the elements s");
        int a[] = new int[n];
        int b[] = new int[n];
        boolean flag = false;
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n && flag!= false; i++) {
            for (int j = 0; j <10 ; j++) {
                if(i!=j && (a[i]*a[j]%2!=0)) {
                    flag=false;
                    break;
                }

            }
            if(flag==false) {
                System.out.println("yes this is a pair");
            } else{
                System.out.println("there is no pair");

                findDistinctProduct(b,n);
            }

        }


    }

}
