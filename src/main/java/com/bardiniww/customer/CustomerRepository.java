package com.bardiniww.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    boolean existsCustomersByEmail(String email);
    boolean existsCustomersById(Long id);
}
