package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrsystem.SallaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SallaryProcessor {
    @Override
    public BigDecimal calculatorSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProsessor = new CompanySalaryProcessor();
        return theProsessor.calculatorSalaries(employees);
    }
}
