/* Move all negative elements to end
 
 Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.
 
 Input : 
 N = 8
 arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
 Output : 
 1  3  2  11  6  -1  -7  -5 */
import java.util.*;
import java.util.ArrayList;
public class array02 {
    public static void moveElements(int arr[], int n){
        if(arr.length<=1)
            return;
        ArrayList<Integer> arrli=new ArrayList<Integer>(n);
        int i;
        for (i=0;i<n;i++){
            if (arr[i]>=0){
                arrli.add(arr[i]);
            }
        }
        for (i=0;i<n;i++){
            if(arr[i]<0){
                arrli.add(arr[i]);
            }
        }
        for (i=0;i<n;i++){
            arr[i]=arrli.get(i);
        }   
    }  
    public static void main(String[] args){
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n=arr.length;
        moveElements(arr,n);
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
    }
}

