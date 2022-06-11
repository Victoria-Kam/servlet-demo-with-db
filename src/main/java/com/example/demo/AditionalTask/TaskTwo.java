package com.example.demo.AditionalTask;

import com.example.demo.AditionalTask.DB.LoadStudents;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name = "TaskTwo", value = "/task-two")
public class TaskTwo extends HttpServlet {

    private ArrayList<Student> students;
    private LoadStudents loadStudents;
    private PrintWriter writer;

    public void init(){
        loadStudents = new LoadStudents();
        students = new ArrayList<>();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        writer = response.getWriter();

        try{
            students = loadStudents.loadStudents(students);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><meta charset=\"utf-8\"><title>Students</title></head>");
        writer.println("<body>");
        writer.println("<table border=\"1\">");
        writer.println("<caption>Таблица студентов</caption>");
        writer.println("<tr>");
        writer.println("<th>Номер</th> <th>Имя</th> <th>Фамилия</th>");
        for (Student student : students){
            writer.println("<tr><td>"+ student.getIdStudent() +"</td><td>"+ student.getName() + "</td><td>"+ student.getSurname() + "</td></tr>");
        }
        writer.println("</table>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
