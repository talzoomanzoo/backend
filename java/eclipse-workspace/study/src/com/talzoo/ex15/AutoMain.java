package com.talzoo.ex15;

public class AutoMain {
    public static void main(String[] args) {
        AutoSaveThread thread = new AutoSaveThread();
        thread.setDaemon(true); // 이 thread는 daemonthread라고 설정: 자기 자신을 생성한 스레드 (main thread)가 종료하면 같이 종료함 (리소스를 물고하는 것을 데몬 스레드로 만들면 안됨)
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
