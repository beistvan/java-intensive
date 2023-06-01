public static int[] findDuplicates(int[] array) {
    /*
    System.out.print("array: ");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
    */
    HashMap<Integer, Integer> store = new HashMap<Integer, Integer>();
    for (int i: array) {
        Integer count = store.get(i);
        if (count == null) {
            store.put(i, 1);
        } else {
            store.put(i, ++count);
        }
    }
    /*
    System.out.print("dict: ");
    for (int i: store.keySet()) {
        System.out.print(i + " : " + store.get(i) + ", ");
    }
    System.out.println("size: " + store.size());
    */

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
        //System.out.println(dblInts[i]);
    }
    return dblInts;
    /*
    Set<Integer> store = new HashSet<>();
    Set<Integer> doubles = new HashSet<>();
    for (int i: array) {
        if (!store.add(i)) {
            doubles.add(i);
        }
    }
    return doubles.size() > 0 ? doubles.toArray(new Integer[doubles.size()]) : new int[0];
    */
}