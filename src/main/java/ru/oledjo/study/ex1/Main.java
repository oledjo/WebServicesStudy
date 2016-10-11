package ru.oledjo.study.ex1;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Copyright (c) 2016
 * Oleg Shepelev
 * All rights reserved.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        servletContextHandler.addServlet(new ServletHolder(new AllRequestsServlet()), "/mirror");

        Server server = new Server(8080);
        server.setHandler(servletContextHandler);
        server.start();
        java.util.logging.Logger.getGlobal().info("Server started");
        server.join();
    }
}
