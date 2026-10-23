package com.woong3e.section01.statement;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.woong3e.common.JDBCTemplate.close;
import static com.woong3e.common.JDBCTemplate.getConnection;


public class Application {
    public static void main(String[] args) {

        Statement stmt = null;
        ResultSet rset = null;

        // 트랜잭션 처리를 위한 DBMS 연동용 커넥션 객체 생성
        Connection con = getConnection();
        System.out.println("con = " + con);

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT MENU_NAME, MENU_PRICE FROM TBL_MENU");
            /*
            * next(): ResultSet의 커서 위치를 하나 내리면서 행이 존재하면 true를 반환한다.
            * getXXX(컬럼명): 커서가 가리키는 행의 컬럼을 XXX 데이터 타입으로 반환한다.
            *
            *
            * */
            while(rset.next()){
                System.out.println(rset.getString("MENU_NAME") + ", " +
                        rset.getInt("MENU_PRICE"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally{
            close(rset);
            close(stmt);
            close(con);
        }

    }
}
