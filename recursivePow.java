public static int recursivePow(int a, int b) {
    if(b == 1){
        return a;
    } else {
        return a * recursivePow(a, b - 1);
    }
}