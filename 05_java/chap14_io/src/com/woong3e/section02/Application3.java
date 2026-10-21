package com.woong3e.section02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Application3 {
    public static void main(String[] args) {
        /*
         * FileReader: byte 단위가 아닌 문자 단위로 텍스트를 읽는다.
         * */

        try (FileReader fr = new FileReader("src/com/woong3e/section02/testReader.txt")) {

            int value;

            while ((value = fr.read()) != -1) {
                System.out.println((char) value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // inputStreamReader : 보조 스트림으로 혼자 사용할 수 없고, 바이트 스트림을 감싸 문자 변환기능을 추가한다.
        try (Reader reader = new InputStreamReader(
                new FileInputStream("src/com/woong3e/section02/testReader.txt"), StandardCharsets.UTF_8)) {
            int value;
            while ((value = reader.read()) != -1) {
                System.out.println((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
