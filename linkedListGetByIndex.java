public static int getByIndex(Node node, int index) {
    if (node == null) return -1;
    int thisIndex = 0;
    for (Node tmp = node; tmp != null; tmp = tmp.next) {
        if (thisIndex == index) {
            return tmp.data;
        }
        thisIndex++;
    }
    return -1;
}