// Q. check if number is prime or not 

import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
      
       
       while(t>0){
            
           int n = sc.nextInt();
           
           boolean isPrime = true;
           
           if(n<=1){
               System.out.print("prime");
           }
           else{
               for(int i=2; i*i<=n; i++){
                   if(n % i == 0){
                       isPrime = false;
                       break;
                   }
               }
               if(isPrime){
                   System.out.println("prime");
               }
               else{
                   System.out.println("not prime");
               }
           }
           t--;
           
       }
    }
}

//as we can see after the factors of n becomes equal or let say n >= a x b , then after this factors will start to repeat themselves so we will check until this only
// or we can say n number n if it has to be divided gets divided till its square root after that it doesnt
// pq=n , p>sqrt(n) -> not possible
       //      && 
     //     q>sqrt(n) -> not possible,
	//	  p and q both being greater than n is possible.


