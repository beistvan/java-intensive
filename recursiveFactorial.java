public static int recursiveFactorial(int n) {
    return n == 1 ? 1 : n * recursiveFactorial(n - 1);
}