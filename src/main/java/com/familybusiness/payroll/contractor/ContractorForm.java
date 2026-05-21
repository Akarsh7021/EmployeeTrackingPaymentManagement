package com.familybusiness.payroll.contractor;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class ContractorForm {

    private Long id;

    @NotBlank(message = "Contractor name is required")
    @Size(max = 120, message = "Contractor name must be 120 characters or less")
    private String name;

    @Size(max = 30, message = "Phone number must be 30 characters or less")
    private String phoneNumber;

    @NotNull(message = "Amount paid is required")
    @DecimalMin(value = "0.00", message = "Amount paid cannot be negative")
    @Digits(integer = 8, fraction = 2, message = "Amount paid must use dollars and cents")
    private BigDecimal amountPaidToDate = BigDecimal.ZERO;

    @NotNull(message = "Amount unpaid is required")
    @DecimalMin(value = "0.00", message = "Amount unpaid cannot be negative")
    @Digits(integer = 8, fraction = 2, message = "Amount unpaid must use dollars and cents")
    private BigDecimal amountUnpaid = BigDecimal.ZERO;

    public static ContractorForm fromContractor(Contractor contractor) {
        ContractorForm form = new ContractorForm();
        form.setId(contractor.getId());
        form.setName(contractor.getName());
        form.setPhoneNumber(contractor.getPhoneNumber());
        form.setAmountPaidToDate(contractor.getAmountPaidToDate());
        form.setAmountUnpaid(contractor.getAmountUnpaid());
        return form;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getAmountPaidToDate() {
        return amountPaidToDate;
    }

    public void setAmountPaidToDate(BigDecimal amountPaidToDate) {
        this.amountPaidToDate = amountPaidToDate;
    }

    public BigDecimal getAmountUnpaid() {
        return amountUnpaid;
    }

    public void setAmountUnpaid(BigDecimal amountUnpaid) {
        this.amountUnpaid = amountUnpaid;
    }
}
