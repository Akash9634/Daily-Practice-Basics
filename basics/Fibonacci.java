// Q. Fibonacci series - value of nth number is the sum of previous 2 numbers 

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        
        if(n==1){
            System.out.println(n1);
        }
        else if(n==2){
            System.out.println(n2);
        }
        else{
        for(int i=3; i<=n; i++){
            n3 = n1 + n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
        }
        
    }
        
    }
}
