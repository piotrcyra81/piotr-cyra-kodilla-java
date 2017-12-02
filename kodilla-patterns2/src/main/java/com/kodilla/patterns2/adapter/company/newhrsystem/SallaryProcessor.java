package com.kodilla.patterns2.adapter.company.newhrsystem;


import java.math.BigDecimal;
import java.util.List;

public interface SallaryProcessor {
    BigDecimal calculatorSalaries(List<Employee> employees);
}
