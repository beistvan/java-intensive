public static HashMap<String, String> searchPhoneBook(HashMap<String, String> phonebook, String value) {
    HashMap<String, String> phones = new HashMap<String, String>();
    if (value.equals("tech")) value = " " + value;
    for (HashMap.Entry<String, String> entry: phonebook.entrySet()) {
        if (entry.getKey().contains(value)) {
            phones.put(entry.getKey(), entry.getValue());
        }
    }
    return phones;
}
