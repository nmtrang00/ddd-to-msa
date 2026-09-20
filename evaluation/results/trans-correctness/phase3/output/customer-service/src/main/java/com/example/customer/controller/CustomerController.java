package com.example.customer.controller;

import com.example.customer.domain.*;
import com.example.customer.payload.*;
import com.example.customer.exception.*;

import com.example.customer.service.CustomerService;

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
@RequestMapping("/customer")
@RestController
@Slf4j
@RequiredArgsConstructor
public class CustomerController {
   private final CustomerService customerService;

    @GetMapping("/{customerId}/exists")
    public ExistsByCustomerIdResponse existsByCustomerId(@PathVariable Integer customerId){
    // Activity: existsByCustomerIdController      
    // InitialNode: existsByCustomerIdController-InitNode
    // Declaration: declareResponseVariable 
    ExistsByCustomerIdResponse responseParam = new ExistsByCustomerIdResponse();
    // CallOperationAction: existsByCustomerId 
    // Boolean false
     responseParam.result = customerService.existsByCustomerId(customerId);
    
    return responseParam;
     };
 
}
