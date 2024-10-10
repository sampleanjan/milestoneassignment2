package com.example.barroservice.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.barroservice.models.Barrow;
import com.example.barroservice.services.BarrowService;

import java.util.List;

@RestController
@RequestMapping("/borrowings")
public class BarrowController {

    @Autowired
    private BarrowService borrowingService;

    @GetMapping
    public List<Barrow> getAllBorrowings() {
        return borrowingService.getAllBorrowings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barrow> getBorrowingById(@PathVariable Long id) {
        return borrowingService.getBorrowingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Barrow> addBorrowing(@RequestBody Barrow borrowing) {
        return ResponseEntity.ok(borrowingService.addBorrowing(borrowing));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Barrow> updateBorrowing(@PathVariable Long id, @RequestBody Barrow borrowingDetails) {
        return ResponseEntity.ok(borrowingService.updateBorrowing(id, borrowingDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBorrowing(@PathVariable Long id) {
        borrowingService.deleteBorrowing(id);
        return ResponseEntity.noContent().build();
    }
}