public static int parseInt(char[] str) {

    int n = 0, b = str[0] == '-' || str[0] == '+' ? 1 : 0;

    for (int i = b; i < str.length; i++) {
        n = n * 10 + str[i] - '0';
    }

    return str[0] == '-' ? -n : (str[0] == '+' ? n : n);
}