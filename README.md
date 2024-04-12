# 권순혁 202330104

## 4월 12일 강의

### static 멤버의 생성
static 멤버는 클래스당 하나만 생성  
객체들에 의해 공유됨

### static 멤버 사용 
클래스 이름으로 접근 가능  
객체의 멤버로 접근 가능  
non-static 멤버는 클래스 이름으로 전근 안 됨

### 예제 4_11
```
class Calc {
    int foo;
    static int bar;

    public static int abs(int a) { return a>0?a:-a; }
    public static int abs(int a, int b) { return (a>b)?a:b; }
    public static int abs(int a, int b) { return (a>b)?b:a; }
}


public class Ex4_11 {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.min(-3, -8));
        Calc a = new Calc();
        a.foo = 100;
        Calc.bar = 50;
        System.out.println(a.foo);
        System.out.println(Calc.bar);
    }
}
```

### static 메소드의 제약 조건 1
static 메소드는 오직static 멤버만 접근 가능
1. 객체가 생성되지 않은 상황에서도 static  메소드는 실핼될 수 있기 때문에  
, non-static 멤버 활용 불가
2. non-static 메소드는 static 멤버 사용 가능

### static 메소드의 제약 조건 2
static 메소드는 this 사용불가  
1. static 메소드는 객체 없이 사용 가능하므로, this 레퍼런스가 없어도 사용 가능

### final 클래스와 메소드
final 클래스 - 더 이상 클래스 상속 불가능

final 메소드 - 더 이상 오버라이딩 불가능

### final 필드
final 필드, 상수 선언
상수를 선언할 때 사용  
상수 필드는 선언 시에 초기 값을 저장해야 한다

### 클래스 상속과 객체 
상속 선언   
extends 키워드로 선언  
(부모 클래스를 물려받아 확장한다는 의미)  
부모 클래스 -> 슈퍼 클래스(super class)  
자식 클래스 -> 서브 클래스(sub class)

### Ex5_01 예제
```
public class Ex5_01 {
    public static void main(String[] args) {
        Point p = new Point();
        p.set(x:1, y:2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(x:3, y:4);
        cp.setColor(color:"red");
        cp.showColorPoint();
    }
}

class Point {
    private int x,y;
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("(" + x + "," + y + )")
    }
}

class ColorPoint extends Point {
    private String color;
    pyblic void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}
```

### 자바 상속의 특징
 클래스 다중 상속(multiple inheritance) 불허  
 C++는 다중 상속 가능

### 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
슈퍼 클래스의 private 멤버  
(서브 클래스에서 접근할 수 없음)  
슈퍼 클래스의 디폴트 멤버  
(서브 클래스가 동일한 패키지에 있을 때, 접근 가능)  
슈퍼 클래스의 public 멤버  
(서브 클래스는 항상 접근 가능)  
슈퍼 클래스의 protected 멤버  
(같은 패키지 내의 모든 클래스 접근 허용, 패키지 여부와 상관없이 서브 클래스는 접근 가능)

### protected 멤버
같은 패키지의 모든 클래스에게 허용  
상속되는 서브 클래스(같은 패키지든 다른 패키지든 상관 없음)에게 허용

### 서브 클래스와 슈퍼 클래스의 생성자 선택
슈퍼 클래스와 서브 클래스  
(각각 여러 개의 생성자 작성 가능)  
서브 클래스의 객체가 생성될 때  
(슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행)  
서브 클래스의 생성자와 슈퍼 클래스의 생성자가 결정되는 방식  
1. 개발자의 명시적 선택  
 1-1서브 클래스 개발자가 슈퍼 클래스의 생성자 명시적 선택  

2. 컴파일러가 기본생성자 선택  
 2-1 서브 클래스 개발자가 슈퍼 클래스의 생성자를 선택하지 않는 경우

### 업캐스팅 개념
업 캐스팅은 기본 클래스의 포인터로 파생 클래스의 객체를 가리키는 것을 말한다

서브 클래스의 레퍼런스를 슈퍼클래스 레퍼런스에 대입
슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가리키게 되는 현상

### 다운캐스팅(downcasting)
슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입  
업캐스팅된 것을 다시 원래댈 되돌리는 것  
반드시 명시적 타입 변환 지정

### 업캐스팅 레퍼런스로 객체 구별
업캐스팅된 레퍼런스로는 객체의 실제 타입을 구분하기 어려움

### instanceof 연산자 사용
레퍼런스가 가리키는 객체의 타입 식별

### 메소드 오버라이딩
서브 클래스에서 슈퍼 클래스의 메소드 중복 작성  
슈퍼 클래스의 메소드 무력화, 항상 서브 클래스에 오버라이딩한 메소드가 실행됟록 보장됨  
"멧드 무시하기"로 번역되기도 함

### 오버라이딩으로 다형성 실현
하나의 인터페이스에 서로 다른 구현  
슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞게 다르게구현  
사례  

### super 클래스
슈퍼 클래스의 멤버를 접근할 때 사용되는 레퍼런스  
super.슈퍼클래스의멤버  
(서브 클래스에서만 사용, 슈퍼 클래스의 필드 접근)

### 추상 메소드(abstract method)
abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언

### 추상 클레스(abstract class)
추상 메소드를 가지며, abstract로 선언된 클래스
추상 메소드 없이, abstract로 선언한 클래스
## 4월 5일 강의

### 2차원 배열 선언
```
int intArray[][]; 또는 int [][] intArray;
```

### 배열 리턴
배열의 레퍼런스만 리턴 (배열 전체가 리턴되는 것이 아님)

### 메소드의 리턴 타입
리턴하는 배열 타입과 리턴 받는 배열 타입 일치  
리턴 타입에 배열의 크기를 지정하지 않음
```
int [] intArray;

intArray = makeArray(); 
```

### 자바의 예외 처리
1. 예외(Exception)  
실행 중 오작동이나 결과에 악영향을 미치는 예상치 못한 상황 발생  
(자바에서는 실행 중 발생하는 에러를 예외로 처리)

2. 실행 중 예외가 발생하면  
자바 플랫폼은 응용프로그램이 예외를 처리하도록 호출  
(응용프로그램이 예외를 처리하지 않으면 프로그램을 강제 종료시킴)

### try-catch-finally문
발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것
```
try {
    예외가 발생할 가능성이 있는 실행문(try 블록)
}
catch (처리할 예외 타입 선언) {
    예외 처리문 (catch 블록)
}
finally {
    예외 발생 여부와 상관없이 무조건 실행
}
```

### 나뉨수 나눗수 예시
```
import java.util.Scanner;

public class Ex3_13 {
    pubcli static void main(String[] args) {
        Scaner scanner = new Scanner(System.in);
        int dividend;// 나뉨수
        int divisor; // 나눗수

        System.out.print("나뉨수를 입력하시오:");
        dividend = scanner.newtInt(); // 나뉨수 입력
        System.out.print("나눗수를 입력하시오:");
        divisor = scanner.newtInt(); // 나눗수 입력
        try  {
            System.out.println(dividend+"를 " + divisor + "로 나누면 몫은 " + divdend/divisor + "입니다.");
        }
        catch(ArithmeticException e) { //ArithmeticException 예외 처리 코드
            System.out.println("0으로 나눌 수 없습니다!);
        }
        finally {
            scanner.close(); // 정상적이든 예외가 발생하든 최종적으로 scanner를 닫는다.
        }
    }
}
```

### 실세계 객체의 특징
1. 객체마다 고유한 특성(state)와 행동(behavior)를 가짐
2. 다른 객체들과 정보를 주고 받는 등, 상호작용하면서 살아감

예시) TV, 의자, 책, 집, 카메라, 컴퓨터
### 컴퓨터 프로그램에서 객체 사례
1. 테트리스 게임의 각 블록들
2. 한글 프로그램의 메뉴나 버튼들

### 캡슐화
캡슐화 : 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것  
객체의 가장 본질적인 특징  
(외부의 접근으로부터 객체 보호)  
예시) 캡슐약, TV, 자판기, 카메라, 사람

## 자바의 특징

### 1.자바의 캡술화
클래스(class): 객체 모양을 선언한 틀(캡슐화하는 틀)  
객체: 생성된 실체(instance)  
(클래스 내에 매소드와 필드 구현)

### 2.상속 
상위 개체의 속성이 하위 개체에 물려짐  
하위 개체가 상위 개체의 속성을 모두 가지는 관계 

### 2-1실세계의 상속 사례
나무는 식물의 속성과 생물의 속성을 모두 가짐  
사람은 생물의 속성은 가지지만 식물의 속성은 가지고 있지 않음

### 자바 상속
상위 클래스의 맴버를 하위 클래스가 물려받음
1. 상위 클래스: 수퍼 클래스
2. 하위 클래스: 서브 클래스, 수퍼 클래스 코드의 재사용, 새로운 특성 추가 기능

### 3.다형성
같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것 

다형성 사례  
1. 메소드 오버로딩 : 한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드  
2. 메소드 오버라이딩 : 슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현

## 객체 지향 언어의 목적

1. 소프트웨어의 생산성 향상

1-1 컴퓨터 산업 발전에 따라 소프트웨어의 생명주기(life cycle) 단축  
(소프트웨어를 빠른 속도로 생산할 필요성 증대)  

1-2 객체 지향언어  
(상속, 다형성, 객체, 캡슐화 등 소프트웨어 재사용을 위한 여러 장치 내장)  
(소프트웨어 재사용과 부분 수정 빠름)

## 절차 지향 프로그래밍과 객체 지향 프로그래밍

1. 절차 지향 프로그래밍  
작업 순서를 표현하는 컴퓨터 명령 집합  
함수들의 집합으로 프로그램 작성  

2. 객체 지향 프로그래밍  
컴퓨터가 수행하는 작업을 객체들간의 상호 작용으로 표현  
클래스 혹은 객체들의 집합으로 프로그램 작성

### 클래스와 객체

1. 클래스  
객체의 속성(state)과 행위(behavior) 선언  
객체의 설계도 혹은 틀

2. 객체  
클래스의 틀로 찍어낸 실체 

프로그램 실행 중에 생성되는 실체  
메모리 공간을 갖는 구체적인 실체  
인스턴스(instance)라고도 부름

### 클래스
class 키워드로 선언  
맴버 : 클래스 구성 요소  
필드(맴버 변수)와 메소드(맴버 함수)  

클래스에 대한 public 접근 지정 : 다른 모든 클래스에서 클래스 사용 허락

```
import java.util.Scanner;

public class RectApp {
    pyblic static void main(String[] args) {
        Rectangle rect = new Rectangle(); //객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = scanner.nextInt();
        rect.height= scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
    }
}

class Rectangle {
    int width;
    int height;
    public int getArea() {
        return width*height;
    }
}
```

### 생성자
객체가 생성될 때 초기화 목적으로 실행되는 메소드  
객체가 생성되는 순간에 자동 호출

### 생성자의 특징 
1. 생성자 이름은 클래스 이름과 동일하다
2. 생성자는 여러 개 작성 가능(생성자 중복)
3. 생성자는 객체 생성시 한 번만 호출
4. 생성자의 목적은 객체 생성 시 초기화
4. 생성자는 리턴 타입을 지정할 수 없음


```
pblic class Ex4_04 {
    String title;
    String author;
    
    public Ex4_04(String t) { //생성자
        title = t; author = "작자미상";
    }

    public Ex4_04(String t String a) { //생성자
        title = t; author = a;
    }

    public static void main(String[] args) {
        Ex4_04 littlePrince = new Ex4_04("어린왕자", "생텍쥐페리");
        Ex4_04 loveStory = new Ex4_04("춘향전");
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
```
### 객체 배열
자바의 객체 배열
객체에 대한 레퍼런스 배열이다

자바의 객체 배열 만들기 3단계
1. 배열 레퍼런스 변수 선언
2. 레퍼런스 배열 생성
3. 배열의 각 원소 객체 생성

### 메소드
메소드는 C/C++의 함수와 동일  
자바의 모든 메소드는 반드시 클래스 안에 있어야 함(캡슐화 원칙)

### 인자 전달 - 객체가 전달되는 경우
객체의 레퍼런스만 전달  
매개 변수가 실인자 객체 공유 

### 메소드 오버로딩
오버로딩(overloading)  
한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성  
메소드 이름이 동일하여야함

* 객체 치환은 객체 복사가 아니며, 레퍼런스의 복사이다.

### 객체 소멸

1. new에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위  
소멸된 객체 공간은 가용 메모리에 포함된다

2. 자바에서 사용자 임의로 객체 소멸 안됨  
자바는 객체 소멸 연산자 없음 (객체 생성 연산자 : new)  
객체 소멸은 자바 가상 기게의 고유한 역할  

자바 개발자에게는 매우 다행스러운 기능  
  -C/C++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제해야 함  
  -C/C++의 프로그램 작성을 어렵게 만드는 요인  
  -자바에서는 사용하지 않는 객체나 배열을 돌려주는 코딩 책임으로부터 개발자 해방

### 가비지
가리키는 레퍼런스가 하나도 없는 객체
(더 이상 접근할 수 없어 사용할 수 없게 된 메모리)

### 가비지 컬렉션   
 자바 가상 기계가 가비지 자동 회수  
 가용 메모리 공간이 일정 이하로 부족해질 때  
 가비지 컬렉터(garbage collector)에 의해 자동 수행

강제 가비지 컬렉션 강제 수행  
System 또는 Runtime 객체의 gc() 메소트 호출

### 패키지
상호 관련 있는 클래스 파일(컴파일된 .class)을 지정하여 관리하는 디렉터리
자바 응용프로그램은 하나 이상의 패키지로 구성

### 접근 지정자

자바의 접은 지정자 4가지  
private, protectedm, public, 디폴트(접근지정자 생략)

접근 지정자의 목적  
클래스나 일부 맴버를 공개하여 다른 클래스에서 접근하도록 허용  
객체 지향 언어의 캡슐화 정책은 맴버를 보호하는 것  
(접근 지정은 캡슐화에 묶인 보호를 일부 해제할 목적)

### 클래스 접근지정
다른 클래스에서 사용호도록 허용할 지 지정  
public 클래스 (다른 모든 클래스에게 접근 허용)  
디폴트 클래스 (접근지정자 생략)

### static 멤버
static 멤버 선언
객체 생성과 non-static 멤버의 생성
(non static 멤버는 객체가 생성될 때, 객체마다 생긴다)


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