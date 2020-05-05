/* Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.*/
import java.io.*;
class Subarray
{
    public int N;
    public int A[];
    public int S;
    private void input() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array:");
        N=Integer.parseInt(br.readLine());
        A=new int[N];
        int i;
        System.out.println("Enter the elements into the array:");
        for(i=0;i<N;i++)
        {
            A[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the sum required for the continuous subarray:");
        S=Integer.parseInt(br.readLine());

    }
    private void subarray()
    {
        int i,j;
        int sum=0,sum1=0;
        boolean flag=false;
        for(i=0;i<N;i++)
        {
            sum=0;
            sum1=0;
            for(j=i+1;j<N;j++)
            {
                sum1+=A[j];
                sum=A[i]+sum1;
                //System.out.println("sum=" + sum + ","+ "S="+S);
                if(sum==S)
                {
                    flag=true;
                    System.out.println("Starting position:" +i + " " + "Ending position:" +j); //array starting position is considered as 0
                    break;
                }
                    
            }
            if(flag==true)
                break;
            
        }
    }
    public static void main(String args[]) throws IOException
    {
        Subarray obj=new Subarray();
        obj.input();
        obj.subarray();
    }
}