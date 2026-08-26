package com.example.cargo.exception;

import com.example.cargo.payload.MessageResponse;

import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.dao.InvalidDataAccessApiUsageException;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(LocationNotFound.class)
      public ResponseEntity<MessageResponse> handleNotFoundException(LocationNotFound ex) {
          MessageResponse errorResponse = new MessageResponse(
              "NOT_FOUND",
              false,
              ex.getMessage()
          );
          return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
      }

  @ExceptionHandler(CustomerNotFound.class)
      public ResponseEntity<MessageResponse> handleNotFoundException(CustomerNotFound ex) {
          MessageResponse errorResponse = new MessageResponse(
              "NOT_FOUND",
              false,
              ex.getMessage()
          );
          return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
      }

  @ExceptionHandler(HttpClientErrorException.class)
  public ResponseEntity<String> handleHttpClientErrorException(HttpClientErrorException ex) {
          return ResponseEntity
              .status(ex.getStatusCode())
              .contentType(MediaType.APPLICATION_JSON)
              .body(ex.getResponseBodyAsString());
  }
  @ExceptionHandler(IllegalArgumentException.class)
  public ResponseEntity<MessageResponse> handleIllegalArgumentException(IllegalArgumentException ex) {
      MessageResponse errorResponse = new MessageResponse(
          "BAD_REQUEST",
          false,
          ex.getMessage()
      );
      return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(InvalidDataAccessApiUsageException.class)
  public ResponseEntity<MessageResponse> handleInvalidDataAccessApiUsageException(InvalidDataAccessApiUsageException ex) {
       MessageResponse errorResponse = new MessageResponse(
           "BAD_REQUEST",
           false,
           ex.getMessage()
       );
       return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
  }
}
