package com.woong3e.section03.interfaceimplements;

public class Keyboard implements IConnectable{
    @Override
    public void connect() {
        System.out.println("키보드가 usb 포트에 연결되었습니다.");
    }

    @Override
    public void disconnect() {
        System.out.println("키보드가 연결해제되었습니다.");
    }
}
