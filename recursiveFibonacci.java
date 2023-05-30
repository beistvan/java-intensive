public static int recursiveFibonacci(int n) {
    if (n == 1){
        return 0;
    } else if (n == 2 || n == 0){
        return 1;
    } else {
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}