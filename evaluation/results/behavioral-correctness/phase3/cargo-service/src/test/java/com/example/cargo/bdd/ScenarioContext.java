package com.example.cargo.bdd;

import io.cucumber.spring.ScenarioScope;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.ResultActions;

@Component
@ScenarioScope
public class ScenarioContext {
    public ResultActions lastResponse;
}