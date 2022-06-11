package com.example.demo.AditionalTask;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "taskThree", value = "/task-three")
public class TaskThree extends HttpServlet {
    private static int views = 1;
    private String word;

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        writer.println("<html><head><meta charset=\"utf-8\"><title>Views</title></head>");
        writer.println("<body>");
        if (views == 2 || views == 3 || views == 4) {
            word = "раза";
        } else {
            word = "раз";
        }
        writer.println("<p> эту страницу просмотрели " + views++ + " " + word + ".</p>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
