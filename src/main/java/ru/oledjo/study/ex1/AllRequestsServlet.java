package ru.oledjo.study.ex1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright (c) 2016
 * Oleg Shepelev
 * All rights reserved.
 */
public class AllRequestsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] value = req.getParameterMap().get("key");
        if (value != null && value.length > 0) {
            resp.getWriter().println(value[0]);
        }

        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
