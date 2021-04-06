package Arrayss;

import java.util.Scanner;

// find all prime numbers upto n using seive of erothesis method
public class Allprime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] prime = new boolean[n+1];
        for (int i = 0; i <prime.length ; i++) {
            prime[i] = true;
        }
        for (int p = 2; p*p <prime.length ; p++) {
            if(prime[p]==true){
                for (int i = p*p; i <prime.length ; i+=p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i <prime.length ; i++) {
            if(prime[i]==true){
                System.out.println(i+" ");
            }
        }

//        checkPrime(23);
    }
    public static void checkPrime(int num){
        for (int i = 2; i <num ; i++) {
            if(num%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("it is prime :)");
    }
}
