class array_stack
{
    int top=-1;
    size=0;
    int a[];
    array_stack(int n)
    {
        a=new int[n];
    }

void push(int x)
  {
    if(top==a.length-1)
    {
        System.out.println("Stack is full");
    }
    else
    {
        top++;
        a[top]=x;
        size++;
    }
  }




}
class stack
{
    public static void main(String [] args)
    {
       array_stack s1=new array_stack(3);
       s1.push(1); 
       s1.push(2);
       s1.push(3);
       s1.push(4);

    }
}