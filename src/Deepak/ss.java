package Deepak;
import java.util.*;
public class ss {
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] arr=new int[100000];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=rand.nextInt(1000);
		}

		long start = System.currentTimeMillis(); 
		
        selectionSort(arr);
        //bubbleSort(arr);
        //insertionSort(arr);
        long end = System.currentTimeMillis(); 
        System.out.println("selectionSort takes " + 
                                    (end - start) + "ms"); 
    } 

    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }
    public void  bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
}
