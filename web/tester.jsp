<%@page import="java.io.*" %>
<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            PrintWriter o = response.getWriter();
            String url = "jdbc:mysql://localhost:3306/tyrusk9";
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    con = DriverManager.getConnection(url, "root", "");
                    ps = con.prepareStatement("select * from customerinquiry");
                    rs = ps.executeQuery();
                    ResultSetMetaData metadata = rs.getMetaData();
                    int columnCount = metadata.getColumnCount();
                    System.out.println();
                    while (rs.next()) {
                        out.write(rs.getString(1));
                        
                    }
                    out.write("\n");
                    rs.beforeFirst();
                    while (rs.next()) {
                        out.write(rs.getString(2));
                    }
                } catch (SQLException e) {
                    
                } finally {
                    try {
                        con.close();
                        ps = null;
                        rs = null;
                    } catch (SQLException e) {
                    }
                }
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }%>
    </body>
</html>
