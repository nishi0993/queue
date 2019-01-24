package main;

public class queue_ds {
    int[] q;
    int size,total,front,rear;
    public queue_ds()
    {
        size=10;
        total=0;
        front=0;
        rear=0;
        q=new int[size];
    }
    boolean isFull()
    { boolean re=false;
        if(front==q.length-1 &&rear==q.length-1)
          re=true;
        return re;
    }
    void enqueue(int value)
    {
        if(front==0 && rear==0){
            front=;
        rear=;
        }
    }
    int dequeue()
    {

    }
}
