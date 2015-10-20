package com.example.pasidu.helloworld.model;

public class EmployeeDetails {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    private String organizationName;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    private String jobTitle;

    public static EmployeeDetails GetInstance(){
        EmployeeDetails emp = new EmployeeDetails();
        emp.setFirstName("Jolie");
        emp.setLastName("Gallegos");
        emp.setOrganizationName("THe New BedRock state Rock Company");
        emp.setJobTitle("President/CEO");
        return  emp;
    }
}
