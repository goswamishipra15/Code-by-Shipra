class MyCircularDeque {
    int[] queue;
    int front, tail;
    int count;

    public MyCircularDeque(int k) {
        queue = new int[k];
        front = -1;
        tail = -1;
        count = 0;
        
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + queue.length) % queue.length;
        if (isEmpty()) {
            tail = front;
        }
        queue[front] = value;
        count++;
        return true;
        
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        tail = (tail + 1) % queue.length;
        if (isEmpty()) {
            front = tail;
        }
        queue[tail] = value;
        count++;
        return true;
        
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % queue.length;
        count--;
        return true;
        
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        tail = (tail - 1 + queue.length) % queue.length;
        count--;
        return true;
        
    }
    
    public int getFront() {
        return isEmpty() ? -1 : queue[front];
        
    }
    
    public int getRear() {
        return isEmpty() ? -1 : queue[tail];
        
    }
    
    public boolean isEmpty() {
        return count==0;
        
    }
    
    public boolean isFull() {
        return count==queue.length;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
