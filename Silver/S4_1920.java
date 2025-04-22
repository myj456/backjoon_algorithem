package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_1920 {
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
            int num = Integer.parseInt(st.nextToken());
            sb.append(numSearch(arr, num)).append("\n");
        }
        System.out.print(sb);
    }

    public static int numSearch(int[] arr, int num){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left + right) /2;

            if(arr[mid] < num){
                left = mid + 1;
            }
            else if(arr[mid] > num){
                right = mid - 1;
            }
            else if(arr[mid] == num){
                return 1;
            }
        }
        return 0;
    }
}
