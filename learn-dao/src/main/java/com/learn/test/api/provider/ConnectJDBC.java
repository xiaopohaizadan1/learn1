package com.learn.test.api.provider;

import java.sql.*;

/**
 * @author geweijian
 * @data 2017-08-26
 */
public class ConnectJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://192.168.10.10:3306/hades-dev?useUnicode=true&characterEncoding=utf-8";
        String username = "hades";
        String password = "hades";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql = "SELECT * FROM hades_account WHERE id_card= ? ";


        String name = null;
        String pass = null;
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "F00009");
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                name = rs.getString("name");
                pass = rs.getString(1); // 此方法比较高效
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(name + "" + pass);

        if (rs != null) {   // 关闭记录集
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {   // 关闭声明
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {  // 关闭连接对象
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}
