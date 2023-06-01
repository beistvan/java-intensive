public static int indexOf(Node node, int data) {
    if (node == null) return -1;
    int index = 0;
    for (Node tmp = node; tmp != null; tmp = tmp.next) {
        if (tmp.data == data) {
            return index;
        }
        index++;
    }
    return -1;
}