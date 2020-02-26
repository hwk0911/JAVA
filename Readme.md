# Java-tutorial
자바 튜토리얼

기초를 쌓지 않은 프로그래머는 소금과 모래로 된 기둥위에 지어진 성과 같다.  
기초를 탄탄히 하자는 마음으로 Java의 기본을 정리해본다.

ONE FOR ALL,  
ALL FOR ONE  

## 0. [Java-Tutorials의 시작에 앞서](https://cafecoder.tistory.com/entry/0-Java-Tutorals%EC%9D%98-%EC%8B%9C%EC%9E%91%EC%97%90-%EC%95%9E%EC%84%9C)  
Java의 탄생과정 및 철학에 대해 알아본다.

### 1. Java의 탄생
### 1.1 KEY POINT
### 2. Java의 철학
### 2.1 KEY POINT
### 3. Java의 특징
### 4. JVM (Java Virtual Machine)
### 4.1 JVM의 특징
### 4.2 GC (Garbage Collection)
### 4.2.1 작동 방식에 따른 분류

## 1. [자바의 데이터 타입 (Java Data Type)](https://cafecoder.tistory.com/entry/Java-%EB%B3%80%EC%88%98%ED%98%95-Primitive-Object?category=890663)
Java의 데이터 타입에 대해 알아본다.

### 1. Java 자료형은 크게 Primitivve type과 Reference type으로 나뉜다.
### 2. 원시 자료형 (Primitive Type)
### 3. 참조 자료형 (Reference Type)
### 3.1 클래스 타입 (Class Type)
### 3.1.1 래퍼 클래스 (Wrapper Class)
### 3.1.2 문자열 클래스 (String Class)
### 3.2 인터페이스 타입 (Interface Type)
### 3.3 배열 타입 (Array Type)
### 3.4 열거 타입 (Enum Type)
### 4. 번외
### 4.1 long 보다 큰 숫자가 필요하다면 BigInteger를 사용하자.
### 4.2 구조체 vs 클래스 (Struct vs Class)
### 4.2.1 구조체 (Struct)
### 4.2.2 클래스 (Class)
### 4.2.3 특징
### 4.3 String Type의 메모리 관리
### 마치며

## 1.5 [자료형의 범위는 왜 음수가 더 넓을까? (byte : -128 ~ 127)](https://cafecoder.tistory.com/entry/15-%EC%9E%90%EB%A3%8C%ED%98%95%EC%9D%98-%EB%B2%94%EC%9C%84%EB%8A%94-%EC%99%9C-%EC%9D%8C%EC%88%98%EA%B0%80-%EB%8D%94-%EB%84%93%EC%9D%84%EA%B9%8C-byte-128-127)
Java 데이터 타입의 음수 양수 범위가 다른 이유 (Signed, Unsigned)에 대해 알아본다.

### 1. 컴퓨터 연산의 단위
### 1.1 컴퓨터는 수많은 bit로 이뤄져 있다.
### 1.2 Byte는 몇 bit 인가?
### 2. 자료형의 음수, 양수 표현
### 2.1 자료형의 단위
### 2.2 자료형의 음수, 양수 표현
### 2.3 1의 보수 (Ones' Complement)
### 2.3.1 전자 회로 기초 논리 게이트
### 2.3.2 1의 보수 만들기
### 결과 및 마무리

## 2. [자바의 연산자](https://cafecoder.tistory.com/entry/2-Java-%EC%97%B0%EC%82%B0%EC%9E%90)
정말 단순하다. 정말 쉽다. 하지만 모르면 아무것도 못한다. 그만큼 중요하다.
1. Java의 자료형을 시작하며 "기초를 쌓지 않은 프로그래머는 소금과 모래로 된 기둥 위에 지어진 성과 같다." 고 했다. 이걸 모른 채 시작한다면, 기둥 자체가 없다.    

### Java의 연산자에 대해 알아본다.
### 1. Java의 연산자는 크게 4가지로 분류한다.
    1. 최우선 연산자   
    2. 단항 연산자
      1. 증감 연산자
    
    3. 이항 연산자
      1. 산술 연산자
      2. 비교 연산자
      3. 비트 연산자
      4. 논리 연산자
      5. 대입 연산자
      
    4. 삼항 연산자
    
### 1.1 연산의 우선순위
### 1.2 최우선 연산자
### 1.3 단항 연산자
### 1.3.1 증감 연산자
### 1.3.1.1 전위 증감 연산자
### 1.3.1.2 후위 증감 연산자
### 1.3.1.3 증감 연산자 마무리
### 1.4 이항 연산자
### 1.5 삼항 연산자

## 3. [조건문]
제어문은 프로그래밍의 논리의 기본이라 생각한다. 모든 자료구조, 알고리즘에 반드시 포함된다.      
많은 내용이 중요하지만, 특히 중요한 파트라 생각된다.

## 3.1 [프로그래밍의 꽃 Java 제어문 part 1(조건문)](https://cafecoder.tistory.com/entry/3-%EC%A1%B0%EA%B1%B4%EB%AC%B8)
### 3.1.1 if
### 3.1.2 switch case

## 3.2 [프로그래밍의 꽃 Java 제어문 Part 2 (반복문)](https://cafecoder.tistory.com/entry/3-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%EC%9D%98-%EA%BD%83-Java-%EC%A0%9C%EC%96%B4%EB%AC%B8-Part-2-%EB%B0%98%EB%B3%B5%EB%AC%B8)
### 3.2.1 for
### 3.2.2 for-each
### 3.2.2 + for-each lambda 
### 3.2.3 while
### 3.2.4 do-while

## 4 [객체지향 프로그래밍의 시작 "클래스" (Java 클래스)](https://cafecoder.tistory.com/entry/4-%EC%B0%B8%EC%A1%B0-%ED%83%80%EC%9E%85)

### 4.1 객체지향 프로그래밍
### 4.2 용어 정리
    1. 클래스
    2. 객체
    3. 필드
    4. 생성자
    5. 메서드
    6. this
    7. 정적 멤버
    8. static
    9. final
    10. 패키지
    11. 접근 제한자
    12. Getter & Setter
    13. 어노테이션 (Annotation)
    
### 4.2 클래스
### 4.3 객체
### 4.4 필드, 생성자, 메서드
### 4.5 this
### 4.6 정적 멤버, static
### 4.7 final
### 4.8 패키지
### 4.9 접근 제한자
### 4.10 Getters & Setters
### 4.11 어노테이션 (Annotation)
