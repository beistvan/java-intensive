public static boolean isAnagram(char[] str1, char[] str2) {

    if (str1.length != str2.length) {
        return false;
    }

    for (int i = 0; i < str1.length - 1; i++) {
        for (int j = i + 1; j < str1.length; j++) {
            if (str1[i] > str1[j]) {
                char c = str1[i];
                str1[i] = str1[j];
                str1[j] = c;
            }
        }
    }

    for (int i = 0; i < str2.length - 1; i++) {
        for (int j = i + 1; j < str2.length; j++) {
            if (str2[i] > str2[j]) {
                char c = str2[i];
                str2[i] = str2[j];
                str2[j] = c;
            }
        }
    }

    for (int i = 0; i < str1.length; i++) {
        if (str1[i] != str2[i]) {
            return false;
        }
    }

    return true;
}