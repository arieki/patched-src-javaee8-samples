/*
 *    Copyright (c) [2019] Payara Foundation and/or its affiliates.
 */

package org.javaee8.cdi.events.async.startup;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.event.ObservesAsync;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

@Singleton
public class ObserverAtStartup {

    private static final Logger LOG = Logger.getLogger(ObserverAtStartup.class.getName());

    private boolean received;

    @PostConstruct
    public void init() {
        LOG.info("Initiating bean public class ObserverAtStartup");
    }

    public void trigger(@ObservesAsync MyEvent evt) {
        LOG.log(INFO, "ObserverAtStartup received event from {0}", evt.getSource());
        this.received = true;
    }

    public boolean isReceived() {
        return received;
    }
}
