package com.familybusiness.payroll.contractor;

public class ContractorNotFoundException extends RuntimeException {

    public ContractorNotFoundException(Long id) {
        super("Contractor not found: " + id);
    }
}
