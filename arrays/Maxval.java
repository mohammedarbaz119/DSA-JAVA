public class Maxval {
    public static void main(String[] args) {
        int arr[] ={1,5,4,5};
        int max=0,s=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                s=max;
                
            }else if(arr[i]>=s){
s=arr[i];
            }
        }
        System.out.println(max+" "+s);
    }
}
