public class REmovea {
    static String rema(String a,String b,int idx){
        if(idx==a.length()){
            return b;
        }
        if(a.charAt(idx)=='a'){
            return rema(a, b, idx+1);
        }
        b+=a.charAt(idx);
        return rema(a, b, idx+1);
    }
    public static void main(String[] args) {
        String a ="arbazadasaaasaa";
        System.out.println(rema(a,"", 0));
    }
}
