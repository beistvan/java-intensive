public static int[] findUniques(int[] array) {

    if (array.length == 0) {
        return array;
    }

    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

    for (int n: array) {
        hash.compute(n, (k, v) -> (v == null) ? 1 : v + 1);
    }

    int[] uniq = new int[hash.size()];
    int n = 0;

    for (HashMap.Entry<Integer, Integer> v: hash.entrySet()) {
        if (v.getValue() == 1) {
            uniq[n++] = v.getKey();
        }
    }

    return Arrays.copyOf(uniq, n);

    /*
    HashMap<Integer, Integer> ints = new HashMap<Integer, Integer>();
    for (int i: array) {
        ints.put(i, i);
    }
    return ints.keySet().stream().mapToInt(Integer::intValue).toArray();
    */
}
