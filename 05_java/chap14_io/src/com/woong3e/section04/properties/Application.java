package com.woong3e.section04.properties;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {

        String filePath = "src/com/woong3e/section04/properties/application.properties";

        Properties prop = new Properties();             // Properties 설정정보를 관리하는 클래스, 1. Properties 객체 생성
        prop.setProperty("app.name", "fullstack-course");
        prop.setProperty("app.version", "1.0");
        prop.setProperty("app.language", "ko");

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_8)) {
            prop.store(writer,"application settings");              // 2. 파일에 저장
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Properties loadedProp = new Properties();
        try(Reader reader = new InputStreamReader(new FileInputStream(filePath),StandardCharsets.UTF_8)){

            loadedProp.load(reader);                    // 3. 파일에서 다시 읽어오기
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(loadedProp.getProperty("app.name"));
        System.out.println(loadedProp.getProperty("app.version"));
        System.out.println(loadedProp.getProperty("app.language"));

        /*
        * Prooperties: 애플리케이션 설정 정보를 key-value 형태로 관리하는 클래스
        * store() / load(): 설정 정보를 파일에 저장하거나 파일에서 읽어오는 메서드
        * application.properties: Spring Boot 에서도 사용하는 대표적인 설정 파일 형식
        *
        * */

    }
}
