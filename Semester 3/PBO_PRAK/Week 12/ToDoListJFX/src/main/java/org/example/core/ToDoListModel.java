package org.example.core;

import java.sql.*;
import java.util.ArrayList;

public class ToDoListModel {
    // what we will need to connect to a database, you'll need :
    // 1) database url
    // 2) database username
    // 3) database password

    private static final String DB_URL = "jdbc:mysql://localhost:3306/todolist_2h";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    private Connection conn;

    public ToDoListModel() {
        try {
            this.conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("[DB:CONNECT]: Successfully connect to " + DB_URL);
        } catch (SQLException e) {
            System.out.println("[DB:ERROR]: " + e.getMessage());
        }
    }

    public void storeTask(Task task) {
        String sql = "INSERT INTO task (title, priority, is_done, created_at, deadline, done_at) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, task.getTitle());
            ps.setString(2, task.getPriority());
            ps.setBoolean(3, task.getIsDone());
            ps.setDate(4, new java.sql.Date(
                    task.getCreated_at().getTime()
            ));
            if (task.getDeadline() != null) {
                ps.setDate(5, new java.sql.Date(
                        task.getDeadline().getTime()
                ));
            }
            if (task.getDone_at() != null) {
                ps.setDate(6, new java.sql.Date(
                        task.getDone_at().getTime()
                ));
            }

            ps.executeUpdate();
            System.out.println("[DB:SUCCESS]: Successfully added a new task!");
        } catch (SQLException e) {
            System.out.println("[DB:ERROR]: " + e.getMessage());
        }
    }

    public ArrayList<Task> loadTasks() {
        String sql = "SELECT * FROM task";
        ArrayList<Task> taskList = new ArrayList<>();

        try {
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String title = rs.getString("title");
                String priority = rs.getString("priority");
                boolean isDone = rs.getBoolean("is_done");
                Date created_at = rs.getDate("created_at");
                Date deadline = rs.getDate("deadline");
                Date done_at = rs.getDate("done_at");

                Task task = new Task(title, deadline, priority);
                task.setCreated_at(created_at);
                task.setDeadline(deadline);
                task.setDone_at(done_at);

                taskList.add(task);
            }

            System.out.println("[DB:SUCCESS]: Successfully loaded tasks!");
        } catch (SQLException e) {
            System.out.println("[DB:ERROR]: " + e.getMessage());
        }

        return taskList;
    }
}
