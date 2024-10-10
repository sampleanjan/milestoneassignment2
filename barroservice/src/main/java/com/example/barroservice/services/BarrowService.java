package com.example.barroservice.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barroservice.models.Barrow;
import com.example.barroservice.repository.BarrowRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BarrowService {

    @Autowired
    private BarrowRepository barrowRepository;

    public List<Barrow> getAllBorrowings() {
        return barrowRepository.findAll();
    }

    public Optional<Barrow> getBorrowingById(Long id) {
        return barrowRepository.findById(id);
    }

    public Barrow addBorrowing(Barrow borrowing) {
        return barrowRepository.save(borrowing);
    }

    public Barrow updateBorrowing(Long id, Barrow borrowingDetails) {
        Barrow borrowing = barrowRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Borrowing not found"));
        borrowing.setDueDate(borrowingDetails.getDueDate());
        return barrowRepository.save(borrowing);
    }

    public void deleteBorrowing(Long id) {
        barrowRepository.deleteById(id);
    }
}