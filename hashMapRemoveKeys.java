public static void removeKeys(HashMap<String, String> map, String[] keys) {
    for (String key : keys) {
        map.remove(key);
    }
}