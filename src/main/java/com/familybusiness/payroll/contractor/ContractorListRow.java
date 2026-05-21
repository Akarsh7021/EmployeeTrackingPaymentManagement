package com.familybusiness.payroll.contractor;

public class ContractorListRow {

    private final Contractor contractor;
    private final WorkSite workSite;

    public ContractorListRow(Contractor contractor, WorkSite workSite) {
        this.contractor = contractor;
        this.workSite = workSite;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public WorkSite getWorkSite() {
        return workSite;
    }

    public boolean hasWorkSite() {
        return workSite != null;
    }
}
