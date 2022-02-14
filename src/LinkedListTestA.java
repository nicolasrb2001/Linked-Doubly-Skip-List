public class LinkedListTestA {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        LinkedList linkList = new LinkedList();
        linkList.addFirst("F"); // F
        System.out.println(linkList.head.element == "F" && linkList.tail.element == "F");
        linkList.remove(0); // Empty
        linkList.insert("D", 0); // D
        System.out.println(linkList.head.element == "D" && linkList.tail.element == "D");
        linkList.addFirst("C"); // C D
        System.out.println(linkList.head.element == "C" && linkList.tail.element == "D");
        linkList.insert(linkList.get(0), 1); // C C D
        linkList.addFirst("A"); // A C C D
        linkList.remove(1); // A C D
        linkList.insert("C", 3); // A C D C
        System.out.println(linkList.head.element == "A" && linkList.tail.element == "C");

        System.out.println(linkList.get(0));
        System.out.println(linkList.get(1));
        System.out.println(linkList.get(2));
        System.out.println(linkList.get(3));
    }
}
