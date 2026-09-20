package com.example.routeplanning.service;

import com.example.routeplanning.domain.*;

import com.example.routeplanning.payload.*;
import com.example.routeplanning.exception.*;
import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class RouteService {

    /**
     * Finds the shortest path between two ports.
     *
     * The route always goes via the "average node": the port whose code is the midpoint of the
     * source and destination codes. Two cases have no distinct midpoint and yield a direct route:
     * adjacent ports (the midpoint would coincide with the source) and a source equal to the
     * destination (a single-stop itinerary).
     *
     * @return exactly one candidate itinerary
     */
    @Transactional
    public List<Itinerary> findShortestPath(SharedLocation destination, SharedLocation source) {
        Integer from = requirePortCode(source, "source");
        Integer to = requirePortCode(destination, "destination");

        List<SharedLocation> ports = new ArrayList<>();
        ports.add(new SharedLocation(from));

        if (!from.equals(to)) {
            // Midpoint computed as from + (to - from) / 2: no overflow, and it rounds towards the source
            long midpoint = (long) from + ((long) to - (long) from) / 2;

            // A midpoint equal to either endpoint means the ports are adjacent: the route is direct
            if (midpoint != from && midpoint != to) {
                ports.add(new SharedLocation(Math.toIntExact(midpoint)));
            }
            ports.add(new SharedLocation(to));
        }

        Itinerary candidate = new Itinerary(ports);
        log.info("Shortest path from {} to {}: {}", from, to, ports);
        return List.of(candidate);
    }

    private static Integer requirePortCode(SharedLocation location, String name) {
        if (location == null || location.getPortCode() == null) {
            throw new IllegalArgumentException("'" + name + "' must have a port code");
        }
        return location.getPortCode();
    }
}