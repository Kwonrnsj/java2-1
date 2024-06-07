# 권순혁 202330104

## 6월 7일 강의

### 스윙 컴포넌트 그리기
스윙의 페인팅 기본
- 모든 컴포넌트는 자신의 모양을 스스로 그린다.
- 컨테이너는 자신을 그린 후 그 위에 자식 컴포넌트들에게 그리기 지시
- 모든 스윙 컴포넌트는 자신의 모양을 그리는 paintComponent() 메소드 보유

public void paintComponent(Graphics g)
- 스윙 컴포넌트가 자신의 모양을 그리는 메소드

### paintComponent()의 오버라이딩과 JPanel
paintComponent()의 오버라이딩
- 개발자가 JComponent를 상속받아 새로운 컴포넌트 설계
- 기존 컴포넌트의 모양에 변화를 주고자 할 때

JPanel 
- 비어 있는 컨테이너

### 그래픽 기반 GUI 프로그래밍
그래픽 기반 GUI 프로그래밍
- 스윙 컴포넌트에 의존하지 않고 선, 원 이미지 등을 이용하여 직접화면을 구성하는 방법
- 그래픽 기반 GUI 프로그래밍의 학습이 필요한 이유
1. 컴포넌트의 한계를 극복하고 차트, 게임 등 자유로운 콘텐트 표현
2. 그래픽은 컴포넌트에 비해 화면 출력 속도가 빠름
3. 스윙 컴포넌트들로 모두 그래픽으로 작성되어 있어, 그래픽에 대한 학습은 자바 GUI의 바탕 기술을 이해하는데 도움
4. 그래픽을 이용하여 개발자 자신만의 컴포넌트 개발

### Graphics와 문자열 출력
Graphics의 기능
- 색상 선택
- 문자열 그리기
- 도형 그리기
- 도형 칠하기
- 이미지 그리기
- 클리핑

### 그래픽의 색과 폰트
- 색 : color 클래스
- 폰트 : Font 클래스
- Graphics 에 색과 폰트 설정

### 도형 그리기와 칠하기
도형 그리기
- 선, 타원, 사각형, 둥근 모서리 사격형, 원호, 폐 다각형 그리기
- 선의 굵기 조절할 수 없음

도형 칠하기
- 도형을 그리고 내부를 칠하는 기능  
(도형의 외각선과 내부를 따로 칠하는 기능 없음)
- 도형 칠하기를 위한 메소드  
(그리기 메소드 명에서 draw 대신 fill로 이름 대치하면 됨.fillRect(),fillOval()등)

### 스윙에서 이미지를 그리는 2가지 방법
1. JLabel을 이용한 이미지 그리기
장점 : 이미지 그리기 간편 용이
단점 : 이미지의 원본 크기대로 그리므로 이미지 크기 조절 불가

2. Graphics의 drawlmage()로 이미지 출력
장점 : 이미지 일부분 등 이미지의 원본 크기와 다르게 그리기 가능
단점 : 컴포넌트로 관리할 수 없음, 이미지의 위치나 크기 등을 적절히 조정하는 코딩 필요

### repaint()
repaint()
- 모든 컴포넌트가 가지고 있는 메소드
- 자바 플랫폼에게 컴포넌트를 그리기를 강제 지시하는 메소드 
- repaint()를 호출하면, 자바 플랫폼이 컴포넌트의 pintComponent() 호출

repaint()의 호출이 필요한 경우  
개발자가 컴포넌트를 다시 그리고자 하는 경우
- 프로그램에서 컴포넌트의 모양과 위치를 변경하고 바로 화면에 반영시키고자 하는 경우

### 멀티태스킹(multi-tasking)의 개념
멀티태스킹
- 여러 개의 작업(태스크)이 동시에 처리되는 것

### 스레드와 운영체제
스레드(thread)  
- 운영체제에 의해 관리되는 하나의 작업 혹은 태스크  
스레드와 태그크(혹은 작업)은 바꾸어 사용해도 무관

멀티스레딩(multi-threading)
- 여러 스레드를 동시에 실행시키는 응용프로그램을 작성하는 기법

스레드 구성  
- 스레드 코드  
(작업을 실행하기 위해 작성한 프로그램 코드)

### 멀티태스킹과 멀티스레딩
멀티프로세싱
- 하나의 응용프로그램이 여러 개의 프로세스를 생성하고, 각 프로세스가 하나의 작업을
처리하는 기법이다.
- 각 프로세스 독립된 메모리 영역을 보유하고 실행
- 프로세스 사이의 문책 교환에 따른 과도한 오버ㅔ드와 시간 소모의 문제점

멀티스레딩
- 하나의 응용프로그램이 여러 개의 스레드를 생성하고, 각 스레드가 하나의 작업을
처리하는 기법
- 하나의 응용프로그램에 속한 스레드는 변수 메모리, 파일 오픈 테이블 등
자원으로 공유하므로, 문맥 교환에 따른 오버헤드가 매주 작음
- 현재 대부분의 운영체제가 멀티스레딩을 기본으로 하고 있음

### 자바 스레드(Thread)와 JVM
자바 스레드
- 자바 가상 기계(JVM)에 의해 스케쥴되는 실행 단위의 코드 블럭
- 스레드의 샐명 주기는 JVM에 의해 관리됨 : JVM은 스레드 단위로 스케쥴링

JVM과 자바의 멀티스레딩
- 하나의 JVM은 하나의 자바 응용프로그램만 실행  
(자바 응용프로그램이 시작될 때 JVM이 함께 실행됨)  
(자바 응용프로그램이 종료하면 JVM이 함께 종료함)
- 응용프로그램은 하나 이상의 스레드로 구성 가능하다.

### Thread클래스를 상속받아 스레드 만들기
Thread를 상속받아 run() 오버라이딩
- Thread 클래스 상속, 새 클래스 작성
- run() 메소드 작성 (run() 메소드를 스레드 코드라고 부름)

스레드 객체 생성
- 생성된 객체는 필드와 메소드를 가진 객체일 뿐 스레드로 작동하지 않음

스레드 시작
start() 메소드 호출
- 스레드로 작동 시작
- 스레드 객체의 run()이 비로소 실행
- JVM에 의해 스케쥴되기 시작함

### Runnable 인터페이스로 스레드 만들기
Runnable 인터페이스 구현하는 새 클래스 작성
- run() 메소드 구현
    1. run() 메소드를 스레드 코드라고 부름
    2. run() 메소드에서 스레드 실행 시작

- 스레드 객체 생성

### main 스레드
main 스레드
- JVM이 응용프로그램을 실행할 때 디폴트로 생성되는 스레드
- main() 메소드 실행 시작

### 스레드 종료와 타 스레드 강제 종료
- 스스로 종료  
( run()메소드 리턴 )

- 타 스레드에서 강제 종료   
( interrupt() 메소드 사용 )

### 스레드 동기화
- 멀티스레드 프로그램 작성시 주의점  
    다수의 스레드가 공유 데이터에 동시에 접근하는 경우  
    (공유 데이터의 값에 예상치 못한 결과 발생 가능)  
- 스레드 동기화  
동기화란?  
스레드 사이의 실행순서 제어, 공유데이터에 대한 접근을 원활하게 하는 기법

- 멀티스레드의 고융 데이터의 동시 접근 문제 해결  
방법 1) 공유 데이터르 접근하는 모든 스레드의 한 줄 세우기  
방법 2) 한 스레드가 공유 데이터에 대한 작업을 끝낼 때까지 다른 스레드가 대기 하도록 함

- 자바의 스레드 동기화 방법 2가지
1. synchronized 키워드로 동기화 블록 지정
2. wait()-notify() 메소드로 스레드의 실행 순서 제어

### 동기화의 필요성
- 두 스레드가 프린터에 동시에 충돌하는 경우

### synchronized 불록 지정
synchronized 키워드
- 스레드가 독점적으로 실행해야 하는 부분(동기화 코드)을 표시하는 키워드
(임계 영역 표기 키워드)

synchronized 블록이 실행될 때
- 먼저 실행한 스레드가 모니터 소유
(모니터란 해당 객체를 독점적으로 사용할 수 있는 권한)
- 모니터를 소유한 스레드가 모니터를 내놓을때 까지 다른 스레드 대기

### wait-notify를 이용한 스레드 동기화
- wait-notify()가 필요한 경우  
    공유 데이터로 두 개 이상의 스레드가 데이터를 주고 받을 때  
    (producer-consumer문제)
- 동기화 메소드 
    wait() : 다른 스레드가 notify()를 불러줄 때까지 기다린다.  
    notify() : wait()를 호출하여 대기중인 스레드를 깨운다.  
     ( wait(), notify()는 Object의 메소드 )

## 5월 31일 강의

### 자바의 GUI 프로그래밍 방법
컴포넌트 기반 GUI 프로그래밍  
    스윙 컴포넌트를 이용하여 쉽게 GUI를 구축  
    자바에서 제공하는 컴포넌트의 한계를 벗어나지 못함

### 스윙 컴포넌트의 공통 메소드, Jcomponent
(JComponent)  
스윙 컴포넌트는 모두 상속받는 슈퍼 클래스, 추상 클래스  
스윙 컴포넌트들이 상속받는 공통 메소드와 상수 구현  
JComponent의 주요 메소드 사례

### JLabel의 용도
문자열이나 이미지를 화면에 출력하기 위한 목적이다

1. 문자열 레이블 생성
```
JLabel textLabel = new Label("사랑합니다");
```

2. 이미지 레이블 생성  
이미지 파일로부터 이미지를 읽기 위해 imagelcon 클래스 사용  
다룰 수 있는 이미지 : png, gif, jpg

### 이미지 버튼 만들기  
1. 하나의 버튼에 3개의 이미지 등록  
마우스 조작에 따라 3개의 이미지 중 적절한 이미지 자동 출력

### 이미지 버튼에 이미지 설정 
1. 이미지 로딩  
필ㅇ한 이미지 로딩 : new lmagelcon(이미지 경로명);

2. 버튼에 이미지 등록  
JButton의 메소드를 호출하여 이미지 등록

### 체그박스에 Item 이벤트 처리
1. Item 이벤트  
체그 박스의 선택 상태에 변화가 생길 때 발생하는 이벤트    
사용자가 마우스나 키보드로 체그박스를 선택/해제할 때  
프로그램에서 체그박스를 선택/해제하여 체그 상태에 변화가 생길 때  
이벤트가 발생하면 ItemEvent 객체 생성  
ItemListener 리스너를 이용하여 이벤트 처리

### JRadioButton의 용도
버튼 그룹을 형성하고, 그룹에 속한 버튼 중 하나만 선택되는 라디오버튼

### 라디오버튼에 Item 이벤트 처리 : ItemListener 리스너 이용
라디오버튼이 선택/해제되어 상태가 달라지면, Item 이벤트 발생  
사용자가 마우스나 키보드로 선택 상태를 변경할 때

### JTextField로 한 줄 입력 창 만들기
한줄의 문자열을 입력 받는 창(텍스트필드)
텍스트 입력 도중 <Enter>키가 입력되면 Action 이벤트 발생
입력 가능한 문자 개수와 입력 창의 크기는 서로 다름

### JTextArea
여러 줄의 문자열을 입력받을 수 있는 창(텍스트 영역)  
스크롤바를 지원하지 않는다 

### JList
하나 이상의 아이템을 보여주고 아이템을 선택하도록 하는 리스트  
java 7부터 제네릭 리스트로 바뀜  
JScrollPane에 JList를 삽입하여 스크롤 가능

### JComboBox
텍스트 필드와 버튼, 그리고 드롭다운 리스트로 구성되는 콤보박스  
드롭다운 리스트에서 선택한 것이 텍스트 필드에 나타남

### 메뉴 구성
메뉴 만들기에 필요한 스윙 컴포넌트  
메뉴 아이템 - JMenuItem  
메뉴 - JMenu(여러 개의 메뉴 아이템을 가짐)
메뉴바 -JMenuBar  

### 메뉴 아이템에 Action 이벤트 달기
메뉴 아이템을 클릭하면 Action 발생
메뉴 아이템은 사용자로부터 지시나 명령을 받는데 사용

### 팝업 다이얼로그, JOptionPane
사용자에게 메시지를 전달하거나 문자열을 간단히 입력받는 용도

### 확인 다이얼로그
확인 다이얼로그 - JoptionTane.showConfirmDialog

## 5월 24일 강의

### 이벤트 기반 프로그래밍
1. 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식이다  
(이벤트가 발생하면 이벤트를 처리하는 루틴(이벤트 리스너) 실행   
2. 반대되는 개념 : 배치 실행  
(프로그램의 개발자가 프로그램의 흐름을 결정하는 방식)  
3. 이벤트 종류  
사용자의 입력 : 마우스 드래그, 마우스 클릭, 키보드 누름 등  
센서로부터의 입력, 네트워크로부터 데이터 송수신  
다른 응용프로그램이나 다른 스레드로부터의 메세지  
4. 이벤트 기반 프로그램의 구조   
각 이벤트마다 처리하는 리스너 코드 보유  
5. GUI 응용프로그램은 이벤트 기반 프로그래밍으로 작성된  
GUI 라이브러리 종류  
C++의 MFC, C# GUI, Visual Basic, X Window, Android등  
자바의 AWT와 Swing

### 자바 스윙 프로그램에서 이벤트 처리 과정
처리 과정 >>
1. 이벤트 발생 (마우스의 움직임 혹은 키보드입력)
2. 이벤트 객체 생성 (현재 발생한 이벤트에 대한 정보를 가진 객체)
3. 응용프로그램에 작성된 이벤트 리스너 찾기
4. 이벤트 리스너 실행(리스너에 이벤트 객체 전달, 리스너 코드 실행)

### 이벤트 객체
1. 이벤트 객체란?  
    발생한 이벤트에 관한 정보를 가진 객체  
    이벤트 리스너에 전달됨(이벤트 리스너 코드가 발생한 이벤트에 대한 상황 파악 가능)

2. 이벤트 겍체가 포함하는 정보  
    이벤트 종류와 이벤트 소스   
    이벤트가 발생한 화면의 좌표 및 컴포넌트 내 좌표  
    이벤트가 발생한 버튼이나 메뉴 아이템의 문자열  
    클릭된 마우스 버튼 번호 및 마우스의 클릭 횟수  
    키의 코드 값과 문자 값  
    체크박스, 라디오버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태

3. 이벤트 소스를 알아 내는 메소드
    Object getSource()  
    발생한 이벤트의 소스 컴포넌트 리턴  
    Object 타입으로 리턴하므로 캐스팅하여 사용  
    모든 이벤트 객체에 대해 적용

### 리스너 인터페이스
1. 이벤트 리스너
이벤트를 처리하는 자바 프로그램 코드, 클래스로 작성

2. 자바는 다영한 리스너 인퍼페이스 제공
ActionListener 인터페이스 - 버튼 클릭 이벤트를 처리하기 위한 인터페이스
```
interface ActionListener { // 아래 매소르르 개발자가 구현해야 함
    public void actionPerformed(ActionEvent e); // Action 이벤트 발생시 호출됨
}
```
MouseListener 인터페이스 - 마우스 조작에 따른 이벤트를 처리하기 위한 인터페이스

3. 사용자의 이벤트 리스너 작성
자바의 리스너 인퍼테이스(interface)를 상속받아 구현
리스너 인터페이스의 모든 추상 메소드 구현

### 이벤트 리스너 작성 과정 사례
1. 이벤트와 이벤트 리스너 선택  
    버튼 클릭을 처리하고자 하는 경우  
    (이벤트 : Action 이벤트, 이벤트 리스너 : ActionListener)

2. 이벤트 리스너 클래스 작성 : ActionListener 인터페이스 구현

3. 이벤트 리스너 등록 
이벤트를 받아 처리하고자 하는 컴포넌트에 이벤트 리스너 등록  
component.addXXXListener(listener)  
xxx : 이벤트 명 , listener : 이벤트 리스너 객체 생성
```
MyActionListener listener = new MyActionListener(); // 리스너 인스턴스 생성
btn.addActionListener(listener);                    // 리스너 등록
```

### 이벤트 리스너 작성 방법
3가지 방법
1. 독립 클래스로 작성  
이벤트 리스너를 완전한 클래스로 작성  
이벤트 리스너를 여러 곳에서 사용할 때 적합  
2. 내부 클래스(inner class)로 작성  
클래스 안에 멤버처럼 클래스 작성  
이벤트 리스너를 특정 클래스에서만 사용할 때 적합  
3. 익명 클래스(anonymous class)로 작성
클래스의 이름 없이 간단히 리스너 작성  
클래스 조차 만들 필요 없이 리스너 코드가 간단한 경우에 적합

### 익명 클래스로 이벤트 리스너 작성 
익명 클래스(anonymoun class) : 이름 없는 클래스  
(클래스 선언 + 인스턴스 생성)을 한번에 달성
```
new 익명클래스의슈퍼클래스이름(생성자인자들) {
    ...............
    익명클래스의 멤버 구현
    ...............
};
```
간단한 리스너의 경우 익명 클래스 사용 추천  
(메소드에 개수가 1, 2개인 리스너에 대해 주로 사용)

### 어댑터 클래스
1. 이벤트 리스너 구현에 따른 부담
리스너의 추상 메소드를 모두 구현해야 하는 부담
예) 마우스 리스너에서

### Key 이벤트와 포커스
1. 키 입력 시 ,다음 세 경우 각각 Key 이벤트 발생  
키를 누르는 순간    
누른 키를 떼는 순간  
누른 키를 떼는 순간(Uniode 키의 경우에만)  
2. 키 이벤트를 받을 수 있는 조건  
모든 컴포넌트  
현재 포커스를 가진 컴포넌트가 키 이벤트 독점  
3. 포커스(focus)
컴포넌트나 응용프로그램이 키 이벤트를 독전하는 권한

### keyListener
응용프로그램에서 KeyListener를 상속받아 키 리스너 구현

### 유니코드 키
1. 유니코드 키의 특징  
국제 산업 표준  
전 세계의 문자를 컴퓨터에서 일관되게 표현하기 위한 코드 체계  
문자들에 대해서만 키 코드 값 정의  
2. 유니코드 키가 입력되는 경우  
KeyPressed(), KeyTyped(), KeyReleased()가 순서대로 호출  
3. 유니코드 키가 아닌 경우  
KeyPressed(), KeyReleased()만 호출됨

### 가상 키와 입력된 키 판별
1. KeyEvent 객체   
입력된 키 정보를 가진 이벤트 객체  
KeyEvent 객체의 메소드로 입력된 키 판별  
2. KeyEvent  객체의 메소드로 입력된 키 판별  
char KeyEvent.getKeyChar()  
키의 유니코드 문자 값 리턴  
Unicode 문자 키인 경우에만 의미 있음  
입력된 키를 판별하기 위해 문자 값과 비교하면 됨  

### 가상 키(Virtual Key)
가상 키는 KeyEvent 클래스에 상수로 선언

### Mouse 이벤트와 MouseListener, MouseMotionListener
1. Mouse 이벤트 : 사용자의 마우스 조작에 따라 발생하는 이벤트

### 마우스 리스너 달기와 MouseEvent 객체 활용
1. 마우스 리스너 달기
마우스 리스너는 컴포넌트에 다음과 같이 등록
```
component.addMouseListener(myMouseListener);
```
2. MouseEvent 객체 활용
마우스 포인터의 위치, 컴포넌트 내 상대 위치
int getX(), it getY()

## 5월 17일 강의

### 컨테이너의 배치관리자 유형 4가지
1. FlowLayout 배치 관리자  
컴포넌트가 삽입되는 순서대로 왼쪽에서 오른쪽으로 배치
2. BorderLayout 배치 관리자  
컨테이너의 공간을 동, 서, 남, 북, 중앙의 5개 영역으로 나눔
3. GridLayout 배치관리자  
컨테이너를 프로그램에서 설정한 동일한 크기의 2차원 격자로 나눔
4. CardLayout  
컨테이너의 공간에 카드를 쌓아 놓은 듯이 컴포넌트를 포개어 배치

### 컨테이너의 디폴트 배치관리자
AWT와 스윙 컨테이너  
window,jwindow 디폴트 괸리자 > BorderLayout

### 컨테이너의 새로운 배치관리자 설정
컨테이너에 새로운 배치관리자 설정  
setLayout(LayoutManager lm) 메소드 호출  
lm을 새로운 배치관리자로 설정

### FlowLayout 배치관리자
컴포넌트를 컨테이너 내에 왼쪽에서 오른쪽으로 배치   

### FlowLayout의 생성자
FlowLayout()  
FlowLayout(int align, inthGap, intvGap)  
align: 컴포넌트를 정렬하는 방법 지정,   
hGap:좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위, 디폴트는 5  
vGap:상하 두 컴포넌트 사이의 수평 간격, 픽셀 단위, 디폴트는 5

### FlowLayout 사용 예시
```
public class FlowLayoutEx extends JFrame{
    public FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 왼쪽 정렬로, 수평 간격을 30, 수직 간격을 40 픽셀로 배치하는
        // FlowLayout 생성

        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));
        
        setSize(300, 200); // 프레임 크기 300X200 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
```

### BorderLayout 생성자
BorderLayout()  
BorderLayout(int hGap, int vGap)  
hGap:좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위, 디폴트 : 0    
vGap:상하 두 컴포넌트 사이의 수평 간격, 픽셀 단위, 디폴트 : 0    

add() 메소드  
void add(Component comp, int index)  
comp 컴포넌트를 index 위치에 삽입한다.  
index: 컴포넌트의 위치 

### BorderLayout 사용 예시

```
public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx() {
        setTitle("BorderLayoutEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 컨텐트팬에 BorderLayout 배치관리자 설정

        contentPane.setLayout(new BorderLayout());

        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
        contentPane.add(new JButton("add"), BorderLayout.NORTH);
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"), BorderLayout.EAST);
        contentPane.add(new JButton("div"), BorderLayout.WEST);
        
        setSize(300, 200); // 프레임 크기 300X200 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
```

### GridLayout 배치관리자
컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고 각 셀에 컴포넌트 하나씩 배치   
생성자에 행수와 열수 지정, 셀에 왼쪽에서 오른쪽으로, 다시 위에서 아래로 순서대로 배치

### GridLayout 생성자
GridLayout()  
GridLayout(int rows, int cols)  
GridLayout(int rows, int cols, int hGap, int vGap)  
rows : 격자의 행수(디폴트 1)  
cols : 격자의 열수(디폴트 1)    
hGap:좌우 두 컴포넌트 사이의 수평 간격, 픽셀 단위, 디폴트 : 0      
vGap:상하 두 컴포넌트 사이의 수평 간격, 픽셀 단위, 디폴트 : 0      
rows x cols 만큼의 셀을 가진 격자로 컨테이너 공간을 분할, 배치

### GridLayout 사용 예시
```
public class GridLayoutEx extends JFrame{
    public GridLayoutEx() {
        setTitle("GridLayoutEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 1x10의 GridLayout 배치관리자

        contentPane.setLayout(new GridLayout(1, 10));

        for(int i=0; i<10; i++) { // 10개의 버튼 부착
            String text = Integer.toString(i); // i를 문자열로 변환
            JButton button = new JButton(text);
            contentPane.add(button); // 컨텐트에 버튼 부착
        }

        setSize(500, 200); // 프레임 크기 300X200 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
```

### 배치관리자 없는 컨테이너
배치관리자가 없는 컨테이너가 필요한 경우 

응용프로그앰에서 직접 컴포넌트의 크기와 위치를 결정하고자 하는 경우  
1. 컴포넌트의 크기나 위치를 개잘하 임의로 결정하고자 하는 경우  
2. 게임 프로그램과 같이 시간이나 마우스/키보드의 입력에 따라 컴포넌트들의 위치와  
크기가 수시로 변하는 경우  
3. 여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우

### 컴포넌트의 절대 위치와 크기 설정
배치관리자가 없는 컨테이너에 컴포넌트를 삽입할 때
1. 프로그램에서 컴포넌트의 절대 크기와 위치 설정
2. 컴포넌트들이 서로 겹치게 할 수 있음

### 컴포넌트 배치관리자
```
public class NullContainerEx extends JFrame{
    public NullContainerEx() {
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null); // 컨텐트팬의 배치관리자 제거

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(130, 50);
        la.setSize(200, 20);
        contentPane.add(la);



        for(int i=0; i<=9; i++) { // 10개의 버튼 부착
            JButton b = new JButton(Integer.toString(i));
            b.setLocation(i*15, i*15);
            b.setSize(50, 20);
            contentPane.add(b);
        }

        setSize(300, 200); // 프레임 크기 300X200 설정
        setVisible(true); // 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new NullContainerEx();
    }
}
```

## 5월 3일 강의

### 컬렉션의 개념
1. 요소(element) 라고 불리는 가변 개수의 객체들의 저장소  
(객체들의 컨테이너라고도 불림)  
(요소의 개수에 따라 크기 자동 조절)   
(요소의 삽입, 삭제에 따른 요소의 위치 자동 이동)  
2. 고정 크기의 배열을 다루는 어려움 해소  
3. 다양한 객체들의 삽입, 삭제, 검색 등의 관리 용이

### 컬렉션의 특징
컬렉션은 제네릭 기법으로 구현 

제네릭 컬렉션 사례 : 벡터 Vector <.E>  
E 에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용  
제네릭은 형판과 같은 개념이다.

### 제네릭
제레닉은 특정 타임만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나  
특정 메소드를 일반화시키는 기법 

C++의 템플릿과 동일  
JDK 1.5부터 도입(2004년 기점)

### 벡터 Vector <.E>
<.E>에 사용할 요소의 특정 타입으로 구체화    
배열을 가변 크기로 다룰 수 있게 하는 컨테이너  
요소 객체들을 삽입,삭제,검새가는 컨테이너  
Vector에 삽입 가능한 것 (객체, null)  
Vector에 객체 삽입(벡터의 맨 뒤, 중간에 객체 삽입 가능)  
Vector에서 객체 삭제(임의의 위치에 있는 객체 삭제 가능)

```
int n = v.size() // n은 3 (사용 중인 값)
int c = v.capacity(); // c는 7(전체 값)
```
## 벡터 예시 
```
public class VectorEx {
    public static void main(String[] args) {
        // 정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<Integer>();
        v.add(5); // 5 삽입
        v.add(4); // 4 삽입
        v.add(-1);  // -1 삽입

        // 벡터 중간에 삽입하기
        v.add(2,100); // 4와 -1 사이에 정수 100 삽입
        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        // 모든 요소 정수 출력하기
        for(int i=0; i<v.size(); i++) {
            int n = v.get(i); // 벡터의 i 번째 정수
            System.out.println(n);
        }
        // 벡터 속의 모든 정수 더하기
        int sum = 0;
        for (int i=0; i<v.size(); i++) {
            int n = v.elementAt(i);
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
       
    }
}

```

### JDK 1.5 이전
Vector<.Integer> v = new Vector<.Integer>(); // java 7 이전
7 이후
Vector<.Integer> v = new Vector<>(); // java 7부터 추가, 가능
10 이후
var v = new Vector<.Integer>(); // java 10부터 추가, 가능

### ArrayList
가변 크기 배열을 구현한 클래스  
벡터와 거의 동일하다

### Iterator 인터페이스
리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 인터페이스

### HashMap
키와 값의 쌍으로 구성되는 요소를 다루는 컬렉션  
삽입 및 검색이 빠른 특징이 존재
## HashMap 예시 
```
public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("baby", "아기");
        dic.put("love","사랑");
        dic.put("apple", "사과");

        Set<String> keys = dic.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = dic.get(key);
            System.out.println("(" + key + "," + value + ") ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<3; i++) {
            System.out.println("찾고 싶은 단어는?");
            String eng = scanner.next();
            String kor = dic.get(eng);
            if(kor == null)
                    System.out.println(eng + "는 없는 단어 입니다.");
                
            else   
                    System.out.println(kor);
        }
    }
```
### 제네릭 만들기
1. 제네릭 클래스 작성  
클래스 이름 옆에 일반화된 타입 매개 변수 추가하기  
2. 제네릭 객체 생성 및 활용  
제네릭 타입에 구체적인 타입을 지정하여 객체를 생성하는 것을 구체화하고 함

### 자바의 GUI
GUI란  사용자가 편리하게 입출력 할 수 있도록 그래픽으로 화면을 구성하고, 마우스나   키보드로 입력 받을 수 있도록 지원하는 사용자 인터페이스  
자바 언어에서 GUI 응용프로그램 작성  
AWT와 Swing 패키지에 강력한 GUI 컴포넌트 제공  
쉬운 GUI 프로그래밍

### AWT
자바가 청므 나왔을 때부터 배포된 GUI 패키지, 최근에는 거의 사용하지 않음

### Swing 패키지
AWT 기술을 기반으로 작성된 자바 라이브러리  
모든 AWT 기능 + 추가된 풍부하고 화려한 고급 컴포넌트

### 컨테이너
다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트

### 컴포넌트
컴테이너에 포함되어야 화면에 출력될 수 있는 GUI객체  
다른 컴포넌트를 포함할 수 없는 순수 컴포넌트  
모든 GUI 컴포넌트가 상속받는 클래스: java.awt.Component  
스윙 컴포넌트가 상속받는 클래스: javax.swing.JComponent  

### 컴포넌트 예시
```
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame{
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제"); //프레임의 타이틀 달기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();// 컨텐트팬 알아내기
        contentPane.setBackground(Color.ORANGE);// 오렌지색 배경 설정
        contentPane.setLayout(new FlowLayout());//컨텐팬에 FlowLayout
                                                // 배치관리자 달기
        contentPane.add(new JButton("OK")); //ok버튼 달기
        contentPane.add(new JButton("Cancel")); // Cancel 버튼 달기
        contentPane.add(new JButton("Ignore")); // Ignore 버튼 달기

        setSize(300, 150); //프레임 크기 300x150 설정
        setVisible(true);// 화면에 프레임 출력
    }
    public static void main(String[] args) {
        new ContentPaneEx();
    }
}

```

### 최강위 컨테아너
다른 컨테이너에 포함되지 않고도 화면에 출력되며 독립적으로 존재 가능한 컨테이너  
(스스로 화면에 자신을 출력하는 컨테아너 : JFrame, JDialog, JApplet)


### 컨테이너와 컴포넌트의 포함관계
최상위 컨테이너를 바닥에 깔고, 그 위에 컨테이너를 놓고,  
다시 컴포넌트를 쌓아가는 방식

### 스윙 GUI 프로그램 만들기
스윙 GUI 프로그램을 만드는 과정
1. 스윙 프레임 만들기
2. main() 메소드 작성
3. 스윙 프레임에 스윙 컴포넌트 붙이기

### 스윙 프레임
스윙 프레임이란 모든 스윙 컴포넌트를 담는 최상위 컨테이너
(Jframe을 상속받아 구현, 컴포넌트들은 화면에 보이려면 스윙 프레임에 부착 되어야 함)

스윙 프레임 기본 구성
프레임 - 스윙 프로그램의 기본 틀
메뉴바 - 메뉴들이 부착되는 공간
컨텐트팬 - GUI 컴포넌트들이 부착되는 공간

컨텐트팬이란 ?  
스윙 컴포넌트들이 부착되는 공간

타이틀 달기  
super()나 setTitle() 이용
## 프레임 예시
```
import javax.swing.*;

public class MyFrame extends JFrame{
    public MyFrame() {
        setTitle("300x300 프레임");
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

```

### 스윙 응용프로그램에서 main()의 기능과 위치
스윙 응용프로그램이에서 main()의 기능과 최소한의 바람직  
스윙 응용프로그램이 실행되는 시작점으로서의 기능만  
스윙 프레임을 생성하는 정보의 코드로 최소화  

# 4월 19일 강의

### 추상 클래스의 상속과 구현
1. 추상 클래스 상속  
추상 클래스를 상속받으면 추상 클래스가 된다  
서브 클래스도 abstract로 선언해야 함  
2. 추상 클래스 구현  
서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)  
추상 클래스를 구현한 서브 클래스는 추상 클래스 아님

추상 클래스 Calculator를 상속받는 GoodCalc 클래스를 구현하라.
```
abstract class Calculator 
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract int double average(int[] a);
```

### 자바의 인터페이스
스프트웨어를 구격화된 모듈로 만들고,   
인터페이스가 맞는 모듈을 조립하듯이 응용프로그램을 작성 하기위해서 사용

1. 자바의 인터페이스    
클래스가 구현해야 할 메소드들이 선언되는 추상형  
인터페이스 선언  
(interface 키워드로 선언)  

2. 자바 인터페이스에 대한 변화
Java 7까지  
(인터페이스는 상수와 추상 메소드로만 구성)  
Java 8부터  
(상수와 추상메소드 포함)  
3. 여전히 인터페이스에는 필드(멤버변수) 선언 불가능  

### 자바의 인터페이스 특징

인터페이스의 객체 생성 불가능

### 인터페이스 상속
인터페이스 간에 상속 가능  
인터페이스를 상속하여 확장된 인터페이스 작성 가능  
인터페이스 다중 상속 허용


### 추상 클래스의 목적
상속을 위한 슈퍼 클래스로 활용하는 것  
서브 클래스에서 추상 메소드 구현  
다형성 실현

### 패키지 개념과 필요성 
3명이 분담하여 자바 응용프로그램을 개발하는 경우  
동일한 이름의 클래스가 존재할 가능성 있음  
-> 합칠 때 오류 발생 가능성  
-> 개발자가 서로 다른 디렉터리로 코드 관리하여 해결

### 자바의 패키지와 모듈이란?
1. 패키지(package)  
서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들은 묶어 놓은 디렉터리  
하나의 응용프로그램은 한 개 이상의 패키지로 작성  
패키지는 jar파일로 압축할 수 있음
2. 모듈
여러 패키지와 이미지 등의 자원을 모아 놓은 컨테이너  
하나의 모듈을 하나의 .jmod 파일에 저장
3. Java 9부터 모듈화 도입  
Java 9부터 자바 API의 모든 클래스를(자바 실행 환경)을 패키지 기반에서 모듈들로 완전히 재구성  
4. 응용 프로그램 모듈화
클래스들은 패키지로 만들고, 다시 패키지를 모듈로 만듦  
모듈 프로그래밍은 어렵고 복잡, 기존 방식으로 프로그램 작성  

### 자바의 모듈화의 목적
1. 모듈화의 목적   
java 9 부터 자바 API를 여러 모듈(99개)로 분할  
(java 8까지는 rt.jat의 한 파일에 모든 API 저장)  
응용 프로그램이 실행할 때 꼭 필요한 모듈들로만 실행 환경 구축

2. 모듈의 현실
java9부터 전면적 도입  
복잡한 개념  
큰 자바 응용 프로그램에는 개발, 유지보수 등에 적합  
현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요 없음

### 자바 API의 모듈 파일들
1. 자바  JDK에 제공되는 모듈 파일들
 자바가 설치된 jmods 디렉터리에 모듈 파일 존재

### 패키지 사용하기, import문
1. 다른 패키지에 작성된 클래스 사용
import를 이용하지 않는 경우 >
소스에 클래스 이름의 완전 경로명 사용

### 패키지 만들기
1. 클래스 파일(.class)이 저장되는 위치는?
클래스나 인터페이스가 컴파일되면 클래스 파일(.class) 생성
클래스 파일은 패키지로 선언된 디렉터리에 저장

2. 패키지 선언
소스 파일의 맨 앞에 컴파일 후 저장딜 패키지 지정
package 패키지명;

### 모듈
java 9에서 도입된 개념
패키지와 이미지등의 리소스를 담은 컨테이너

### 자바 플롯폼의 모듈화
자바 플랫폼  
자바의 개발 환경(JDK)을 지칭  
자바 API이 묻는 클래스가 여러개의 모듈로 재구성 됨  
모듈 파일로부터 모듈을 푸는 명령어

### 자바 모듈화의 목적
가장 큰 목적
자바 컴포넌트들을 필요에 따라 조립하여 사용하기 위함  
컴퓨터 시스템의 불필요한 부담 감소  
(세밀한 모듈화를 통해 필요 없는 모듈이 로드되지 않게 함)

### Object 클래스
특징 모든 자바 클래스는 반드시 Object를 상속 받도록 자동 컴파일  
모든 클래스의 수퍼 클래스  
모든 클래스가 상속 받는 공통 메소드 포함

### 객체 속성
Object 클래스는 객체의 속성을 나타내는 메소드 제공

### toString() 메소드, 객체를 문자열로 변환
1. 각 클래스는 toString()을 오버라이딩하여 자신만의 문자열 리턴 가능  
객체를 문자열로 반환    
원형(public Ststic toString();)  
2. 컴파일러에 의한 toString() 자동 변환  
'객체 + 문자열' -> '객체.toString() + 문자열'로 자동 변환  
객체를 단독으로 사용 하는 경우-> 객체.toString()으로 자동 변환  

### 객체 비교(==)와 equals() 메소드
== 연산자  
객체 레퍼런스 비교  
 
booean equals(Object obj)   
두 객체의 내용물 비교  
객체의 내용물을 비교하기 위해 클래스의 멤버로 작성  

### Wrapper 클래스
1. Warpper 클래스  
자바의 기본 타입을 클래스화한 8개 클래스를 통칭

2. 용도
객체만 사용할 수 있는 컬렉션 등에 기본 타입의 값을 사용하기 위해 -> Wrapper 객체로 만들어 사용

### Wrapper 객체 생성
기본 타입의 값으로 Wrapper 객체 생성  
문자열로 Wrapper 객체 생성  
Float 객체는 double 타입의 값으로 생성 가능

### 박싱과 언박싱
1. 박싱(boxing)  
기본 타입의 값을 Wrapper 객체로 변환하는 것

2. 언박싱(unboxing)  
Wrapper 객체에 들어 있는 기본 타입의 값을 빼내는 것  
, 박싱의 반대

3. 자동 박싱과 자동 언박싱  
JDK 1.5부터 박싱과 언박싱은 자동으로 이우러지도록 컴파일됨

### String의 생성과 특징
String 클래스는 문자열을 나타냄

### String 활용
공백 제거, String trim()

### Math 클래스
기본 산술 연산 메소드를 제공하는 클래스
모든 메소드는 static으로 선언

abs
sqrt
exp0
round























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