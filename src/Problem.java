public class Problem {

    public static void main(String[] args) {
        System.out.println(returnInt("LIII"));
    }

    //V,I,X,L,C
    //VII, XXVI
    static int returnInt(String str)
    {
        int ans=0;
        for(char ch: str.toCharArray())
        {
            switch (ch)
            {
                case 'V':
                {
                    ans+=5;
                    break;
                }
                case 'I':
                {
                    ans+=1;
                    break;
                }
                case 'L':
                {
                    ans+=50;
                    break;
                }
                case 'C':
                {
                    ans+=100;
                    break;
                }
                case 'X':
                {
                    ans+=10;
                    break;
                }

            }
        }
        return ans;
    }
}
