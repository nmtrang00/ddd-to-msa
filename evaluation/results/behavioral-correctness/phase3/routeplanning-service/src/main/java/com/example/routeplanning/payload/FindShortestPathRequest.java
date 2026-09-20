package com.example.routeplanning.payload;

import com.example.routeplanning.domain.*;
  
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindShortestPathRequest {
  @NotNull(message="'destination' cannot be null")
    public SharedLocation destination;
  @NotNull(message="'source' cannot be null")
    public SharedLocation source;
}
