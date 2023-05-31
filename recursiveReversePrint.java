public static void recursiveReversePrint(char[] c, int k) {
    if (k == 0) {
        System.out.print("");
    } else {
        System.out.print(c[k - 1]);
        recursiveReversePrint(c, k - 1);
    }
}