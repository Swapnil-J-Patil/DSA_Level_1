package BasicPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    static boolean isArmstrong(int num)
    {
        //Store the original number beforehand
        int original=num;

        //Initialize sum to 0
        int sum=0;

        //Rum the while loop till the number is greater than 0
        while (num>0)
        {
            //get the remainder (num % 10)
            int rem=num%10;

            // Add the 3 times product of rem to the existing sum
            sum+=rem*rem*rem;

            //Divide the num with 10
            num/=10;
        }

        //return the value of (original==sum)
        return original==sum;
    }
}
