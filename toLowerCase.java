public static void toLowerCase(char[] str) {
    for (int i = 0; i < str.length; i++) {
        if ('A' <= str[i] && str[i] <= 'Z') {
            str[i] = (char)(str[i] - 'A' + 'a');
        }
    }
}