package BasicPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
    static boolean isPrime(int num)
    {
        //check first if the number is 2 or not
        if(num==2)
        {
            return true;
        }

        //Set the divisor as 2
        int div=2;

        //Run the while loop till the square of divisor becomes less than num

        while (div * div <num)
        {
            //if the value of num % div == 0 then return value as false
            if (num % div==0)
            {
                return false;
            }

            //increase value of divisor by 1
            div++;
        }

        //After loop ends return the value of ( div square is greater than the number )

        return div*div >= num;
    }
}
