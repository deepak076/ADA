package Deepak;

import java.util.Random;

public class quickS
{
    static int k=0;
public static void main(String[] args)
{
    Random rand = new Random();
    int[] arr1=new int[1000];
    for(int i=0;i<arr1.length;i++)
    {
        arr1[i]=rand.nextInt(1000);
    }
    int l=0;
    int h1=arr1.length-1;

    int[] arr2=new int[1000];
    for(int i=0;i<arr2.length;i++)
    {
        arr2[i]=i+1000;
    }
    int[] arr3=new int[1000];
    int j=0;
    for(int i=arr3.length;i>0;i--)
    {
        arr3[j]=i+1000;
        j++;
    }
    int h2=arr2.length-1;
    int h3=arr3.length-1;
    int[] arr4=new int[1000];
    for(int i=0;i<arr2.length;i++)
    {
        arr4[i]=100;
    }
    int h4=arr4.length-1;


    long start = System.currentTimeMillis(); 
    k=0;
    sort(arr1,l,h1);
    System.out.println(k);
    long end = System.currentTimeMillis(); 
    System.out.println("quicksort takes " + 
                                (end - start) + "ms"); 
    long start1 = System.currentTimeMillis(); 
    k=0;
    sort(arr2,l,h2);
    System.out.println(k);
    long end1 = System.currentTimeMillis(); 
    System.out.println("quicksort takes " + 
                                (end1 - start1) + "ms"); 
    long start2 = System.currentTimeMillis(); 
    k=0;
    sort(arr3,l,h3);
    System.out.println(k);
    long end2 = System.currentTimeMillis(); 
    System.out.println("quicksort takes " + 
                                (end2 - start2) + "ms"); 
    long start3 = System.currentTimeMillis(); 
    k=0;
    sort(arr4,l,h4);
    System.out.println(k);
    long end3 = System.currentTimeMillis(); 
    System.out.println("quicksort takes " + 
                                (end3 - start3) + "ms"); 
    
    
}
public static void sort(int arr[],int l, int h)
{
    if(h>l)
    {   
        
        int p=partition(arr,l,h);
        sort(arr,l,p-1);
        sort(arr,p+1,h);                    
    }
    k++;
    
}
public static int partition(int arr[],int l,int h)
{
    int pivot=arr[h];                               
    int i=l-1;
    for(int j=l;j<=h-1;j++)
    {
        if(arr[j]<pivot)
        {   
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    int temp1=arr[i+1];
    arr[i+1]=arr[h];
    arr[h]=temp1;
    
    return i+1;
}
}