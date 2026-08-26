package com.example.cargo.controller;

import com.example.cargo.domain.*;
import com.example.cargo.payload.*;
import com.example.cargo.exception.*;

import com.example.cargo.service.CargoService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cargo")
@RestController
@Slf4j
@RequiredArgsConstructor
public class CargoController {
   private final CargoService cargoService;

    @PostMapping("")
    public BookACargoResponse bookACargo(@Valid @RequestBody BookACargoRequest requestParam){
    // Activity: Scenario US2-S1 – A cargo is bookedController      
    // InitialNode: Scenario US2-S1 – A cargo is bookedController-InitNode
    // Declaration: declareResponseVariable 
    BookACargoResponse responseParam = new BookACargoResponse();
    // CallOperationAction: bookACargo 
    // Cargo false
     responseParam.newCargo = cargoService.bookACargo(requestParam.srcPort, requestParam.destPort, requestParam.deadline, requestParam.customerId);
    
    return responseParam;
     };
 
}
