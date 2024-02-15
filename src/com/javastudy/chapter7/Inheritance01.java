package com.javastudy.chapter7;

public class Inheritance01 {
    /**
     * 상속
     *  기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
     *  적은 양의 코드, 공통 관리, 추가 및 변경 용이 특징으로 코드의 재사용성을 논ㅍ이고 중복을 제거해 생산성과 유지보수에 크게 기여한다.
     *  클래스 이름 뒤에 상속받고자 하는 클래스 이름에 extends를 붙힌다.
     *  자바는 단일 상속만을 허용한다.
     *  어떤 클래스도 상속하지 않는 경우, 컴파일러를 통해 최상위 조상클래스인 Object 클래스를 자동으로 상속된다.
     *
     *  class 조상 클래스
     *  class 자손 클래스 extends 조상 클래스
     *  상속하는 클래스를 조상 클래스, 상속받는 클랙스를 자손 클래스라고 한다.
     *      자손 클래스는 조상 클래스의 모든 멤버를 상속받는다.
     *      자손 클래스가 더 큰 범위를 가진다.
     *
     *  조상 클래스가 변경되면 자손 클래스는 자동적으로 영향을 받지만, 자손 클래스가 변경되는 것은 조상 클래스에 영향을 주지 않는다.
     */
}