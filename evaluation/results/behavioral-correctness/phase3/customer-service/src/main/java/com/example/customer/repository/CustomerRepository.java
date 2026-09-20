
package com.example.customer.repository;

import com.example.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByCustomerId(Integer customerId);
    public Boolean existsByCustomerId(Integer customerId);
    public Boolean existsByEmail(String email);
}
