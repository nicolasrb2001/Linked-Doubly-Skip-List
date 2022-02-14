class SkipList {
    public SkipListNode[] head;
    public int n = 0; // list size

    public SkipList() {
        // TODO implement this
        head = new SkipListNode[5];
        for (int i = 0; i<5; i++){
            head[i] = null;
        }
    }

    public void createTestList() {
        // TODO implement this
        SkipListNode anne = new SkipListNode("Anne");
        while(anne.next.length != 3){
            anne = new SkipListNode("Anne");
        }
        SkipListNode ben = new SkipListNode("Ben");
        while(ben.next.length != 1){
            ben = new SkipListNode("Ben");
        }
        SkipListNode charlie = new SkipListNode("Charlie");
        while(charlie.next.length != 2) {
            charlie = new SkipListNode("Charlie");
        }
        SkipListNode don = new SkipListNode("Don");
        while(don.next.length!= 1){
            don = new SkipListNode("Don");
        }
        SkipListNode ernie = new SkipListNode("Ernie");
        while(ernie.next.length != 3){
            ernie = new SkipListNode("Ernie");
        }
        for (int i = 0; i<3; i++){
            head[i] = anne;
        }
        anne.next[0] = ben;
        ben.next[0] = charlie;
        charlie.next[0] = don;
        don.next[0] = ernie;
        anne.next[1] = charlie;
        charlie.next[1] = ernie;
        anne.next[2] = ernie;

    }

    public void print() {
        // TODO implement this
        for (int i = 4; i>-1; i--){
            SkipListNode node = head[i];
            while(node != null){
                if(node.next[i]!= null){
                    System.out.print(node.element + ", ");
                }else{
                    System.out.print(node.element);
                    System.out.println();
                }
                node = node.next[i];
            }
        }
    }

    // Use getHead() in your inList() implementation below instead of accessing
    // the head variable directly. The automarker needs this!
    public SkipListNode getHead(int i) {
      System.out.println("getHead(" + i + ")");
      return head[i];
    }

    public boolean inList(String s) {
        // TODO implement this

        // NOTE: you must use getNext(i) here instead of next[i], and getHead(i)
        // instead of head[i] to access the next variable in a SkipListNode and
        // the head veriable in this SkipList class. Also, you must not make any
        // unnecessary calls to getHead() and getNext() (e.g. not call node.getNext(1)
        // and then again node.getNext(1) on the same node object -- instead store
        // node.getNext(1) in a local variable).

        SkipListNode node_head = null;
        SkipListNode node = null;
        for (int i = 3; i>-1; i--){
            if(node_head == null){
                node = getHead(i);

                node_head = node;
            }else{
                node = node_head;
            }

            while(node != null){
                if(node.element.compareTo(s) == 0){
                    return true;
                }else{
                    if(node.element.compareTo(s)>0){
                        break;
                    }else{
                        node_head = node;
                    }
                    node = node.getNext(i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SkipList sl = new SkipList();
        sl.createTestList();
        sl.print();
        System.out.println();
        System.out.println(sl.inList("Anne") + " should be true");
        System.out.println(sl.inList("Ben") + " should be true");
        System.out.println(sl.inList("Charlie") + " should be true");
        System.out.println(sl.inList("Don") + " should be true");
        System.out.println(sl.inList("Ernie") + " should be true");
        System.out.println(sl.inList("Arya") + " should be false");
        System.out.println(sl.inList("Elmo") + " should be false");
        System.out.println(sl.inList("Zorro") + " should be false");
    }
}
