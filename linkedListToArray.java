public static int[] toArray(Node node) {
    if (node == null)
        return new int[0];

    int n = 0;
    int[] a = new int[100];

    for (Node tmp = node; tmp != null; tmp = tmp.next) {
        a[n++] = tmp.data;
    }

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = a[i];
    }

    return arr;
}