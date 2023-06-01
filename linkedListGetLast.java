public static int getLast(Node node) {
    if (node != null) {
        Node lastNode = null;
        for (Node tmp = node; tmp != null; tmp = tmp.next) {
            lastNode = tmp;
        }
        return lastNode.data;
    }
    return -1;
}