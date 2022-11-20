import java.util.Stack;

public class Validparenthesis {
    public static void main(String[] args) {
        Stack<Character> a = new Stack<>();
        String b = "(1+(2*3)+((8)/4))+1";

        if(b.compareTo("")==0||b.indexOf('(')==-1||b.indexOf(')')==0){
            System.out.println(0);
        }
        int c =0,maxc =0;
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i)=='('){
                a.add(b.charAt(i));
                c++;
            }
            else if(b.charAt(i)==')'){
                maxc = Math.max(maxc, c);
                a.pop();
                c--;
            }
            if(a.size()==0){
                maxc = Math.max(maxc, c);
                c=0;
            }
        }
        System.out.println(maxc);
    }
}
