public static Node removeByIndex(Node node, int index) {
    if (node == null)
        return null;

    Node tmp = node;

    int cnt = 0;

    while (tmp != null) {
        tmp = tmp.next;
        cnt++;
    }

    if (index > --cnt)
        return node;

    Node head = node;
    Node prev = null;

    for (int i = 0; i < index; i++) {
        prev = head;
        head = head.next;
    }

    if (index == 0)
        return head.next;

    prev.next = head.next;

    return node;
}