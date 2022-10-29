public class Removedupchars {
    static String rem(String a,String b,int idx){
        if(idx>=a.length()){
            return b;
        }
        if(!b.contains(a.substring(idx,idx+1))){
b+=a.charAt(idx);
        }
        return rem(a, b, idx+1);
    }
    public static void main(String[] args) {
        String a ="arbazuddinqureshi";
        System.out.println(rem(a, "", 0));
    }
}
