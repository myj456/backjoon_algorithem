package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드룸
public class B2_10174 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder(br.readLine());
            String s = sb.toString().toUpperCase();
            String sr = sb.reverse().toString().toUpperCase();

            if(sr.equals(s)){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }



    }
}
