public static void toUpperCase(char[] str) {
    for (int i = 0; i < str.length; i++) {
        if ('a' <= str[i] && str[i] <= 'z') {
            str[i] = (char)(str[i] - 'a' + 'A');
        }
    }
}
