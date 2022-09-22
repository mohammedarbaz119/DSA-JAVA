public class Generatespiralmatrix {
    public static void main(String[] args) {
        int n = 3;

        int arr[][] = new int[n][n];
        if (n == 1) {
            arr[0][0] = 1;
        } else {
            int left = 0;
            int right = n - 1;
            int top = 0;
            int bottom = n - 1;
            int c = 1;
            int count = 0;
            while (top <= bottom && left <= right) {
                switch (count) {
                    case 0:
                        for (int i = left; i <= right; i++) {
                            arr[top][i] = c;
                            c++;
                        }
                        top++;
                        break;
                    case 1:
                        for (int i = top; i <= bottom; i++) {
                            arr[i][right] = c;
                            c++;
                        }

                        right--;
                        break;
                    case 2:
                        for (int i = right; i >= left; i--) {
                            arr[bottom][i] = c;
                            c++;
                        }
                        bottom--;
                        break;
                    case 3:
                        for (int i = bottom; i >= top; i--) {
                            arr[i][left] = c;
                            c++;
                        }
                        left++;
                        break;
                    default:
                        System.out.println("invalid");
                }

                count = (count + 1) % 4;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
