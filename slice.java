public static int[] slice(int[] array, int from, int to) {
    if(array.length == 0){
        return new int[0];
    } else {
        int[] tmpArr = new int[array.length];
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(i >= from && i < to){
                tmpArr[cnt++] = array[i];
            }
        }
        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            arr[i] = tmpArr[i];
        }
        return arr;
    }
}