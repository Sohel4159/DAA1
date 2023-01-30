class node
{
int data;
node prev;
node next;
node(int data)
{
    this.data=data;
    this.next=null;
    this.prev=null;
}
}

class DLL
{
node head;
node tail;

void addFirst(int x)
{  node temp=new node(x);
    if(head==null)
    {
        head=temp;
        tail=head;
    }
    else{
    temp.next=head;
    head.prev=temp;
    head=temp;
    }

}

void addLast(int x)
{
node temp=new node(x);
if(head==null)
{
    head=temp;
    tail=temp;
}
else
{
tail.next=temp;
temp.prev=tail;
tail=temp;
}


}

void deleteFirst()
{
    head=head.next;
}
void deleteLast()
{ 
    tail=tail.prev;
    tail.next=null;
}

void printList()
{
    node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
}



public static void main(String[] args)
{
    DLL list=new DLL();
    list.addFirst(10);
    list.addFirst(20);
    list.addFirst(30);
    list.addLast(20);
    list.addLast(10);
    list.printList();
    list.deleteFirst();
    list.printList();
    list.deleteLast();
    list.printList();
}
}

