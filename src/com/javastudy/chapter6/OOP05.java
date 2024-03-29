package com.javastudy.chapter6;

public class OOP05 {
    /**
     * 변수의 종류
     *  변수의 종류는 선언위치에 따라 클래스 변수, 인스턴스 변수, 지역변수로 나뉜다.
     *
     *  클래스 영역에 있는 변수를 멤버 변수라고 한다.
     *      멤버 변수 중에서 static이 붙은 변수를 클래스 변수, 없으면 인스턴스 변수라고 한다.
     *      멤버 변수가 아닌 것들은 지역 변수라고 한다.
     *          지역변수는 클래스 안에 메서드나 생성자, 블럭 영역에 포함되어 있다.
     *
     *  인스턴스 변수
     *      인스턴스 생성 시 만들어지며, 인스턴스마다 저장 공간이 할당되어 독립적으로 값을 가진다.
     *      그렇기 때문에 인스턴스마다 고유 상태를 유지해야 하는 경우에 사용된다.
     *  클래스 변수
     *      인스턴스 변수에 static을 붙혀서 선언한다.
     *      모든 인스턴스가 공통된 상태를 유지해야 하는 경우에 사용된다.
     *      클래스 변수의 경우 인스턴스를 생성하지 않고 바로 사용가능하다.
     *          클래스이름.클래스 변수 = 원하는 값 으로 하거나
     *          객체명.클래스 변수 = 원하는 값 이렇게 설정 가능하다.
     *  지역 변수
     *      메서드 선언 시 생성되며 메서드 내에서만 생명 주기를 가진다.
     *
     *
     *  예시) 카드
     *      카드에는 여러가지 속성이 있다. 무늬, 숫자, 폭, 높이 등
     *      여기서 폭과 높이 같은 경우에는 모든 카드가 동일해야 하니 클래스 변수,
     *      무늬나 숫자는 독립적으로 존재해야 하니 인스턴스 변수로 선언하면 된다.
     */
}
