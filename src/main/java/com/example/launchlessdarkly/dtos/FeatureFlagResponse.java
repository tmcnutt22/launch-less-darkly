package com.example.launchlessdarkly.dtos;

import java.util.List;

public class FeatureFlagResponse {
    private List<String> flags;

    public FeatureFlagResponse(List<String> flags) {
        this.flags = flags;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }
}
