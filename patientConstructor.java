class Patient {
    // fields
    private String firstName;
    private String lastName;
    private String iin;
    private int age;
    private int weight;
    private int height;

    // constructor
    Patient(String firstName, String lastName, String iin, int age, int weight, int height){
        this.firstName = firstName;
        this.lastName = lastName;
        this.iin = iin;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}