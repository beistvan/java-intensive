public static int[] findDuplicates(int[] array) {

    Set<Integer> store = new HashSet<>();
    Set<Integer> doubles = new HashSet<>();

    for (int i: array) {
        if (!store.add(i)) {
            doubles.add(i);
        }
    }

    return doubles.size() > 0 ? doubles.toArray(new Integer[doubles.size()]) : new int[0];

}