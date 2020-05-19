//Array rotation using the juggling algo, that is solved with a constant complexity
import java.io.*;
public class JugglingAlgo
{
    public int gcd(int a, int b)
    {
        if(b==0)
            return 0;
        else
            return gcd(b,a%b);
    }

    public void rotate(int ar[],int size,int rotation)
    {
        int i,j,k,temp;
        for(i=0; i<gcd(size,rotation); i++)
        {
            temp=ar[i];
            for(j=i; j<size; j+=rotation)
            {
                k=(j+rotation)%size;
                if(k==i)
                    ar[j]=temp;
                else
                    ar[j]=ar[k];
            }
         }
    }
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
