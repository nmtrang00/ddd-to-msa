package com.example.location.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class MessageResponse {
    String message;
    Boolean success;
    Object data;
    String error;
  
    public MessageResponse(String message, Boolean success, Object data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }
    
    public MessageResponse(String message, Boolean success, String error) {
        this.message = message;
        this.success = success;
        this.error = error;
    }
}
