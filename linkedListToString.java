public static String toString(Node node) {
    if (node == null)
        return "";

    int size = 0;

    Node head = node;

    while (node != null) {
        size++;
        node = node.next;
    }

    String string = "";

    for (int i = 0; i < size - 1; head = head.next, i++) {
        string += head.data + " -> ";
    }

    return string + head.data;
}