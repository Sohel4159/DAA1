
class node
{
int data;
node left;
node right;
node(int data)
{
    this.data=data;
    this.left=null;
    this.right=null;
}

node root;

static void inOrderTraversal(node root)
{
    if(root!=null)
    {
        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }
}

public static void main(String[] args)
{ 
node a=new node(1);
node b= new node(2);
node c=new node(3);
node d=new node(4);
node e=new node(5);
node f=new node(6);
node g=new node(7);
a.left=b;
a.right=c;
b.right=d;
b.left=e;
c.left=f;
c.right=g;

inOrderTraversal(a);
}


}
