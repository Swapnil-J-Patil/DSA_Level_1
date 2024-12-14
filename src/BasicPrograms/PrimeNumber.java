package BasicPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
    static boolean isPrime(int num)
    {
        if(num==2)
        {
            return true;
        }
        int div=2;
        while (div * div <num)
        {
            if (num % div==0)
            {
                return false;
            }
            div++;
        }

        return div*div > num; //After loop ends check if the div square is greater than the number
    }
}
