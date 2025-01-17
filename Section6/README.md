## Section 6 - Linear Search ( 선형 탐색 )

<br>

## 목차
*[[ 강의 ] 선형 탐색](선형탐색.md)*  
*[[ 강의 ] Object의 비교 & 대소비교, Collection.search](Object의_비교&대소비교_Collection_search.md)*  
*[[ 실습 ] 전화번호 목록](src/전화번호목록/README.md)*  
*[[ 실습 ] 문자열 내 p와 y의 개수](src/문자열내p와y의개수/README.md)*  
*[[ 실습 ] 스킬 트리](src/스킬트리/README.md)*  

<br>
<hr>
<br>

## 학습 후기

이번 섹션에서는 탐색 관련 코드를 보다 효율적으로 작성하는 방법을 배웠습니다.  
이전에는 어떤 탐색 문제든 모든 로직을 직접 구현했었는데, 자바에서 제공하는 탐색 기능과 메서드를 활용하면 더 간결하고 명확하게 코드를 작성할 수 있다는 점을 깨달았습니다.

<br>
<hr>
<br>

## 실습을 통해 얻게 된 것

### String의 메서드들

#### 1. 문자열 탐색 및 조회

1. `charAt(int index)`  
   문자열에서 특정 인덱스의 문자를 반환합니다.
   ```java
    String s = "hello";
    char ch = s.charAt(1); // 'e'
    ```
   
<br>

2. `indexOf(String str)` / `indexOf(int ch)`  
   특정 문자 또는 문자열의 첫 번째 위치를 반환합니다. 없으면 `-1`을 반환합니다.
    ```java
    String s = "hello";
    int index = s.indexOf('e'); // 1
    ```

<br>

3. `lastIndexOf(String str)`  
   특정 문자나 문자열의 마지막 위치를 반환합니다.
    ```java
   String s = "hello";
   int index = s.lastIndexOf('l'); // 3
    ```

<br>

4. `contains(CharSequence s)`  
    문자열에 특정 문자열이 포함되어 있는지 확인합니다.
    String s = "hello";
    boolean contains = s.contains("ell"); // true

<br>

5. `startsWith(String prefix)` / `endsWith(String suffix)`  
   문자열이 특정 접두사 또는 접미사로 시작하거나 끝나는지 확인합니다.
    String s = "hello";
    boolean starts = s.startsWith("he"); // true
    boolean ends = s.endsWith("lo"); // true

<br>
<hr>
<br>

#### 2. 문자열 변환 및 조작

1. `toLowerCase()` / `toUpperCase()`  
   문자열을 모두 소문자 또는 대문자로 변환합니다.
    ```java
    String s = "Hello";
    String lower = s.toLowerCase(); // "hello"
    String upper = s.toUpperCase(); // "HELLO"
    ```
<br>

2. `trim()`  
    문자열 양 끝의 공백을 제거합니다.
    ```java
    String s = "  hello  ";
    String trimmed = s.trim(); // "hello"
   ```

<br>

3. `replace(char oldChar, char newChar)` / `replace(CharSequence target, CharSequence replacement)`  
    특정 문자나 문자열을 다른 문자나 문자열로 대체합니다.
    ```java
    String s = "hello";
    String replaced = s.replace('l', 'x'); // "hexxo"
    ```

<br>

4. `replaceAll(String regex, String replacement)` / `replaceFirst(String regex, String replacement)`  
    정규 표현식을 사용해 문자열을 대체합니다.
    ```java
    String s = "hello";
    String replaced = s.replaceAll("[aeiou]", "*"); // "h*ll*"
    ```

<br>

5. `substring(int beginIndex, int endIndex)`  
    문자열의 특정 범위를 추출합니다.
    ```java
    String s = "hello";
    String sub = s.substring(1, 4); // "ell"
    ```

<br>

6. `split(String regex)`  
    문자열을 특정 구분자로 분리하여 배열로 반환합니다.
    ```java
    String s = "a,b,c";
    String[] parts = s.split(","); // ["a", "b", "c"]
    ```

<br>
<hr>
<br>


#### 3. 문자열 길이 및 비교

1. `length()`  
    문자열의 길이를 반환합니다.
    ```java
    String s = "hello";
    int len = s.length(); // 5
    ```

<br>

2. `isEmpty()` / `isBlank()`  
    문자열이 비어 있는지(`isEmpty`) 또는 공백만 포함하는지(`isBlank`) 확인합니다.
    ```java
    String s = "";
    boolean empty = s.isEmpty(); // true
    
    String t = "   ";
    boolean blank = t.isBlank(); // true (Java 11 이상)
    ```

<br>

3. `equals(Object another)` / `equalsIgnoreCase(String another)`  
    문자열이 같은지 비교합니다. 대소문자 구분 없이 비교하려면 `equalsIgnoreCase`를 사용합니다.
    ```java
    String s1 = "hello";
    String s2 = "Hello";
    boolean equals = s1.equals(s2); // false
    boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2); // true
    ```
   
<br>
<hr>
<br>

#### 4. 문자열 정렬 및 추가 기능

1. `join(CharSequence delimiter, CharSequence... elements)`  
    여러 문자열을 특정 구분자로 연결합니다.
    ```java
    String result = String.join("-", "a", "b", "c"); // "a-b-c"
    ```

<br>

2. `format(String format, Object... args)`  
    문자열을 특정 형식으로 포맷팅합니다.
    ```java
    String s = String.format("My name is %s and I am %d years old.", "John", 25);
    // "My name is John and I am 25 years old."
    ```
    
<br>

3. `repeat(int count)`  
    문자열을 지정된 횟수만큼 반복합니다. (Java 11 이상)
    ```java
    String s = "hello";
    String repeated = s.repeat(3); // "hellohellohello"
    ```
   
<br>

4. `compareTo(String anotherString)`  
    두 문자열을 사전순으로 비교합니다.
    ```java
    String s1 = "apple";
    String s2 = "banana";
    int result = s1.compareTo(s2); // 음수 (-1)
    ```

<br>

5. `valueOf(Object obj)`  
    객체를 문자열로 변환합니다.
    ```java
    int num = 10;
    String s = String.valueOf(num); // "10"
    ```

<br>
<hr>
<br>

### Stream API를 활용한 탐색과 필터링

#### Stream 예제
```java
import java.util.Arrays;

public class StreamExample {
public static void main(String[] args) {
String skill = "CBD";
String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        int answer = Arrays.stream(skill_trees)
                .map(s -> s.replaceAll("[^" + skill + "]", "")) // skill에 포함되지 않은 문자 제거
                .filter(skill::startsWith)                     // skill 순서를 확인
                .count();                                      // 조건을 만족하는 개수 계산

        System.out.println(answer); // 2
    }
}
```

<br>
<hr>
<br>

## 실습을 통해 느낀 점

1. **간결한 탐색 로직 구현**
    - `indexOf`, `startsWith` 같은 메서드를 활용하니 불필요한 반복문을 줄일 수 있었습니다.
    - Stream API를 사용해 조건을 필터링하고 처리하는 방식이 특히 인상 깊었습니다.

<br>

2. **효율적인 문자열 처리**
    - 문자열에서 특정 문자나 패턴을 손쉽게 대체하거나 제거하는 방법을 배웠습니다.  
    정규 표현식을 사용한 `replaceAll` 메서드는 문자열을 다룰 때 매우 유용했습니다.

<br>

3. **코드 가독성 개선**
    - 이전에는 복잡한 반복문과 조건문으로 구성된 코드를 작성했다면, 이번 학습을 통해 간결하고 읽기 쉬운 코드를 작성하는 데 집중할 수 있었습니다.

<br>

앞으로도 탐색 및 문자열 처리에 필요한 기능들을 익히고, 적재적소에 활용하며 효율적인 코드 작성을 목표로 해야겠습니다.



<br>
<hr>