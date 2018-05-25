package com.mzl.thanos.cucumber.stepdefs;

import com.mzl.thanos.JhipsterSampleApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
