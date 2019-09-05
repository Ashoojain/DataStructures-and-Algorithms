import java.util.*;
public class MergeSort {
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
                int a=in.nextInt();
          int[] b=new int[a];
          for(int i=0;i<a;i++)
          {
              b[i]=in.nextInt();
          }
          mergesort1(b,0,a-1);
          for (int j=0;j<a;j++)
              System.out.print(b[j]+" ");
    }
    static void mergesort1(int[] b,int c,int d)
    {
        if(c>=d)
            return;
        int mid=(c+d)/2;
        mergesort1(b,c,mid);  //recursive call
        mergesort1(b,mid+1,d);// recursive call
        merge(b,c,d);   // merge
    }
    static void merge(int[] b,int c,int d)  // merging and sorting
    {
        int mid=(c+d)/2;
        int i=c;
        int j=mid+1;
        int k=c;
        int[] temp=new int[100];
        while (i<=mid && j<=d)
        {
            if(b[i]<=b[j])
                temp[k++]=b[i++];
            else
                temp[k++]=b[j++];
        }
        while (i<=mid)
            temp[k++]=b[i++];
        while (j<=d)
            temp[k++]=b[j++];
        for (int l=c;l<=d;l++)
            b[l]=temp[l];
    }
}
