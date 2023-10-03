import ds.stack.Stack;

public class App {

    public static void main(String[] args) {

        String normalString = "GooGlE";

        System.out.println(getReverseString(normalString));
    }

    public static String getReverseString(String str){
        String reverseStr = "";
        Stack stack = new Stack(str.length());
        for(int i =0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()){
            reverseStr =reverseStr+ stack.pop();
        }

        return reverseStr;
    }
}
