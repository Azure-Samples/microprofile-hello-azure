package com.microsoft.azure.samples.microprofilehelloazure.api;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@ApplicationScoped
@Path("/api")
public class API {

  @GET
  @Path("/hello")
  @Produces(TEXT_PLAIN)
  public String info() {
    return "Hello Azure!";
  }
}
