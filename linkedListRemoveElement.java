public static Node removeElement(Node node, int data) {
    if (node == null) {
        return null;
    }
    Node prev = null;
    for (Node tmp = node; tmp != null; tmp = tmp.next) {
        if (tmp.data == data) {
            if (prev == null) {
                return tmp.next;
            }
            prev.next = tmp.next;
            return node;
        }
        prev = tmp;
    }
    return node;
}