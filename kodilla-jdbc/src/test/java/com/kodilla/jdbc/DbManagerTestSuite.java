package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();
        //When
        String searchForUsersWith2OrMorePosts =
                "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                        "FROM USERS U\n" +
                        "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                        "GROUP BY P.USER_ID\n" +
                        "HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(searchForUsersWith2OrMorePosts);
        //then
        int counter = 0;
        while (rs.next()) {
            System.out.println("Posts count: " + rs.getInt("POSTS_NUMBER" ) + "\n" +
                    "User: " + rs.getString("FIRSTNAME" ) + "," +
                    rs.getString("LASTNAME" ));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }
}