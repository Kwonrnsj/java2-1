# 권순혁 202330104

## 3월 29일 강의

### -파일 빨간색 오류 해결방법-
```
"java.project.sourcePaths": [
        "src", <<< .vscode 밑에 있는 파일에서 src 뒤에 경로를 추가해주면 된다.
        "src/chapter02"
    ],
```

### 타입 변환

한 타임의 값을 다른 타입의 값으로 변환

- 자동 타입 변환

컴파일러에 의해 원래의 타입보다 큰 타입으로 자동 변환
치환문(=)이나 수식 내에서 타입이 일치하지 않을때

### 강제 타입 변환

개발자의 읟적으로 타입 변환
() 안에 개발자가 명시적으로 타입 변환 지정

### 자바의 키 입력과 System.in

키보드와 연결된 자바의 표준 입력 스트림
입력되는 키를 바이트(문자 아님)로 리턴하는 스트림

### Scanner 클래스

읽은 바이트 문자, 정수, 실수, 불린, 문자열 등 다양한 타입으로 변환하여 리턴

객체 생성
```
inport java.util.Scanner; // 임포트 문 필요
Scanner a = new Scanner(System.in); // Scanner 객체 생성
```
공백 문자:'\w', '\f', '\r', ' ', '\n'
 
## 3월 22일 강의

프로그래밍 언어에는 저급 언어와 고급언어가 있다  
저급 언어는 컴퓨터가 알아듣는 언어이다 (기계어 , 어셈블리어)  
고급언어는 간단하게 사람이 이해하기 쉬운 언어이다 (C/C++, Java)  

소스:프로그래밍 언어로 작성된 텍스트 파일  
컴파일:소스 파일을 컴퓨터가 이해할 수 있는 기계어로 만드는 과정

WORA : 한번 작성된 코드는 모든 플랫폼에서 바로 실행되는 자바의 특징

WORA를 가능하게 만드는 자바의 특징
1. 바이트 코드(byte code)  
    1-1 자바 소스를 컴파일한 목적코드  
    1-2 CPU에 종속적이지 않은 중립적인 코드
2. JVM(Java Virtual Machine)

JDK(java Development Kit)  
JRE(Java Runtime Environment)

IDE(integrated development environment) 란?   
통합 개발 환경이다  
편집, 컴파일, 디버깅을 한번에 할수있는 통합된 개발 환경

안드로이드 : 구글의 주도로 여러 모바일 회사가 모여 구성한  
OHA (Open Handset Alliance)에서 만든 무료 모바일 플랫폼

### 자바의 특징

패키지:  
서로 관련 있는 여러 클래스를 패키지로 묶어 관리  
패키지는 폴더 개념이다

멀티스레드:  
여러 스래드의 동시 수행 환경 지원  
자바는 운영체제의 도움없이 자체적으로 멀티스레드를 지원한다  
C/C++ 프로그램은 멀티스레드를 위해 운영체제 API를 호출

실시간 응용프로그램에 부적합   
    -실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행 때문  
자바 프로그램은 안전  
    -타입 체그 엄격  
    -물리적 주소를 사용하는 포인터 개념이 없음  
프로그램 작성 쉬움    
    -포인터 개념 X   
    -동적 메모리 변환 X  
    -다양한 라이브러리 지원  
실행 속도 개선을 위한 JIT 컴파일러 사용  
    -자바는 바이트 코드를 인터프리터 방식으로 실행

식별자란? 
클래스, 변수, 상수, 메소드 등에 붙이는 이름

자바의 데이터 타입  
boolean, char, byte, short, int, long, float, double  

변수란 : 프로그램 실행 중에 값을 임시 저장하기 위한 공간이다  
int price; << 여기서  
int = 데이터 타입  
price = 변수 이름

### 정수 리터럴
10 진수, 8진수 ,16진수 2진수 리터럴  
15  -> 10진수 15  
015 -> 0으로 시작하면 8진수, 십진수로 13

### 실수 리터럴
소수점 형태나 지수 형태로 표현한 실수이다.  
 실수 타입 리터럴은 double 타입으로 컴파일

### 문자 리터럴
단일 인용부호 (' ')로 문자 표현   
Wu다음에 4자리 16진수로, 2바이트의 유니코드(unicode)

### 상수 선언
-final 키워드 사용(final 키워드가 앞에 있으면 상수이다.)  
-선언 시 초깃값을 지정한다 
-실행 중 값 변경 불가능하다  
-☆상수는 전부 대문자로 써야한다☆

### var 키워드
var 키워드 :
-타입을 생력하고 변수 선언 가능  
-컴파일러가 추론하여 변수 타입 결정 

밑에는 var 키워드 예제 문제이다.
```java
public class App {
    public static void main(String[] args) throws Exception {
        var foo = 200;
        var name = " woogle";

        System.out.println(foo + name);
    }
}
```

``` java
// 예제 2-1
public class chapter21 {
    public static void main(String[] args) {
        public static int sum(int n,int m) {
            s = sum(n, m)
        }
    }
    
}
```

## 3월 15일 강의

이클립스 보다는 Visual Studio Code가  
자동완성 기능이 있어서 편리하다  
이클립스도 자동완성이 있긴 하지만 훨씬 더 편리하다  

실행 버튼은 public class 밑에있는  
Run을 누르거나 오른쪽 상단에 있는 버튼을 누르면 실행된다  
또는 F5로도 실행을 시킬 수 있다.  

``` java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello!!! VScode가 좋아요");
    }
}
```