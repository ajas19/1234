package Queeue;

public class Queue {

    int front=0;
    int rear=-1;
    int queue[];
    int size;


    public Queue(int mxSize)
    {
        this.size=mxSize;
        this.queue=new int[mxSize];
    }


    public void enQueue(int data)
    {
       if (rear==-1)
       {
           rear=(rear+1)%size;
           queue[rear]=data;
           return;
       }
       if (((rear+1)%size)==front)
       {
           System.out.println("Queue is full");
            return;
       }else
       {
           rear=(rear+1)%size;
           queue[rear]=data;
       }



    }

    public void search(int data)
    {

        for (int i=0;i<size;i++)
        {
            if (queue[i]==data)
            {
                System.out.println("Element is found"+1+"position");
            }
            if (i==(size-1))
            {
                System.out.println("The elemet is not found in the queue");
            }
        }

    }



    public void peek()
    {
        if (rear==-1)
        {
            System.out.println("is empty");
        }else
        {
            System.out.println(queue[front]);
        }
    }


    public void deQueue()
    {
        if (rear==-1)
        {
            System.out.println("Queue is empty");
        }else
        {
            queue[front]=0;
            front=(front+1)%size;

        }
    }


    public void display()
    {
        for (int i=0;i< queue.length;i++)
        {
            System.out.println(queue[i]+" ");
        }
    }


    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.deQueue();
        System.out.println("  ");
        q.display();

        q.peek();
        q.search(30);

    }





}
