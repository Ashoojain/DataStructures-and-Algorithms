import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        QuickSort1(a,0,n-1);
        for (int h=0;h<n;h++)
            System.out.print(a[h]+" ");
    }
    static void QuickSort1(int[] a,int b,int c)
    {
        if(b>=c)
            return;

       int P= partition(a,b,c);// finding pivot
       QuickSort1(a,b,P-1);   //recursive call before pivot
       QuickSort1(a,P+1,c); // recursive call after pivot
    }
    static int partition(int[] a,int b,int c)
    {
        int pivot=a[c];
        int i=b-1;
        int j=b;
        for(; j<=c-1;j++)
        {
            if(a[j]<=pivot)
            {
                i++;
                int k=a[i];
                a[i]=a[j];
                a[j]=k;
            }
        }
        int l=a[i+1];
        a[i+1]=a[c];
        a[c]=l;

        return i+1;
    }


}
