public static void reverse(int[] array) {
    for(int i = 0; i < array.length / 2; i++){
        int tmp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = tmp;
    }
}