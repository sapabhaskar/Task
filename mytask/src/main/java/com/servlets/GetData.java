package com.servlets;

import com.beans.DataBean;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Data")
public class GetData extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "mirzabaig";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<DataBean> userData = new ArrayList<>();

        try {
        	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        	
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user_data");

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String email = rs.getString(3);
            	int age = rs.getInt(4);
            	String dob = rs.getString(5);
                DataBean data = new DataBean(id, name, email, age, dob);
                
                userData.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(DataBean db : userData) {
        	db.print();
        }
        HttpSession s = request.getSession();
        s.setAttribute("userData", userData);
        request.getRequestDispatcher("/data.jsp").forward(request, response);
    }
}
