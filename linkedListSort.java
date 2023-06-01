public static Node sort(Node node) {

    Node current = node, index = null;

    int temp;

    if (node == null) {
        return null;
    } else {
        while (current != null) {
            index = current.next;

            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    return node;
}