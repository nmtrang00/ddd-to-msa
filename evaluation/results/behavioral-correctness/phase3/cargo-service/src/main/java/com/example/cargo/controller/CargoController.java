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

    @GetMapping("/{trackingId}")
    public TrackACargoResponse trackACargo(@PathVariable Integer trackingId){
    // Activity: trackACargoController      
    // InitialNode: trackACargoController-InitNode
    // Declaration: declareResponseVariable 
    TrackACargoResponse responseParam = new TrackACargoResponse();
    // CallOperationAction: trackACargo 
    responseParam.trackingReceipt = cargoService.trackACargo(trackingId);
    
    //NEXT: trackACargo->trackACargoController-ActivityFinalNode
    return responseParam;
     };
 
    @PostMapping("/{trackingId}")
    public RouteACargoResponse routeACargo(@PathVariable Integer trackingId, @Valid @RequestBody RouteACargoRequest requestParam){
    // Activity: routeACargoController      
    // InitialNode: routeACargoController-InitNode
    // Declaration: declareResponseVariable 
    RouteACargoResponse responseParam = new RouteACargoResponse();
    // CallOperationAction: routeACargo 
    responseParam.updatedCargo = cargoService.routeACargo(requestParam.getSelectedItinerary(), trackingId);
    
    //NEXT: routeACargo->routeACargoController-ActivityFinalNode
    return responseParam;
     };
 
    @GetMapping("/requestRouteCandidates/{trackingId}")
    public RequestRouteCandidatesResponse requestRouteCandidates(@PathVariable Integer trackingId){
    // Activity: requestRouteCandidatesController      
    // InitialNode: requestRouteCandidatesController-InitNode
    // Declaration: declareResponseVariable 
    RequestRouteCandidatesResponse responseParam = new RequestRouteCandidatesResponse();
    // CallOperationAction: requestRouteCandidates 
    responseParam.candidates = cargoService.requestRouteCandidates(trackingId);
    
    //NEXT: requestRouteCandidates->requestRouteCandidatesController-ActivityFinalNode
    return responseParam;
     };
 
    @PostMapping("/reportHandlingEvent/{trackingId}")
    public ReportHandlingEventResponse reportHandlingEvent(@PathVariable Integer trackingId, @Valid @RequestBody ReportHandlingEventRequest requestParam){
    // Activity: reportHandlingEventController      
    // InitialNode: reportHandlingEventController-InitNode
    // Declaration: declareResponseVariable 
    ReportHandlingEventResponse responseParam = new ReportHandlingEventResponse();
    // CallOperationAction: reportHandlingEvent 
    responseParam.event = cargoService.reportHandlingEvent(requestParam.getCarrierMovement(), requestParam.getEventType(), requestParam.getPort(), requestParam.getReportedTime(), trackingId);
    
    //NEXT: reportHandlingEvent->reportHandlingEventController-ActivityFinalNode
    return responseParam;
     };
 
    @DeleteMapping("/{trackingId}")
    public DeleteACargoResponse deleteACargo(@PathVariable Integer trackingId){
    // Activity: deleteACargoController      
    // InitialNode: deleteACargoController-InitNode
    // Declaration: declareResponseVariable 
    DeleteACargoResponse responseParam = new DeleteACargoResponse();
    // CallOperationAction: deleteACargo 
    responseParam.deletedCargo = cargoService.deleteACargo(trackingId);
    
    //NEXT: deleteACargo->deleteACargoController-ActivityFinalNode
    return responseParam;
     };
 
    @PostMapping("")
    public BookACargoResponse bookACargo(@Valid @RequestBody BookACargoRequest requestParam){
    // Activity: bookACargoController      
    // InitialNode: bookACargoController-InitNode
    // Declaration: declareResponseVariable 
    BookACargoResponse responseParam = new BookACargoResponse();
    // CallOperationAction: bookACargo 
    responseParam.newCargo = cargoService.bookACargo(requestParam.getCustomerId(), requestParam.getDeadline(), requestParam.getDestPort(), requestParam.getSrcPort());
    
    //NEXT: bookACargo->bookACargoController-ActivityFinalNode
    return responseParam;
     };
 
}
