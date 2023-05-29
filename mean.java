public static int mean(int[] array) {
    int sum = 0;
    for(int i = 0; i < array.length; i++){
        sum += array[i];
    }
    return array.length == 0 ? 0 : sum / array.length;
}