package Array;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class ArrayStructure {
    public static void insert(int arr[],int value,int index)
    {
        if (index < arr.length && index > 0)
        {
            for (int i= arr.length-1; i>index;i--)
            {
                arr[i] = arr[i-1];
            }
            arr[index] = value;

        }

    }


    public static void search(int arr[],int value)
    {
        int key =1;

        for (int i=0;i< arr.length-1;i++)
        {
            if (arr[i] == value)
            {
                System.out.println("Value is found in"+i+" index");
                key=1;
                break;
            }else
            {
                key=0;
            }
        }
        if (key==0)
        {
            System.out.println("Value is not found");
        }
    }


    public static void delete(int arr[],int value)
    {
        int key=1;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == value)
            {
                System.out.println("value is "+ i + "Student");

                for (int j=i;j<arr.length-1;j++)
                {
                    arr[j] = arr[i+1];
                }
                arr[arr.length-1] =0;

                key=1;
                break;
            }
            else {
                key=0;
            }
        }

        if (key==0)
        {
            System.out.println("that value value is not exist");
        }
    }





    public static void display(int arr[])
    {

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = input.nextInt();
        System.out.println("");

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + "value:");
            int val = input.nextInt();
            arr[i] = val;
        }


        while (true) {
            System.out.println("");
            System.out.println("1)insert number");
            System.out.println("2)Delete number");
            System.out.println("3)search");
            System.out.println("4)display");
            System.out.println("5)Exit");
            System.out.println("Select the number from above option");
            int choice = input.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter the value need to be store:");
                    int val= input.nextInt();
                    System.out.println("Enter the index need to be store:");
                    int index= input.nextInt();
                    insert(arr,val,index);
                    display(arr);
                    break;
                case 2:

                    System.out.println("Enter the value need to be delete:");
                    int del= input.nextInt();
                    delete(arr,del);
                    display(arr);

                    break;
                case 3:
                    System.out.println("Enter the value need to be search:");
                    int sear= input.nextInt();
                    search(arr,sear);
                    break;
                case 4:
                    display(arr);
                    break;
                case 5:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");


            }

        }
    }


}
