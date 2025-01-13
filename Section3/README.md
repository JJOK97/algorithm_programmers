## Section 3 - Map
- [[ 강의 ] Map 개요](3-1_Map개요.md)
- [[ 강의 ] Java의 Map](3-2_자바의_Map.md)
- [[ 실습 ] 폰켓몬](src/폰켓몬/README.md)
- [[ 실습 ] 완주하지 못한 선수](src/완주하지못한선수/README.md)
- [[ 실습 ] 위장](src/위장/README.md)

<br>
<hr>
<br>

### Array와 List 문제점
- Array: 빠른 접근이 가능하지만 크기가 고정됨
- List: 크기가 유연하지만 순차 접근으로 인한 느린 탐색

### Map의 등장 배경
- 유연하면서도 빠른 접근이 필요
- 데이터를 적절히 분산하여 저장
- Key를 활용한 효율적인 데이터 관리

### Map의 구조
- Key-Value 쌍으로 데이터 저장
- Hash Function으로 key를 hash code로 변환
- bucket이라 불리는 array에 데이터 저장
- hash collision 발생 시 chaining으로 해결

### Map 구현체 비교

   | 구분                 | sync      | Thread Safety | 특징         |
   |--------------------|-----------|---------------|------------|
   | HashMap            | not sync  | No            | 가장 빠름      |
   | Hashtable          | sync      | Yes           | 병목현상 발생    |
   | ConcurrentHashMap  | sync      | Yes           | 병목현상 최소화   |

<br>
<hr>