package com.example.routeplanning.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.CollectionTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.util.List;
import java.util.ArrayList;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Itinerary {
  @ElementCollection
  @CollectionTable(name = "Itinerary_ports")
  @Size(min = 0)
  private List<SharedLocation> ports;


  }
