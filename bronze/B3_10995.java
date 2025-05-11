package bronze;


import java.util.Scanner;

// 별찍기 - 20
public class B3_10995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.print(" ");
            }

            char c = '*';
            for(int j=0;j<n*2-1;j++){
                if(c == '*'){
                    System.out.print(c);
                    c = ' ';
                }
                else{
                    System.out.print(c);
                    c = '*';
                }
            }
            System.out.println();
        }
    }
}
