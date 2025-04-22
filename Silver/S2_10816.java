package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_10816 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            int M = Integer.parseInt(st.nextToken());

            sb.append(UpperBound(arr, M) - LowerBound(arr, M)).append(" ");
        }
        System.out.print(sb);
    }

    public static int UpperBound(int[] arr, int M){
        int left = 0;
        int right = arr.length;

        while(left < right){
            int mid = (left + right) /2;

            if(M < arr[mid]){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int LowerBound(int[] arr, int M){
        int left = 0;
        int right = arr.length;

        while(left < right){
            int mid = (left + right)/2;

            if(M <= arr[mid]){
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

}
