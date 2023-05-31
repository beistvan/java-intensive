public static int findChar(char[] str, char c) {
    for (int i = 0; i < str.length; i++) {
        if (str[i] == c) {
            return i;
        }
    }
    return -1;
}