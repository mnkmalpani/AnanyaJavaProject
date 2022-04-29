package com.java.puja;

public class KthSmallestElement {


        public static void main(String[] args) {
            int []a= {7 ,10,4,3,20,15};
            int k =3;
            for(int i=0; i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;

                    }
                }
                if(i==k-1)
                {
                    System.out.println((k+"smallest element is"+a[i]));

                }
            }
            System.out.println("-----------");
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]+" ");
            }
        }

    }
