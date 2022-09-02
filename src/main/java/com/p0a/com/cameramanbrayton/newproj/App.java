package com.p0a.com.cameramanbrayton.newproj;

import com.p0a.com.cameramanbrayton.newproj.common.datasource.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        ConnectionFactory connectionFactory = ConnectionFactory.getInstance();

        try {
            Connection connection = connectionFactory.getConnection();
            if (connection != null) {
                System.out.println("Connection successful!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
