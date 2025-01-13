## Section 2 - Array와 List
- [[ 강의 ] Array와 List 이해하기](2-1_Array와List.md)
- [[ 강의 ] Java List 컬렉션](src/Main.java)
- [[ 실습 ] 최댓값 인덱스 구하기](src/최댓값인덱스구하기/README.md)
- [[ 실습 ] 순열 검사](src/순열검사/README.md)
- [[ 실습 ] 자연수 뒤집어 배열로 만들기](src/자연수뒤집어배열로만들기/README.md)

<br>
<hr>
<br>

### 학습 내용
- Array와 List의 기본 개념과 특징 이해
- Java Collection Framework의 List 인터페이스 활용
- LinkedList, ArrayList, Vector의 차이점과 활용
- List를 활용한 알고리즘 문제 해결

<br>

### 주요 개념
1. **Array의 특징**
    - 여러 데이터를 한꺼번에 다룰 수 있음
    - 메모리상에 연속적으로 저장됨
    - Reference Value로 취급됨 (Object는 아님)
    - 크기가 고정되어 있음 (단점)
    - 미리 공간을 확보해야 함 (단점)
    - 인덱스로 빠른 접근 가능 (장점)


2. **List의 특징**
    - 여러 데이터를 한꺼번에 다룰 수 있음
    - 메모리상에 연속되지 않아도 됨
    - 미리 공간을 확보하지 않아도 됨 (장점)
    - 필요에 따라 크기가 동적으로 조절됨 (장점)
    - 순차적으로 접근해야 해서 검색이 느림 (단점)


3. **List 인터페이스 구현체 특징**
    - LinkedList: 노드 간 연결 구조로 삽입/삭제가 빠름
    - ArrayList: Array 기반으로 인덱스 접근이 빠름
    - Vector: ArrayList와 동일하나 Thread-safe (동기화 지원)

<br>
<hr>