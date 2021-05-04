package Greedy;



public class knapsack {

	public static void main(String[] args) {
		int weight[] = {2,3,5,7,1,4,1};
		int profit[] = {10,5,15,7,6,18,3};
		//Profit By weight
		float pByw[] = new float[weight.length];
		//Ratio
		float rhalfobj[] = new float[weight.length];
		double total=0;
		for(int i=0;i<weight.length;i++)
		{
			rhalfobj[i]=0;
		}
		int capacity = 15;
		for(int i=0;i<pByw.length;i++)
		{
			pByw[i]=(float)profit[i]/(float)weight[i];
		}
		sort(pByw,weight,profit);
		for(int i=rhalfobj.length-1;i>=0;i--)
		{	
			if(capacity-weight[i]>=0)
			{
				capacity=capacity-weight[i];
				rhalfobj[i]=1;				
			}
			else
			{
				rhalfobj[i]=(float)capacity/(float)weight[i];
				break;
			}
		}
		System.out.println("Weight Array : ");
		for(int i=0;i<weight.length;i++)
		{
			System.out.print(weight[i]+" ");
		}
		System.out.println();
		System.out.println("Profit Array : ");
		for(int i=0;i<weight.length;i++)
		{
			System.out.print(profit[i]+"\t ");
		}
		System.out.println();
		System.out.println("Profit by weight Array : ");
		for(int i=0;i<weight.length;i++)
		{
			System.out.print(String.format("%.2f", pByw[i])+"\t ");
		}
		System.out.println();
		System.out.println("rhalfobj Array : ");
		for(int i=0;i<weight.length;i++)
		{
			System.out.print(String.format("%.2f", rhalfobj[i])+"\t ");
		}
		for(int i=0;i<weight.length;i++)
		{
			total = total + rhalfobj[i]*profit[i];
		}
		System.out.println();
		System.out.println("Maximum Profit = "+total);
		
		

	}
	public static void sort(float[] arr,int[] weight,int[] profit)
	{
		float temp1=0;
		int temp2=0;
		int temp3=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp1=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp1;
					temp2=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=temp2;
					temp3=profit[j];
					profit[j]=profit[j+1];
					profit[j+1]=temp3;
					
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
	}

}