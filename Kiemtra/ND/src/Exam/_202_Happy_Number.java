package Exam;

public class _202_Happy_Number {
    public static int tongbinhphuong(int a){
        int kq =0;
        while(a!=0){
            kq += (a%10)*(a%10);
            a/=10;
        }
        return kq;
    }
    public static boolean isHappyNumber(int n){
        int i;
        int j;
        i = j = n ;
        do{
            i = tongbinhphuong(i);
            j=tongbinhphuong(tongbinhphuong(j));
        }while (i != j);

        return (i==1);
    }

    public static void main(String[] args) {
        int a = 64;
        System.out.println(tongbinhphuong(a));
    }
}
