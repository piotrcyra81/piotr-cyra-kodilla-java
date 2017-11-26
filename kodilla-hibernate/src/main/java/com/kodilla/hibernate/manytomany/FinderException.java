package com.kodilla.hibernate.manytomany;

public class FinderException extends Exception {
    public static final String ERROR_NULL_EMPLOYEE_SET = "NULL EMPLOYEE SET";
    public static final String ERROR_NULL_COMPANY_SET = "NULL COMPANY SET";

    public FinderException(final String message) {
        super(message);
    }
}