public static int median(int[] array) {
    for(int i = 0; i < array.length - 1; i++){
        for(int j = i + 1; j < array.length; j++){
            if(array[i] > array[j]){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
    return (array.length == 0) ? 0 :(array.length % 2 != 0 ? array[array.length / 2] : array[array.length / 2 - 1]);
}