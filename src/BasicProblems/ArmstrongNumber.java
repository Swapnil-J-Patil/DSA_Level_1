package BasicProblems;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    static boolean isArmstrong(int num)
    {
        int original=num; //We are changing the num over the time that's why keep the original value stored beforehand
        int sum=0;
        while (num>0)
        {
            int rem=num%10;
            sum= sum + rem*rem*rem;
            num=num/10;
        }
        return original==sum;
    }
}
