public static void stockBuy(int m, int[] array) {
    a: for(int i = 0; i < array.length - 1; i++){
        for(int j = i + 1; j < array.length; j++){
            if(array[i] + array[j] == m) {
                System.out.println(i + " " + j);
                break a;
            }
        }
    }
}