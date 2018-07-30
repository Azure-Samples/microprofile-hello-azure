package com.microsoft.azure.samples.microprofilehelloazure.api;

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

// From
// http://adambien.blog/roller/abien/entry/simplest_possible_microprofile_liveness_check
@Health
@ApplicationScoped
public class LivenessCheck implements HealthCheck {

  @Override
  public HealthCheckResponse call() {
    return HealthCheckResponse.named("ping")
        .up()
        .withData("duke", "lives")
        .build();
  }
}