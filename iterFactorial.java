public static int iterFactorial(int n) {
    if(n == 1){
        return 1;
    }else{
        return n * iterFactorial(n - 1);
    }
}