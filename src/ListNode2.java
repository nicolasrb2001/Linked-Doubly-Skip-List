class ListNode2 {
    public Object element;
    public ListNode2 prev = null;
    public ListNode2 next = null;

    ListNode2(Object e, ListNode2 p, ListNode2 n) {
        element = e;
        prev = p;
        next = n;
    }
}
