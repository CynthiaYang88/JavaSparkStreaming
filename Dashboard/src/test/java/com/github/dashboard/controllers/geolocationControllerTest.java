package com.github.dashboard.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class geolocationControllerTest {

    @Autowired
    private geolocationController controller;

    @Test
    public void contextLoads() {
        assertNotNull(controller);
    }
}