 public static String hashPass(String password) {
     int code = password.hashCode();
     String hashed = Integer.toString(code);
     return hashed;
 }

public static String allowedChars = "0123456789";

public static String bruteforcePass(String hashedPass) {
    int i, len;
    String str = "";
    ex: for (i = 0; i < 100000; i++) {
        str = Integer.toString(i);
        len = str.length();
        for (int j = 0; j <= 5 - len; j++) {
            if (hashPass(str).equals(hashedPass)) {
                break ex;
            }
            str = "0" + str;
        }
    }
    return str;
}