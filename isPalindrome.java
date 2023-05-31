public static boolean isPalindrome(char[] str1) {

    for (int i = 0; i <= str1.length / 2; i++) {
        if (str1[i] != str1[str1.length - i - 1]) {
            return false;
        }
    }
    return true;
}