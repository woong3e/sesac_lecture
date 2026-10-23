package com.woong3e.section01.insert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.woong3e.common.JDBCTemplate.close;
import static com.woong3e.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try (FileInputStream queryStream = new FileInputStream("src/main/java/com/woong3e/mapper/menu-query.xml")) {
            prop.loadFromXML(queryStream);
            String query = prop.getProperty("insertMenu");

            pstmt = con.prepareStatement(query);

            pstmt.setString(1,"평양냉면");
            pstmt.setInt(2,18000);
            pstmt.setInt(3,4);
            pstmt.setString(4,"Y");

            result = pstmt.executeUpdate(); // DML 작업을 하면 DML 작업이 일어난 행(row)의 갯수를 반환한다.(int)

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(pstmt);
            close(con);
        }
        System.out.println("result = " + result);

    }
}
