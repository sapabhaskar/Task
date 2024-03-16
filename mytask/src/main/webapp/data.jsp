<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.beans.DataBean" %>
<%@ page import="javax.servlet.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Data</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(orange, white, green);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        color: #fff;
    }

    table {
        width: 80%;
        border-collapse: collapse;
        margin-bottom: 20px;
    }

    th, td {
        border: 1px solid #fff;
        padding: 8px;
        text-align: center;
        color: black; /* Change color to black */
    }
    
    th{
    color: white;
    }

    th {
        background-color: #007bff;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Age</th>
                <th>Date of Birth</th>
            </tr>
        </thead>
        <tbody>
           <%
           		HttpSession s = request.getSession();
           		ArrayList<DataBean> userData = (ArrayList)s.getAttribute("userData");
           		for(DataBean data: userData){
           %>
                <tr>
                    <td><%= data.id%></td>
                    <td><%= data.name%></td>
                    <td><%= data.email%></td>
                    <td><%= data.age%></td>
                    <td><%= data.dob%></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
