public static int sum1n(int a)  {
    return a % 2 == 0 ? a / 2 *(a + 1) : (a + 1) / 2 * a;
}