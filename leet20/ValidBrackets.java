//package leet20;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Stack;
//
//public class ValidBrackets {
//    public static void main(String[] args) {
//        String s = "{}[]]";
//        System.out.println(new Solution2().isValid(s));
//    }
//}
//
///**
// * 题目描述：
// * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
// *
// *
// */
//class Solution1{
//
//    private static final Map<Character, Character> map =new HashMap<>(){{
//        put('(', ')');
//        put('[', ']');
//        put('{', '}');
//        put('?', '?');
//    }};
//
//    public boolean isValid(String s){
//        if (s.length()>0 && !map.containsKey(s.charAt(0))) {
//            return false;
//        }
//        LinkedList<Character> stack = new LinkedList<>() {{
//            add('?');
//        }};
//        for (Character c : s.toCharArray()) {
//            if (map.containsKey(c)) {
//                stack.addLast(c);
//            }else if (map.get(stack.removeLast()) != c) {
//                return false;
//            }
//        }
//        return stack.size() == 1;
//    }
//}
//
//class Solution2{
//    public boolean isValid(String s){
//        if(s.isEmpty())
//            return true;
//        Stack<Character> stack=new Stack<Character>();
//        for(char c:s.toCharArray()){
//            if(c=='(')
//                stack.push(')');
//            else if(c=='{')
//                stack.push('}');
//            else if(c=='[')
//                stack.push(']');
//            else if(stack.empty()||c!=stack.pop())
//                return false;
//        }
//        if(stack.empty())
//            return true;
//        return false;
//    }
//}