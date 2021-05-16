package ds.model;

import java.util.Objects;

public class Employee {

    private int    eid;
    private String firstName;
    private String lastName;

    public Employee(int eid, String firstName, String lastName) {
        this.eid = eid;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return eid == employee.eid && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
