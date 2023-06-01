public static int size(Node node) {
    int countNode = 0;
    for (Node tmp = node; tmp != null; tmp = tmp.next) {
        countNode++;
    }
    return countNode;
}