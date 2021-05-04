package Greedy;
public class Dijkstra {
	public static void main(String[] args)
	{
		int[][] graph = {{0,3,0,0,5},{0,0,8,5,3},{0,0,0,0,0},{0,0,2,0,0},{0,0,0,4,0}};
		int key[]=new int[5];
		for(int i=0;i<key.length;i++)
		{
			key[i]=Integer.MAX_VALUE;
		}
		key[0]=0;
		boolean Mst[]=new boolean[5];
	    for(int count=0;count<4;count++)
	    {
	    	int u=-1;
	    	int min=Integer.MAX_VALUE;
	    	for(int i=0;i<5;i++)
	    	{
	    		if(!Mst[i] && key[i]<min)
	    		{
	    			min=key[i];
	    			u=i;
	    		}
	    	}
	    	Mst[u]=true;
	    	for(int j=0;j<5;j++)
	    	 {
	    		if(!Mst[j] && graph[u][j]!=0)
	    		{
	    			key[j]=Math.min(key[j],key[u]+graph[u][j]);
	    		}
	    	    	
	    	 }
	    	   
	    }
	    
	    for(int i=0;i<5;i++)
		{  
	    char c=(char)(65+i); 
		System.out.println("Distance from A ---> "+c +"="+ key[i]);
		}
	   
	}
}