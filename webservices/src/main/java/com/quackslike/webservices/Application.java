package com.quackslike.webservices;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class Application extends ResourceConfig {

    private static final String PACKAGE_POSTFIX = ".services";

    public Application() {
        // Add a package used to scan for components.
        packages(this.getClass().getPackage().getName() + PACKAGE_POSTFIX);
    }

}