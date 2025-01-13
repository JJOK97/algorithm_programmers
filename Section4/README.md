## Section 4 - Set

- [[ 강의 ] Set 개요](집합(Set)_교집합_합집합_차집합.md)
- [[ 실습 ] 로또 번호 검출기](src/로또번호검출기/README.md)
- [[ 실습 ] 끝말 잇기](src/끝말잇기/README.md)
- [[ 실습 ] 같은 숫자는 싫어](src/같은숫자는싫어/README.md)

<br>
<hr>
<br>

### Set 개요
- **중복 불가** : 동일한 요소를 한 번만 저장
- **순서 비보장** : 해싱 기반
  - LinkedHashSet : 삽입 순서 유지
  - TreeSet : 정렬 순서 유지
- 빠른 탐색 : 해시 충돌이 적다면 평균 O(1) 검색

### 사용 예시

```java
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2); // 중복 -> 무시됨
    System.out.println(set); // [1, 2, 3]
```

### 집합 연산
- **합집합** : setA.addAll(setB);
- **차집합** : setA.removeAll(setB);
- **교집합** : setA.retainAll(setB);

### 마무리
- 중복 제거가 자동으로 이뤄짐 -> List보다 편리
- 순서가 필요하면 LinkedHashSet / 정렬이 필요하면 TreeSet
- 합칩합, 차집합, 교집합 구현이 간단

<br>
<hr>