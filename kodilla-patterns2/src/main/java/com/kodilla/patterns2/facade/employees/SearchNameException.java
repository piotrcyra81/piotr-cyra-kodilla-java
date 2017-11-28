package com.kodilla.patterns2.facade.employees;

public class SearchNameException extends Exception {
    public static String ERR_NOT_FOUND_EMPLOYEE = "Employee was not found";
    public static String ERR_NOT_FOUND_COMPANY = "Company was not found";

    public SearchNameException(String message) {
        super(message);
    }
}