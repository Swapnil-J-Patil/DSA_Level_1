package ArrayProblems.LeetcodeProblems;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for (char c: s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
                stack.push(c);
            }
            else {
                if(c==')')
                {
                    //return false if the stack is empty or the top element is not the open parenthesis
                    //Which means no gate can be opened after this
                    if(stack.isEmpty() || stack.pop()!='(')
                    {
                        return false;
                    }
                } else if (c==']') {
                    if(stack.isEmpty() || stack.pop()!='[')
                    {
                        return false;
                    }
                } else if (c=='}') {
                    if(stack.isEmpty() || stack.pop()!='{')
                    {
                        return false;
                    }
                }
            }
        }
        //return whether the stack is empty or not
        return stack.isEmpty();
    }
}
