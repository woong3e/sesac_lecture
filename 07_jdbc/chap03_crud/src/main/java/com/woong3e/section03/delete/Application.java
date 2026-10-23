package com.woong3e.section03.delete;

import com.woong3e.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.woong3e.common.JDBCTemplate.close;
import static com.woong3e.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        /*
        * 메뉴 코드를 입력받아 해당 메뉴 삭제하기
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 메뉴 코드를 입력하세요: ");
        int menuCode = sc.nextInt();

        MenuDTO deleteCode = new MenuDTO();
        deleteCode.setCode(menuCode);

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try (FileInputStream queryStream = new FileInputStream("src/main/java/com/woong3e/mapper/menu-query.xml")) {
            prop.loadFromXML(queryStream);
            String query = prop.getProperty("deleteMenu");

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1,deleteCode.getCode());

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
