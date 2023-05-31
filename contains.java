public static boolean contains(char[] str, char[] substr) {
    if (substr.length == 0){
        return true;
    }
    int sL = substr.length;
    int l = str.length - substr.length;
    int k = 0;

    for (int i = 0; i < l; i++) {
        if (str[i] == substr[k]) {
            for (int j = 0; j < substr.length; j++) {
                if (str[i + j] == substr[j]) {
                    sL--;
                    if (sL == 0) {
                        return true;
                    }
                }
            }
        }
    }
    return false;

    //return str.toString().contains(substr.toString());
}