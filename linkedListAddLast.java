public static Node addLast(Node node, int newData) {
    Node newNode = new Node(newData);
    if (node != null) {
        Node lastNode = null;
        for (Node tmp = node; tmp != null; tmp = tmp.next) {
            lastNode = tmp;
        }
        lastNode.next = newNode;
        lastNode.next.data = newData;
        return node;
    }
    return newNode;
}