package LinkDemo;

public class LinkList1 {
    Node head;


    public void insertFront(int data) {

        Node newNode = new Node(data);

        if (isEmpty())
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;


    }


    public void insertAfter(int data,int pos) {

        Node newNode = new Node(data);

        if (isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }

        Node current=head;
        while (current!=null)
        {
            if (current.data==pos)
            {
                newNode.next=current.next;
                current.next=newNode;
            }
            current=current.next;
        }

    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (isEmpty())
        {
            head=newNode;
            return;
        }

        Node last= head;

        while (last.next!=null)
        {
            last= last.next;
        }

        last.next=newNode;
        newNode=last;

    }


    public void search(int key) {

        int test=1;

        if (isEmpty())
        {
            System.out.println("list is Empty");
            return;
        }

        Node current= head;

        while (current!=null)
        {
            if (current.data==key)
            {
                System.out.println("Value is found");
                key=1;
                break;
            }else
            {
                key=0;
            }
            current=current.next;
        }
        if (key==0)
        {
            System.out.println("not found");
        }

    }


    public void display() {

        if (isEmpty())
        {
            System.out.println("List is Empty");
            return;
        }

        Node current=head;
        while (current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }

    public boolean isEmpty() {
        return head==null;
    }


    public static void main(String[] args) {

        LinkList1 ls = new LinkList1();
        ls.insertFront(10);
        ls.insertEnd(50);
        ls.insertFront(20);
        ls.insertAfter(450,50);
        ls.search(25);

        ls.display();


    }
}
