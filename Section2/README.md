# Section 2 - Array와 List

<br>

## 목차
- [[ 강의 ] Array와 List 이해하기](2-1_Array와List.md)
- [[ 강의 ] Java List 컬렉션](src/Main.java)
- [[ 실습 ] 최댓값 인덱스 구하기](src/최댓값인덱스구하기/README.md)
- [[ 실습 ] 순열 검사](src/순열검사/README.md)
- [[ 실습 ] 자연수 뒤집어 배열로 만들기](src/자연수뒤집어배열로만들기/README.md)

<br>
<hr>
<br>

## 학습 후기

이번 섹션을 통해 Array와 List의 내부 구조와 동작 방식을 자세히 이해하게 되었습니다.  

ArrayList는 연속된 메모리를 사용해 검색이 빠르고, LinkedList는 데이터를 흩어서 저장하되
추가/삭제가 자유롭다같은 특징을 알게 되었습니다.

<br>
<hr>
<br>

## 실습을 통해 배운 주요 개념

**1. 최댓값 인덱스 구하기**

#### Stream API 활용법
```java
- Arrays.stream(): 배열을 스트림으로 변환해 최댓값을 쉽게 찾기 O(n)
  Arrays.stream(arr).max().getAsInt();

- IntStream.range(): 특정 범위의 스트림을 생성하고 필터링 O(n)
  IntStream.range(0, arr.length).filter(i -> arr[i] == max).toArray();
```

#### List to Array 변환
```java
- stream().mapToInt(): 컬렉션을 기본형 배열로 변환 O(n)
  list.stream().mapToInt(Integer::intValue).toArray();

  // 람다식으로도 가능
  list.stream().mapToInt(i -> i).toArray();
```

<br>

**2. 순열 검사**

#### Arrays 유틸리티
```java
- Arrays.equals(): 두 배열의 내용 비교
  return Arrays.equals(answer, arr);
```

#### 시간복잡도 최적화
```java
- Arrays.sort() 활용: O(nlogn)으로 해결
- 이중 for문 지양: O(n²) 성능 저하 주의
```

<br>

**3. 자연수 뒤집기**

#### 수학적 구현
```java
- 나머지 연산으로 자릿수 추출
  list.add((int)(n % 10));
  n /= 10;
```

#### 자료구조 선택
```java
- ArrayList 대신 LinkedList: 순차적 추가 시 더 효율적
- Stream 변환 시 메소드 레퍼런스 활용
```

<br>
<hr>