import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4};

        for (int i = 0; i<arr.length - 1; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}