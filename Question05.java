public class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
        

    }
}

public class TreeMethods {
    Node root=null;

    public void insertA(int data){
        root=insert(root,data);
    }
    public Node insert(Node root, int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        else if(root.data > data){
            root.left = insert(root.left,data);
        }
        else if(root.data < data){
            root.right = insert(root.right,data);
        }
        return root;
    }

    public void predis(){
        root = predisplay(root);
    }
    public Node predisplay(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            root.left = predisplay(root.left);
            root.right = predisplay(root.right);
            return root;
        }
        return root;
    }

    public void indis(){
        root = indisplay(root);
    }
    public Node indisplay(Node root){
        if(root != null){
            root.left = indisplay(root.right);
            System.out.print(root.data+" ");
            root.right= indisplay(root.right);
            return root;
        }
        return root;
    }

    public void postdis(){
        root = postdisplay(root);
    }
    public Node postdisplay(Node root){
        if(root != null){
            root.left = postdisplay(root.left);
            root.right = postdisplay(root.right);
            System.out.print(root.data+" ");
            return root;
        }
        return root;
    }
    
}
