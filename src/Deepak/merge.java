package Deepak;
import java.util.Random;
public class merge {
public static void main(String[] args)
{
	Random rand = new Random();
	int[] arr1=new int[10000];
	for(int i=0;i<arr1.length;i++)
	{
		arr1[i]=rand.nextInt(10000);
	}
	int l=0;
	int h1=arr1.length-1;

	int[] arr2=new int[100000];
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]=i+100;
	}
	int[] arr3=new int[100000];
	int j=0;
	for(int i=arr3.length;i>0;i--)
	{
		arr3[j]=i;
		j++;
	}
	int h2=arr2.length-1;
	int h3=arr3.length-1;
	int[] arr4=new int[100000];
	for(int i=0;i<arr2.length;i++)
	{
		arr4[i]=1;
	}
	int h4=arr4.length-1;


	long start = System.currentTimeMillis(); 
	sort(arr1,l,h1);
    long end = System.currentTimeMillis(); 
    System.out.println("MergeSort takes " + 
                                (end - start) + "ms"); 
	long start1 = System.currentTimeMillis(); 
	sort(arr2,l,h2);
    long end1 = System.currentTimeMillis(); 
    System.out.println("MergeSort takes " + 
                                (end1 - start1) + "ms"); 
	long start2 = System.currentTimeMillis(); 
	sort(arr3,l,h3);
    long end2 = System.currentTimeMillis(); 
    System.out.println("MergeSort takes " + 
                                (end2 - start2) + "ms"); 
	long start3 = System.currentTimeMillis(); 
	sort(arr4,l,h4);
    long end3 = System.currentTimeMillis(); 
    System.out.println("MergeSort takes " + 
                                (end3 - start3) + "ms"); 
	
	
}
public static void sort(int arr[],int l,int r)
{
	if(l<r)
	{
		int m=l+(r-l)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		merge(arr,l,m,r);
	}
}

public static void merge(int arr[],int l,int m,int r)
{
	int n1=m-l+1;
	int n2=r-m;
	int left[]=new int[n1];
	int right[]=new int[n2];
	for(int i=0;i<n1;i++)
	{
		left[i]=arr[l+i];
	}
	for(int i=0;i<n2;i++)
	{
		right[i]=arr[m+1+i];
	}
	int k=l;
	int i=0;
	int j=0;
	while(n1>i && n2>j)
	{
		if(left[i]>right[j])
		{
			arr[k]=right[j];
			j++;
		}
		else
		{
			arr[k]=left[i];
			i++;
		}
		k++;
	}
	while(i<n1)
	{
		arr[k]=left[i];
		i++;
		k++;
	}
	while(j<n2)
	{
		arr[k]=right[j];
		j++;
		k++;
	}
	
}

}