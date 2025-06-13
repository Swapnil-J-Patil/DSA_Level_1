package ArrayProblems.BinarySearch;

//744. Find Smallest Letter Greater Than Target
public class SmallestLetterGTET {
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        System.out.println(smallestLetter(arr,'f'));
    }
    static char smallestLetter(char[] arr, char target)
    {
        int start=0;
        int end=arr.length -1;
        int length=arr.length;
        if(target >arr[end])
        {
            return arr[0];
        }
        while (start<=end)
        {
            int mid=start + (end -start)/2;
            if(target<arr[mid])
            {
                end=mid -1;
            }
            else
            {
                start=mid+1;
            }
        }
        return arr[start % length];
    }
}
