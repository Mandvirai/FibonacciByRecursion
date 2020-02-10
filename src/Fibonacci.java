import java.util.Scanner;
public class Fibonacci {
    static int n1 = 0,n2 = 1,n3 = 0;
    static void fibo(int count){
        if(count > 0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fibo(count-1);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        fibo(count-2);
    }
}
