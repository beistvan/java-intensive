public static int[] findDuplicates(int[] array) {

    HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
    for (int i: array) {
        Integer count = store.get(i);
        if (count == null) {
            store.put(i, 1);
        } else {
            store.put(i, ++count);
        }
    }

    int[] ints = new int[store.size()];

    int n = 0;
    for (int i: store.keySet()) {
        int k = store.get(i);
        if (k > 1) {
            ints[n++] = i;
        }
    }

    int[] dblInts = new int[n];
    for (int i = 0; i < n; i++) {
        dblInts[i] = ints[i];
    }
    return dblInts;
}