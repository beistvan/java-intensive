public static int pow(int a, int b) {
    int prod = a;
    for(int i = 1; i < b; i++){
        prod *= a;
    }
    return prod;
}