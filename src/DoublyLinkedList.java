class DoublyLinkedList {
    public ListNode2 head = null;
    public int n = 0; // list size

    public void addFirst(Object o) {
        // TODO implement this...
        if(n== 0){
            head = new ListNode2(o, null, null);
        }else{
            ListNode2 node = head;
            head = new ListNode2(o, null, head);
            node.prev = head;
        }
        n++;
    }

    public Object get(int i) {
        // TODO implement this...
        ListNode2 node = head;
        if(i<0  ||  i>n){
            System.out.println("error");
        }else{
            for (int j=0; j<i; j++)
                node = node.next;
        }
        return node.element;
    }

    public void insert(Object o, int i) {
        // TODO implement this...
        if(i<0  ||  i>n){
            System.out.println("error");
        }else{
            if(i== 0){
                addFirst(o);
                return;
            }
            ListNode2 node1 = head;
            ListNode2 node2;
            for (int x = 0; x<i-1; x++){
                node1 = node1.next;
            }
            if(i == n){
                node1.next = new ListNode2(o, node1, node1.next);
            }else{
                node2 = node1.next;
                node1.next = new ListNode2(o, node1, node1.next);
                node2.prev = node1.next;
            }
            n++;
        }
    }

    public void remove(int i) {
        // TODO implement this...
        if (i<0 || i>=n){
            System.out.println("error");
        }else{
            if (i==0) {
                if(n== 1){
                    head = null;
                }else{
                    head.next.prev = null;
                    head = head.next;
                }
            }else{
                ListNode2 node1 = head;
                ListNode2 node2;
                for (int j=0; j<i-1; j++)
                    node1 = node1.next;
                if(i == n-1){
                    node1.next = null;

                }else{
                    node2 = node1.next.next;
                    node1.next = node1.next.next;
                    node2.prev = node1;
                }
            }
            n--;
        }
    }

    /**
     * Prints out the elements in the list from the first to the last (front to back) and then from the last to the first
     * (back to front). This is useful to test whether the list nodes are connected correctly with next and prev references.
     * DO NOT CHANGE THIS METHOD AS THIS WOULD CONFUSE THE AUTOMARKER!
     */
    public void print() {
        // no elements to print for empty list
        if (head == null) {
            System.out.println("list empty.");
            return;
        }

        // follow next references to list elements from the front to the back of the list
        System.out.print("front to back: ");
        ListNode2 node = head;
        System.out.print(node.element + " ");
        while (node.next != null) {
            node = node.next;
            System.out.print(node.element + " ");
        }

        // follow prev references to list elements from the back to the front of the list
        System.out.print("-- and back to front: ");
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.prev;
        }
        System.out.println();
    }
}
