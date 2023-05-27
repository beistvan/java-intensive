public static int max(int[] array) {
    if(array.length == 0){
        return 0;
    } else {
        int mx = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > mx){
                mx = array[i];
            }
        }
        return mx;
    }
}