# Section 3 - Map

<br>

## 목차
*[[ 강의 ] Map의 이해](3-1_Map의이해.md)*  
*[[ 강의 ] Java Map 컬렉션](src/Main.java)*  
*[[ 실습 ] 폰켓몬](src/폰켓몬/README.md)*  
*[[ 실습 ] 완주하지 못한 선수](src/완주하지못한선수/README.md)*  
*[[ 실습 ] 위장](src/위장/README.md)*  

<br>
<hr>
<br>

## 학습 후기

Array와 List의 한계점에서 출발해 Map의 필요성과 구조를 배웠습니다.
특히 해시 충돌과 체이닝까지 내부 동작 방식을 시각적으로 이해하게 되어,
추상적으로만 알고 있던 개념들이 명확해졌습니다.

또한 Java Docs를 통해 다양한 Map 메서드들의 활용법을 배웠는데,
실제 동작 방식과 함께 보니 문서 읽는 것이 한결 수월해졌습니다.

<br>
<hr>
<br>

## 실습을 통해 배운 주요 개념

**1. Map의 핵심 메서드**

#### 데이터 삽입과 조회
```java
// key-value 추가
map.put(key, value)

// key로 value 조회, 없으면 defaultValue 반환
map.getOrDefault(key, defaultValue)

// key 목록 조회
map.keySet()
```

#### Iterator 활용
```java
var iter = map.values().iterator();

while(iter.hasNext()) {
    answer *= iter.next() + 1;
}
```

<br>

**2. List vs Map 성능 비교**

#### List 방식 ( 폰켓몬 )
```java
// contains 사용 시 매번 탐색 필요: O(n²)
for(int n : nums){
    if(!list.contains(n)) list.add(n);
}
```

#### Map 방식
```java
// 조회 시 O(1) 성능
map.put(num, map.getOrDefault(num, 0) + 1);
```

<br>

**3. 시간복잡도 최적화**

#### 정렬 방식 ( 완주하지 못한 선수 )
```java
// O(nlogn) 소요
Arrays.sort(participant);
Arrays.sort(completion);
```

#### Map 활용 방식
```java
// O(n) 으로 해결 가능
for(String p : participant)
map.put(p, map.getOrDefault(p, 0) + 1);

for(String c : completion)
map.put(c, map.get(c) - 1);
```

<br>
<hr>