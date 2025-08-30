
// we will do the optimized version of the prime number in which it takes less time using the sieve of eratostheness method

public class PrimeOptimum {
    public static void main(String[] args) {
       int n=40;
       boolean[] primes=new boolean[n+1];// here we are checking for the 40 number also that's why we need size of n+1;
       Sieve(n,primes);
    }

    // Initially all the elements in the primes array will be false
    // here false means that number is prime number
    public static void Sieve(int n,boolean[] prime){
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                for(int j=i*2;j<=n;j+=i){
                    prime[j]=true;
                }
            }

        }
   for(int i=2;i<=n;i++){
        if(!prime[i]){
            System.out.println(i+" ");
        }
   }
    }
}
