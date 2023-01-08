public class PrimeSequence implements Sequence {
    // initializes variables
    private int p;
    public PrimeSequence(){
        p = 1;
    }

    public int next(){
        boolean isPrime = true;     // boolean to determine if p is prime number
        while(isPrime){
            p++;
            for (int d = 2; d * d <= p; d++){
                if (p % d == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){       // return prime number
                return p;
            }
            isPrime = true;
        }
        return p;
    }
}
