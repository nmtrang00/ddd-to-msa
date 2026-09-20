package com.example.routeplanning.payload;

import com.example.routeplanning.domain.*;
  
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindShortestPathResponse {

  public List<Itinerary> candidates;
}
