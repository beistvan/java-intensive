public static int min(int[] array) {
    if(array.length == 0){
        return 0;
    } else {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}