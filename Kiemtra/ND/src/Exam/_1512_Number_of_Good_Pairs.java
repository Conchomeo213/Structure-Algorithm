package Exam;

public class _1512_Number_of_Good_Pairs {
    public static int numIdenticalPairs(int[] a) {
        int n = a.length;
        int biendem = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i]==a[j]){
                    biendem++;
                }
            }
        }
       return biendem;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(a));
    }
}
