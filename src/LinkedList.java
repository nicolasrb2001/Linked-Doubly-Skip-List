class LinkedList {
    public ListNode head = null;
    public ListNode tail = null;
    public int n = 0;

    public void addFirst(Object o) {
        // TODO implement this
        if(n== 0){
            head = new ListNode(o, null);
            tail = head;
        }else{
            head = new ListNode(o, head);
        }
        n++;
    }

    public Object get(int i) {
        // TODO implement this
        ListNode node = head;
        if(i<0  ||  i>=n){
            System.out.println("error");
        }else{
            for (int j=0; j<i; j++)
                node = node.next;
        }
        return node.element;
    }

    public void insert(Object o, int i) {
        // TODO implement this
        if(i<0  ||  i>n){
            System.out.println("error");
        }else{
            if(i== 0){
                addFirst(o);
                return;
            }
            if(i == n){
                add(o);
                return;
            }
            ListNode node = head;
            for (int x = 0; x<i-1; x++){
                node = node.next;
            }
            if(i == n-1){
                tail = node.next;
            }
            node.next = new ListNode(o, node.next);
            n++;
        }

    }

    public void remove(int i) {
        // TODO implement this
        if (i<0 || i>n){
            System.out.println("error");
        }else{
            if (i==0) {
                head = head.next;
            }else{
                ListNode node = head;
                for (int j=0; j<i-1; j++)
                    node = node.next;
                if(i == n-1){
                    tail = node;
                }
                node.next = node.next.next;
            }
            n--;
        }
    }

    public void add(Object o) {
        // TODO implement this
        if (n ==0){
            addFirst(o);
        }else {
            ListNode node = tail;
            ListNode new_node = new ListNode(o, null);
            node.next = new_node;
            tail = new_node;
            n++;
        }

    }
}
