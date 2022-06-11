package com.example.demo.AditionalTask.DB;

import com.example.demo.AditionalTask.Student;

import java.sql.*;
import java.util.ArrayList;

public class LoadStudents extends DBConfig {

    public ArrayList<Student> loadStudents(ArrayList<Student> students) throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(super.getUrl(),super.getName(),super.getPassword());
        Statement statement = connection.createStatement();
        String query = "select * from student";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            students.add(new Student(resultSet.getInt("idstudent"),resultSet.getString("name"),
                    resultSet.getString("surname")));
        }
        connection.close();
        return students;
    }
}
