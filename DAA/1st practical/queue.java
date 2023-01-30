//implementation of queue using normal array
class queue
{
    int a[];
    int size;
    int front;
    int rear;
    int curr_size;

    queue( int size)
    {
        this.size=size;
        a=new int[size];
        front=0;
        rear=0;
        curr_size=0;
    }
//O(1) for pushing
    void push(int x)
    {
        if(rear==size)
        { System.out.println("queue is full");
        return;}
        else
        {
            a[rear]=x;
            rear++;
            curr_size++;
        }
    }
    //O(n)  for popping
    // need to make O(1)
    int pop()
    { 
        int c;
        if(rear==0)
    return -1;
    else{
         c=a[front];
        for(int i=0;i<curr_size-1;i++)
        {
            a[i]=a[i+1];

        }
        rear--;
        curr_size--;
    }
    return c;}
    int getSize()
    {
        return curr_size;
    }
    int getFront()
    {
        return a[front];
    }
    int getLast()
    {
return a[rear-1];
    }
    void show()
    {
        for(int i=0;i<curr_size;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args)
    {
        queue s1=new queue(5);
        s1.push(10);
        s1.push(11);
        s1.push(12);
        s1.push(13);
        //s1.push(14);
        //s1.push(16);
       // s1.pop();
        s1.show();
        System.out.println(s1.getFront() +" "+ s1.getLast()+" "+s1.getSize());
    }
}