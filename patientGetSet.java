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

    // methods
    // getter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    // setter for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter for lastName
    public String getLastName() {
        return this.lastName;
    }

    // setter for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // getter for iin
    public String getIIN() {
        return this.iin;
    }

    // setter for iin
    public void setIIN(String iin) {
        this.iin = iin;
    }

    // getter for age
    public int getAge() {
        return this.age;
    }

    // setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // getter for weight
    public int getWeight() {
        return this.weight;
    }

    // setter for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // getter for height
    public int getHeight() {
        return this.height;
    }

    // setter for height
    public void setHeight(int height) {
        this.height = height;
    }

}