class MyCircularQueue {
    final int arr[];
    int rear = -1, front = 0, len = 0;
    public MyCircularQueue(int k) {
        arr = new int[k];
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        rear = (rear+1)%arr.length;
        arr[rear] = value;
        len++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%arr.length;
        len--;
        return true;
    }
    
    public int Front() {
         return isEmpty() ? -1 : arr[front];
    }
    
    public int Rear() {
         return isEmpty() ? -1 : arr[rear];
    }
    
    public boolean isEmpty() {
        return len == 0;
    }
    
    public boolean isFull() {
        return arr.length == len;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
