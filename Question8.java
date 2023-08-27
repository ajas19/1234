public class InsertionSort{

public static void insertionsort(int arr[])
{

    for(int i=1;i<arr.length;i++)
    {
        int key = arr[i];
        int j=i-1;
        while(j>-1 && arr[j]>key)
        {
            arr[j+1] = arr[j];
      
            j--; 
	    
            arr[j+1] = key;
        }

    }
}

public static void main(String [] args)
{
    int arr[] = {6,1,2,3,4,789,8};
    insertionsort(arr);


    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
 
}
