//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
import java.io.*;
public class ArrayRotation
{
    public void rotate(int ar[],int size,int rotation)
    {
        int i;
        /*int new_ar[] = new int[size]; //using temp array
        for (i = 0; i < size; i++)
        {
         new_ar[i] = ar[(i + rotation) % size];
        }*/
        int k,zeroth;
        for(k=0;k<rotation;k++)
        {
            zeroth=ar[0];
            for(i=0;i<size-1;i++)
            {
                ar[i]=ar[(i+1)%size];
            }
            ar[size-1]=zeroth;
        }
    }
    //printing
    public void print(int ar[],int size)
    {
        int i;
        for(i=0;i<size;i++)
        {
            System.out.print(ar[i]+ " ");
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int size,rotation,i;
        System.out.println("Enter the size of the array");
        size=Integer.parseInt(br.readLine());
        int a[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(i=0;i<size;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the rotation required");
        rotation=Integer.parseInt(br.readLine());
        ArrayRotation ob=new ArrayRotation();
        System.out.println("Rotated Array:");
        ob.rotate(a,size,rotation);
        ob.print(a,size);
    }
}
