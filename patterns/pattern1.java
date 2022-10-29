public class pattern1 {
    public static void main(String[] args) {
        int n=5,k=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = n-i; j < n; j++) {
                System.out.print(k+" ");
                k++;
                
            }
            System.out.println();
            
        }
    }
}
