public static int maxOfThree(int a, int b, int c) {
    a = a > b ? a : b;
    return a > c ? a : c;
}