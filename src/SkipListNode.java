import java.util.Random;

class SkipListNode {
    public String element;
    public SkipListNode[] next;

    public SkipListNode(String s, int l) {
        element = s;
        next = new SkipListNode[l];
    }

    public SkipListNode(String s) {
        element = s;
        Random r = new Random();
        int l = 1;
        while (r.nextFloat() < 0.5 && l < 5) {
            l++;
        }
        next = new SkipListNode[l];
    }

    // Use getNext() in your inList() implementation instead of accessing the
    // next variable directly. The automarker needs this!
    public SkipListNode getNext(int i) {
      System.out.println("getNext(" + i + ")");
      return next[i];
    }
}
