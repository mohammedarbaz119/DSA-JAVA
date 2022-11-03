public class REvprefixString {
    public static void main(String[] args) {
        String a = "abcdefg";
        char b ='d';
        int k=-1;
        String c="";


        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b){
k=i;
break;


            }
        }
            if(k==-1){
                System.out.println(a);
                return;
            }
            else{
for (int j = k; j >=0; j--) {
    c+=a.charAt(j);
}
c+=a.substring(k+1);
System.out.println(c);
            }
        }
    }

