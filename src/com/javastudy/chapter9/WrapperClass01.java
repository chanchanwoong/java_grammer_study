package com.javastudy.chapter9;

public class WrapperClass01 {
    /**
     * wrapper 클래스
     *  기본형 변수를 객체로 다룰 때 사용된다. 성능 이슈로 인해서 기본형은 객체로 안 썼다.
     *  기본형 값을 감싼다고 생각하면 된다.
     *  기본형 값들을 wrapper클래스로 객체로 변환 후 작업을 수행한다.
     *
     *  기본형과 wrapper 객체의 연산할 시, 자동으로 intValue() 메서드처럼 기본형 타입으로 변환되어 연산된다.
     *      이를 오토박싱이라고 하며, 반대를 언박싱이라고 한다.
     *      오토박싱을 통해, 컴파일러에서 자동으로 변환해주어 연산에 에러가 발생하지 않는다.
     *
     *  기본형         래퍼클래스
     *  boolean       Boolean
     *  char          Character
     *  byte          Byte
     *  short         Short
     *  int           Integer
     *  long          Long
     *  float         Float
     *  double        Double
     */
    public static void main(String args[]){
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("i1 == i2 결과 = " + (i1==i2));        // 주소값 차이로 false
        System.out.println("i1.equals(i2) = " + i1.equals(i2));     // 내용이 같아 true
        System.out.println("i1.toString().equals(i2.toString()) = " + i1.toString().equals(i2.toString()));     // ture

    }
}
