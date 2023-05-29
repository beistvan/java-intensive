public static void swap(int[] array, int i, int j) {
    if(i >= 0 && j >= 0 && array.length > 0){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}