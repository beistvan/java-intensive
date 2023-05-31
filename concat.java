public static char[] concat(char[] str1, char[] str2) {
    char[] str = new char[str1.length + str2.length];

    int i = 0;

    while (i < str1.length) {
        str[i] = str1[i];
        i++;
    }

    while (i < str.length) {
        str[i] = str2[i - str1.length];
        i++;
    }

    return str;
}