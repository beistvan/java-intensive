public static void printValues(HashMap<String, String> map) {
    for (String key : map.keySet()) {
        System.out.println(map.get(key));
    }
}