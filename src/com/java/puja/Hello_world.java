package com.java.puja;
  public class Hello_world {
    public static void element(int[] arr,int n ) {
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }

        if (j == n || j == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
        public static void main(String[] args){
            int[] arr={1,-1,3,2,-7,-5,11,6};
            int n=8;
            element(arr,n);
        }
}
