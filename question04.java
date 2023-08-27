package stackpractice;

public class Stack {

    int sta[] = new int[5];
    int top=-1;

    public void push(int data)
    {
        if (top == sta.length-1)
        {
            System.out.println("Stack is full");
        }else
        {
            sta[++top]=data;
        }
    }

    public void pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is Empty");
        }else {
            sta[top]=0;
            top--;
        }
    }


    public void peek()
    {
        if (top==-1)
        {
            System.out.println("The stack is Empty");
        }else
        {
            System.out.println(sta[top]);
        }
    }


    public void display()
    {
        for (int i=0;i< sta.length;i++)
        {
            System.out.print(sta[i] + " ");
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.display();
        System.out.println("");
        st.pop();
        st.display();
    }


}
