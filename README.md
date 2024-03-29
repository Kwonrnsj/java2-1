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
#### Scanner 예시
```
public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("당신의 이름은 " + name + "입니다.");
        String city = scanner.next();
        System.out.println("당신이 사는 도시는 " + city + "입니다.");
        String age = scanner.next();
        System.out.println("당신의 나이는 " + age + "입니다.");
        String weight = scanner.next();
        System.out.println("당신의 체중은 " + weight + "입니다.");
        String single = scanner.next();
        System.out.println("당신의 독신 여부는 " + single + "입니다.");
    }
```
 시간 계산하는 코드
```
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int time = scanner.nextInt(); // 정수 입력
        int second = time % 60; // 60으로 나눈 나머지는 초
        int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
        int hour = (time / 60) / 60; // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간

        System.out.print(time + "초는 ");
        System.out.print(hour + "시간, ");
        System.out.print(minute + "분, ");
        System.out.print(second + "초입니다. ");
        scanner.close();
    }
```

### 배열(array)

인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조  
    배열을 이용하면 한 번에 많은 메모리 공간 선언 가능  

배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간  
    원소 데이터들이 순차적으로 저장됨  
    인덱스를 이용하여 원소 데이터 접근  

배열 인덱스  
    0부터 시작  
    인덱스는 배열의 시작 위치에서부터 데이터가 있는 상대 위치

### 산술 연산자

69/10 = 6  <- 몫6

69%10 = 9  <- 나머지 9

int r = n % 2 == 0 // r이 1이면 n은 홀수, 0이면 짝수

int r = n % 3 == 0 // 3의 배수

### 조건 연산
3 개의 피연산자로 구성된 삼항(ternary) 연산자  
opr1?opr2:opr3  
opr1이 true이면, 연산식의 결과는 opr2,false이면 opr3  

if else 연산자로 간결하게 표현가능
```
int x = 5;
int y = 3;

int big;
if(x>y)
    big = x;
else 
    big = y;
```

### 논리 연산
a & b  
AND 두 비트 모두1이면 1, 그렇지 않으면 0 

a | b  
OR 두 비트 모두 0이면 0, 그렇지 않으면 1 

a^b  
XOR 두 비트가 다르면 1, 같으면 0 

~ a  
NOT 연산 1을 0으로 0을 1으로

### do-while 문

조건식이 '참'인 동안 반복 실행
작업문은 한 번 반드시 실행

a부터 z까지 출력하는 do while문 예시
```
public class DoWhileSample {
    public static void main(String[] args) {
        char foo ='a';
        char bar ='A';

        do {
            System.out.print(a);
            foo = (char) (foo + 1);
        } while(foo <= 'z');

        while(bar <= 'Z') {
            System.out.println(bar);
            bar = (char) (bar +1);
        }
    }
}
```

구구단 예시
```
public static void main(String[] args) throws Exception {
       for(int i=1; i<10; i++) { // 단에 대한 반복. 1단에서 9단
            for(int j=1; j<10; j++) { // 각 단의 곱셈
                System.out.print(i "x" + j + "=" + i*j); // 구구셈 출력
                System.out.print('\t'); // 하나씩 탭으로 띄기
            }
            System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
       }
}
```

### 함수 호출 시 배열 전달 비교: C/C++ vs 자바

C/C++ 경우 배열과 크기를 각각 전달 받음

자바의 경우 배열만 전달받음
 
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