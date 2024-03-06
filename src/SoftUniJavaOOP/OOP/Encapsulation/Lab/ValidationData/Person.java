package SoftUniJavaOOP.OOP.Encapsulation.Lab.ValidationData;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private double salary;

    public Person(String firstname, String lastname, int age, double salary) {
        setFirstname(firstname);
        setLastname(lastname);
        setAge(age);
        setSalary(salary);
    }

    private String getFirstname() {
        return firstname;
    }

    private void setFirstname(String firstname) {
        if (firstname.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstname = firstname;
    }

    private double getSalary() {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        return salary;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    private String getLastname() {
        if (lastname.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        return lastname;
    }

    private void setLastname(String lastname) {
        if (lastname.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastname = lastname;
    }

    private int getAge() {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        return age;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %.2f leva", firstname, lastname, salary);
    }

    public void increaseSalary(double percentage) {
        if (this.getAge() >= 30) {
            salary = salary * (1 + (percentage / 100));
        } else {
            salary = salary * (1 + (percentage / 200));
        }
    }
}
