package oop.inheritance;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        boolean isFirstNameEmpty = firstName.isEmpty();
        boolean isLastNameEmpty = lastName.isEmpty();

        if (isFirstNameEmpty && isLastNameEmpty)
            return "";

        if (isFirstNameEmpty)
            return lastName;

        if (isLastNameEmpty)
            return firstName;

        return firstName + " " + lastName;
    }
}
