package Servlet;

import java.sql.*;
import java.util.*;

public class GetImage {

    public Vector ImageList() throws SQLException {
        Vector vList = new Vector();

        try {
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyrusk9", "root", "");
            Statement stmt = con.createStatement();
            String strSql = "select Image_id,Image_name from upload_image";
            System.out.println("mageList query–" + strSql);
            ResultSet rs = stmt.executeQuery(strSql);

            while (rs.next()) {
                String temp[] = new String[2];
                temp[0] = rs.getString("Image_id");
                temp[1] = rs.getString("Image_name");
                vList.add(temp);
            }

        } catch (Exception e) {
            System.err.print("ImageList Exception : " + e);
            System.err.println("ImageList Exception : " + e.getMessage());
        }

        return vList;
    }
}
