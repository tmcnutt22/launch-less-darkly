package com.example.launchlessdarkly.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureFlagService {
    public List<String> getFeatureFlags() {
        List<String> result = List.of("flag01", "flag02", "flag03");

        result = result.stream()
            .toList();

        return result;
    }
}
