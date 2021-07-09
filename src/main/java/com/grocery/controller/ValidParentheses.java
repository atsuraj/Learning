package com.grocery.controller;


import java.util.Stack;

public class ValidParentheses {

    char[] bracketStart = {'(','{','['};
    char[] bracketClose = {')','}',']'};
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        return  checkExpression(1,s,stack);
    }

    public boolean checkExpression(int i, String s, Stack<Character> stack){

        while(i<s.length()) {
            char c1 = s.charAt(i);
            if (!stack.empty()) {
                char c = stack.peek();
                if(( c== bracketClose[0] || c ==  bracketClose[1]|| c == bracketClose[2] )
                        && (c1 == bracketStart[0] || c1 ==  bracketStart[1]|| c1 == bracketStart[2] ) )
                    return false;


                if ((c1 == ')' && c == bracketStart[0])
                        || (c1 == '}' && c == bracketStart[1]) ||
                        (c1 == ']' && c == bracketStart[2])) {
                    stack.pop();
                } else {
                    stack.push(c1);
                }
            } else {
                stack.push(c1);
            }
            i++;
           // System.out.println(i);
        }

        return stack.empty();
    }

    public static void main(String[] args) {
       ValidParentheses v = new ValidParentheses();
        System.out.println(v.isValid("{{(])[}}"));
    }

}
