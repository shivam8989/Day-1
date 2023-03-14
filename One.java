package training;
import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr [] = new int[5];
        for(int i = 0; i <= arr.length-1; i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i<arr.length-1; i++){
        System.out.println(arr[i]);

    }
        int n = sc.nextInt();
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i]==n){
                System.out.println(i);
            }
        }
}
}
