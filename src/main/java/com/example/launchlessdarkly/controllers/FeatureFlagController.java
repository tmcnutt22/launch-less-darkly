package com.example.launchlessdarkly.controllers;

import com.example.launchlessdarkly.dtos.FeatureFlagResponse;
import com.example.launchlessdarkly.services.FeatureFlagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/flags") //base path for all endpoints
public class FeatureFlagController {
    private final FeatureFlagService featureFlagService;

    public FeatureFlagController(FeatureFlagService featureFlagService) {
        this.featureFlagService = featureFlagService;
    }

    @GetMapping
    public FeatureFlagResponse featureFlag() {
        return new FeatureFlagResponse(featureFlagService.getFeatureFlags());
    }
}
