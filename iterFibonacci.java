public static int iterFibonacci(int n) {
    if(n == 1){
        return 0;
    } else if (n == 2) {
        return 1;
    } else {
        int  f1 = 0, f2 = 1, fib = 1;
        while(n > 2){
            fib = f1 + f2;
            f1 = f2;
            f2 = fib;
            n--;
        }
        return fib;
    }
}