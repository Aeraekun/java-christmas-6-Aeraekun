## 기능 목록

- [X] 프로그램 시작 시, "안녕하세요! 우테코 식당 12월 이벤트 플래너입니다." 출력

- [X] 방문 날짜 입력 받기
  - [X] "12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)" 출력
  - [X] 숫자로만 입력 받았는지 확인
    - [X] 숫자가 아닌 값을 입력할 경우, NumberFormatException 발생
      - [X] "[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요." 출력 후 다시 입력 받기
  - [X] 1 ~ 31 범위 내인지 확인
    - [X] 범위 외의 값 입력할 경우, IllegalArgumentException 발생
      - [X] "[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요." 메시지 출력후 다시 입력 받기

- [X] 메뉴 입력 받기
  - [X] enum으로 메뉴 구현
  - [X] "주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)" 출력
  - [] 올바른 메뉴를 입력 받았는지 확인
    - [X] 메뉴판에 없는 메뉴를 입력받을 경우, IllegalArgumentException 발생
      - [X] "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요." 출력 후 다시 입력 받기
    - [X] 메뉴의 개수가 숫자가 아닐 경우, NumberFormatException 발생
      - [X] "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요." 출력 후 다시 입력 받기
    - [X] 메뉴의 개수가 1 이상의 숫자가 아닐 경우, IllegalArgumentException 발생
      - [X] "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요." 출력 후 다시 입력 받기
    - [X] 메뉴 형식이 예시와 다른 경우, IllegalArgumentException 발생
      - [X] "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요." 출력 후 다시 입력 받기
    - [X] 중복 메뉴를 입력한 경우, IllegalArgumentException 발생
      - [X] "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요." 출력 후 다시 입력 받기
    - [X] 음료 메뉴만 주문한 경우, IllegalArgumentException 발생
      - [X] "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요." 출력 후 다시 입력 받기

- [X] "12월 n일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!" 출력

- [X] 주문 메뉴 출력 하기
  - [X] "<주문 메뉴>" 출력
  - [X] "메뉴명 n개" 형식으로 출력

- [X] 할인 전 총주문 금액 출력하기
  - [X] "<할인 전 총주문 금액>" 출력
  - [X] 총주문 금액 계산 후 출력

- [X] 이벤트 예외처리하기
  - [X] 총주문 금액 10,000원 이상부터 이벤트 적용
  - [X] 음료만 주문할 경우, 주문할 수 없음
  - [X] 메뉴는 한 번에 최대 20개까지만 주문 가능

- [X] 이벤트 적용하기
  - [X] 크리스마스 디데이 할인 해당 여부 확인 및 적용하기
  - [X] 평일 할인 해당 여부 확인 및 적용하기
  - [X] 주말 할인 해당 여부 확인 및 적용하기
  - [X] 특별 할인 해당 여부 확인 및 적용하기
  - [X] 증정 이벤트 해당 여부 확인 및 적용하기

- [X] 증정 메뉴 출력하기
  - [X] 만약 샴페인 증정이 해당되면 "샴페인 1개" 출력
  - [X] 아니면 "없음" 출력

- [X] 혜택 내역 출력하기
  - [X] 고객에게 적용된 이벤트 내역만 출력
  - [X] 적용된 이벤트가 하나도 없다면 "없음" 출력

- [X] 총혜택 금액 출력하기
  - [X] 총혜택 금액 계산 후 "-n원" 출력

- [X] 할인 후 예상 결제 금액 출력하기
  - [X] 할인 후 예상 결제 금액 계산 후 "n원" 출력

- [X] 이벤트 배지 출력하기
  - [X] 혜택금액에 따라 "별, 트리, 산타" 출력
  - [X] 없으면 "없음" 출력

## 🎯 프로그래밍 요구 사항

- JDK 17 버전에서 실행 가능해야 한다. **JDK 17에서 정상적으로 동작하지 않을 경우 0점 처리한다.**
- 프로그램 실행의 시작점은 `Application`의 `main()`이다.
- `build.gradle` 파일을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- [Java 코드 컨벤션](https://github.com/woowacourse/woowacourse-docs/tree/master/styleguide/java) 가이드를 준수하며 프로그래밍한다.
- 프로그램 종료 시 `System.exit()`를 호출하지 않는다.
- 프로그램 구현이 완료되면 `ApplicationTest`의 모든 테스트가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**
- 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다.
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- JUnit 5와 AssertJ를 이용하여 본인이 정리한 기능 목록이 정상 동작함을 테스트 코드로 확인한다.
- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return 하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- 도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외한다.
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리해 구현한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
    - `Exception`이 아닌 `IllegalArgumentException`, `IllegalStateException` 등과 같은 명확한 유형을 처리한다.

### 추가된 요구 사항

- 아래 있는 `InputView`, `OutputView` 클래스를 참고하여 입출력 클래스를 구현한다.
    - 입력과 출력을 담당하는 클래스를 별도로 구현한다.
    - 해당 클래스의 패키지, 클래스명, 메서드의 반환 타입과 시그니처는 자유롭게 구현할 수 있다.
  ```java
  public class InputView {
      public int readDate() {
          System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
          String input = Console.readLine();    
          // ...
      }
      // ...
  }
  ```
  ```java
  public class OutputView {
      public void printMenu() {
          System.out.println("<주문 메뉴>");
          // ...
      }
      // ...
  }
  ```

### 라이브러리

- `camp.nextstep.edu.missionutils`에서 제공하는 `Console` API를 사용하여 구현해야 한다.
    - 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.

---

## ✏️ 과제 진행 요구 사항

- 미션은 [java-christmas-6](https://github.com/woowacourse-precourse/java-christmas-6) 저장소를 비공개 저장소로 생성해 시작한다.
- **기능을 구현하기 전 `docs/README.md`에 구현할 기능 목록을 정리**해 추가한다.
- **Git의 커밋 단위는 앞 단계에서 `docs/README.md`에 정리한 기능 목록 단위**로 추가한다.
    - [커밋 메시지 컨벤션](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 가이드를 참고해 커밋 메시지를 작성한다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출](https://docs.google.com/document/d/1cmg0VpPkuvdaetxwp4hnyyFC_G-1f2Gr8nIDYIWcKC8/edit?usp=sharing) 문서를 참고한다.
