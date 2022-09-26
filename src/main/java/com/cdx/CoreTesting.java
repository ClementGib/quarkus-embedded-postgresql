package com.cdx;

import javax.inject.Singleton;

import org.jboss.logging.Logger;

import io.quarkus.runtime.Startup;
import io.quarkus.scheduler.Scheduled;

@Startup
@Singleton
public class CoreTesting {
    
    private static final Logger logger = Logger.getLogger(CoreTesting.class);

    @Scheduled(every = "5s")
    public void testing() {
        logger.info("Hello world");
    }
}
