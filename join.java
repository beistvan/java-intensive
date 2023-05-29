public static int[] join(int[] array1, int[] array2) {
    int[] array = new int [array1.length + array2.length];
    int k = 0;
    for(int i = 0; i < array1.length; i++){
        array[k++] = array1[i];
    }
    for(int i = 0; i < array2.length; i++){
        array[k++] = array2[i];
    }
    return array;
}