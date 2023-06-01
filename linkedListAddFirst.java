public static Node addFirst(Node node, int newData) {
    Node newNode = new Node(newData);
    if (node != null) {
        newNode.next = node;
    }
    return newNode;
}