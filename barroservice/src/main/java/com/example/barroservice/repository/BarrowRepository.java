package com.example.barroservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.barroservice.models.Barrow;



public interface BarrowRepository extends JpaRepository<Barrow, Long> {
}