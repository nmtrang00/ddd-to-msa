package com.example.location.controller;

import com.example.location.domain.*;
import com.example.location.payload.*;
import com.example.location.exception.*;

import com.example.location.service.LocationService;

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
@RequestMapping("/location")
@RestController
@Slf4j
@RequiredArgsConstructor
public class LocationController {
   private final LocationService locationService;

    @GetMapping("/{portCode}/exists")
    public ExistsByPortCodeResponse existsByPortCode(@PathVariable Integer portCode){
    // Activity: existsByPortCodeController      
    // InitialNode: existsByPortCodeController-InitNode
    // Declaration: declareResponseVariable 
    ExistsByPortCodeResponse responseParam = new ExistsByPortCodeResponse();
    // CallOperationAction: existsByPortCode 
    // Boolean false
     responseParam.result = locationService.existsByPortCode(portCode);
    
    return responseParam;
     };
 
}
