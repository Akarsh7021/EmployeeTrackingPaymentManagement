package com.familybusiness.payroll.contractor;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ContractorRepository extends JpaRepository<Contractor, Long> {

    @EntityGraph(attributePaths = "workSites")
    List<Contractor> findDistinctByOrderByNameAsc();

    @EntityGraph(attributePaths = "workSites")
    List<Contractor> findDistinctByNameContainingIgnoreCaseOrderByNameAsc(String name);

    @Override
    @EntityGraph(attributePaths = "workSites")
    Optional<Contractor> findById(Long id);
}
