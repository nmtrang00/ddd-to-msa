package com.example.cargo.bdd;

import com.example.cargo.outboundAdapter.CustomerOutboundAdapter;
import com.example.cargo.outboundAdapter.LocationOutboundAdapter;
import com.example.cargo.outboundAdapter.RoutePlanningOutboundAdapter;
import com.example.cargo.repository.CargoRepository;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class CucumberSpringConfiguration {

    @MockitoBean CargoRepository cargoRepository;
    @MockitoBean CustomerOutboundAdapter customerOutboundAdapter;
    @MockitoBean LocationOutboundAdapter locationOutboundAdapter;
    @MockitoBean RoutePlanningOutboundAdapter routePlanningOutboundAdapter;
}