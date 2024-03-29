package com.javastudy.chapter6;

public class OOP03 {
    /**
     * 클래스
     * 동일 패키지인 경우, 클래스들은 동일 이름으로 중복되면 안된다.
     *      또한, 동일 패키지면 import 하지 않아도 사용할 수 있다.
     *
     * 클래스로 객체를 만들어 타입을 나타낼 수 있다.
     *  즉, 클래스가 사용자 정의 타입이다.
     *
     * 일반적으로 하나의 소스파일에 하나의 클래스만을 정의한다.
     * 그러나, 하나의 소스파일에 여러 클래스를 정의하는 것 또한 가능하다.
     * 그러기 위해선 규칙이 있다.
     *
     * 1. 소스파일의 이름은 public class의 이름과 일치해야 한다.
     * 1.1 public class 가 없는 경우 소스파일의 이름은 아무런 클래스의 이름 선택
     * 2. 이름 일치에는 대소문자까지 고려해야 한다.
     * 3. 하나의 소스파일에는 하나의 public class만 존재 가능하다.
     * 3.1 public class가 없어도 무관
     */

    public static void main(String args[]) {
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");

    }
}

class Tv {
    String color;       // 색
    boolean power;      // 전원상태
    int channel;        // 채널

    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

