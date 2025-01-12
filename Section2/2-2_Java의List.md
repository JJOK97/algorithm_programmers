### List Interface의 종류

list형은 아래의 type으로 표현 가능 ( 다형성 )
- LinkedList : 더 빠르게 추가 삭제가 필요 할 때
- ArrayList : 더 빠르게 index를 찾아야 할 때
- Vector : 더 빠르게 index를 찾으면서, Thread-safe 해야 할 때

```java

public class Main {
    public static void main(String[] args){
        List<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        
        method1(list);
    }
    
    // Vector -> 상위 인터페이스인 List로 메서드 전달 가능, but LinkedList, ArrayList ( 같은 type만 )
    static void method1(List<Integer> list){
        System.out.println(list.size());
    }
}
```

<br>
<hr>
<br>

### LinkedList

```java

// LinkedList Class는 java.util 패키지에 포함되어 있음
import java.util.LinkedList;
        
public class Main  {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3); // 여기까지 출력 [1, 2, 3]
        
        // 중간 삽입
        list.add(1, 5); // [1, 5, 2, 3]
        
        // 삭제
        list.remove(2); // [1, 5, 3]
        
        // 원하는 index 출력
        System.out.println(list.get(2));
        
        // value(Object type)가 list에 포함되어 있는지? true/false
        System.out.println(list.contains(5));
        // primitive type은 자동으로 Intger.valueof()가 파싱이됨

        // value(Object type)가 몇 번째 index에 있는지? 요소가 없으면 return -1
        System.out.println(list.indexOf(5));
        // contains는 indexOf를 활용해 구현되어 있음
        
        // list가 비어있는지?
        System.out.println(list.isEmpty());
        
        // list의 크기
        System.out.println(list.size());
        
    }
}
```

<br>
<hr>
<br>

### ArrayList

ArrayList는 Resizable-array를 구현하고 있다.

기존의 Array와 같이 연속된 메모리를 가지고 있다가 list에 변경이 생기면 새로운 Array를 만들고 기존 데이터 + 신규 데이터를 이동 시킨다.

이러한 특징으로 ArrayList는 LinkedList보다 index를 찾는데 유리하다.

<br>
<hr>
<br>

### Vector

Vector는 ArrayList와 같이 연속된 메모리에 동적으로 크기 확장이 가능하다.

그러나 모든 메소드가 synchronized가 되어 있어서 Thread-safe하다는 차이가 있다.

<br>
<hr>
<br>

### ArrayList vs Vector 

커피숍 카운터를 예시로 들면,

#### ArrayList = 일반 카운터
- 여러 직원이 동시에 주문을 받을 수 있음
- 더 빠르지만, 주문이 섞일 수 있음
- 동기화가 되어있지않음

#### Vector = 1인용 카운터
- 한 번에 한 직원만 주문을 받을 수 있음
- 더 느리지만, 주문이 섞이지 않음
- 동기화가 되어있음

#### 정리하자면
- Vector는 한번에 하나의 스레드만 접근 가능 ( 안전하지만 느림 )
- ArrayList는 여러 스레드가 동시에 접근 가능 (빠르지만 데이터가 꼬일 수 있음)

```java
// Vector - 안전하지만 느림
Vector<String> vector = new Vector<>();
// add() 메소드가 synchronized로 선언되어 있음
public synchronized boolean add(E e) {
    ...
}

// ArrayList - 빠르지만 동시접근시 위험
ArrayList<String> arrayList = new ArrayList<>();
// add() 메소드가 일반 메소드
public boolean add(E e) {
    ...
}
```

그래서 보통
멀티 스레드 환경 -> Vector 사용 (또는 Collections.synchronizedList())
단일 스레드 환경 -> ArrayList 사용 ( 더 빠름 )

