class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class MyHashSet {

    ListNode head;

    public MyHashSet() {
        head = null;
    }
    
    public void add(int key) {
        if(head == null) {
            head = new ListNode(key);
        }
        else {
            if(!this.contains(key)) {
                ListNode temp = new ListNode(key);
                temp.next = head;
                head = temp;
            }
        }
    }
    
    public void remove(int key) {
        ListNode temp = head, prev = null;
        if(head == null)
            return;
        if(head.val == key) {
            temp = head.next;
            head = temp;
        }
        else if(head.val == key && head.next == null) {
            head = null;
        }
        else {
            while(temp != null) {
                if(temp.val == key && temp.next != null) {
                    prev.next = temp.next;
                }
                if(temp.val == key && temp.next == null) {
                    prev.next = null;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }
    
    public boolean contains(int key) {
        ListNode temp = head;
        while(temp != null) {
            if(temp.val == key)
                return true;
            temp = temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */