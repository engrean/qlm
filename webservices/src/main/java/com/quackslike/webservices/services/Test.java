 package com.quackslike.webservices.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Root resource, which represents “Hello world!”.
 */
@Path("/test/")
public class Test {

    @GET
    @Produces("text/plain")
    public Response getText() {
        return Response.ok("Hello world!\n").build();
    }

    @POST
    @Produces("text/plain")
    public Response getTextPost() {
        return Response.ok("Hello world! Post\n").build();
    }

}