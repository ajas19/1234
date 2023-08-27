public class Selectionsort{


    public static void slectionsort(int arr[])
    {

    for(int i=0;i<arr.length;i++)
    {
     int min=i;


     for(int j=i+1;j<arr.length;j++)
     {
       if(arr[j]<arr[min]) {
       min=j;
       }
     }
      int temp=arr[min];

     arr[min]=arr[i];

        arr[i]=temp;
    }
    }



public static void main(String [] args)
{
    int ar[] = {7,5,8,9,1,4,3,0};


    slectionsort(ar);

    for(int i=0;i<ar.length;i++)
    {
       System.out.println(ar[i]);

    }
}
}

