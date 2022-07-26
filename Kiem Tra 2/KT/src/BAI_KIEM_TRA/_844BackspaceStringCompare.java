package BAI_KIEM_TRA;

import java.util.Stack;

public class _844BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 =new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        boolean res = true;
        for (int i=0; i<s.length(); i++){

            if(s.charAt(i)!='#'){
                stack1.add(s.charAt(i));
            }
            if(stack1.isEmpty()){
                continue;
            }
            if (s.charAt(i)=='#'){
                stack1.pop();
            }
        }

        for (int i=0; i<t.length(); i++){
            if(t.charAt(i)!='#'){
                stack2.add(t.charAt(i));
            }
            if(stack2.isEmpty()){
                continue;
            }
            if (t.charAt(i)=='#'){
                stack2.pop();
            }
        }

        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.peek()==stack2.peek()){
                res = true;
                stack1.pop();
                stack2.pop();
            }else{
                return false;
            }
        }

        if(!stack1.isEmpty()){
            return false;
        }

        if(!stack2.isEmpty()){
            return false;
        }

        return res;
    }
}
