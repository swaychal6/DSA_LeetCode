package stack;

import java.util.*;

public class StackCode {
    public static void main(String[] args) {

        String str = "(((()(()))))";
        String str2="{}{}[]";
        System.out.println(isValid(str));
        System.out.println(isValid2(str2));
        int arr[]={1,2,3,4,5,6,44,22,33};

        Optional<Integer> first = Arrays.stream(arr).filter(i -> i % 2 == 0).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());
    }

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static boolean isValid2(String string){

        Stack<Character> stack=new Stack<>();

        for (char ch:string.toCharArray()){

            if(ch=='{'||ch == '[' ){
                stack.push(ch);
            }else if(ch=='}'||ch == ']' ){

                if(stack.isEmpty()){
                    return false;
                }
                 char top=stack.pop();
                if(ch=='{' && top!='}' || ch=='[' && top!=']'){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
