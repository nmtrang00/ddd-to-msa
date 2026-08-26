package com.example.location.repository;

import com.example.location.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer > {
    public Boolean existsByPortCode(Integer portCode);
}
