class LLforStack{

class node{

      int data;
      node next;
      node(int data){

      this.data=data;
      this.next=null;
}}

node head;
void push(int data)
{node newone=new node( data);
if(head==null)
head=newone;
else
newone.next=head;
head=newone;

}
     

void printlist()
{node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}



int pop()
{   
      if(head==null)
      {
            return -1;
      } 
      int a=head.data;
      head=head.next;
      return a;
}

int peek()
{
if(head==null)
{
      return 0;
}
int a=head.data;
return a;
}

public static void main(String args[])
{
LLforStack list=new LLforStack();
list.push(1);
list.push(2);
list.push(3);
list.push(6);
list.pop();
list.printlist();

}
}
