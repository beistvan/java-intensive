public static boolean perfectlyBalanced(int[] array) {
    if(array.length >= 0 && array.length <= 1){
        return true;
    } else {
        int sumL, sumR;
        for(int i = 1; i < array.length - 1; i++){
            sumL = 0;
            for(int j = 0; j < i; j++){
                sumL += array[j];
            }
            sumR = 0;
            for(int j = i + 1; j < array.length; j++){
                sumR += array[j];
            }
            if(sumL == sumR){
                return true;
            }
        }
        return false;
    }
}