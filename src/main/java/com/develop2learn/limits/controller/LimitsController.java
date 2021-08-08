package com.develop2learn.limits.controller;

import com.develop2learn.limits.configuration.LimitsConfiguration;
import com.develop2learn.limits.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration config;

    @GetMapping("/limits")
    public Limits retriveLimits() {
        return new Limits(config.getMinimum(), config.getMaximum());
    }
}
