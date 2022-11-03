public class LOnngpressed {
    public static void main(String[] args) {
        String a ="alex";
        String b = "aaleex";
        int i=0,j=0;
        while(i<a.length()&&j<b.length()){
           
if(a.charAt(i)!=b.charAt(j)){
    i++;
}if(a.charAt(i)!=b.charAt(j)){
    System.out.println(false);
    break;
}
j++;
        }
        System.out.println(true);
    }
}
