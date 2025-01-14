# 끝말 잇기

<br>

## 목차
*[실습 코드](실습.java)*  
*[풀이 코드](풀이.java)*

<br>
<hr>
<br>

### 문제 설명
입력되는 단어가 순서대로 배치될 때, **끝말잇기로 끝까지 이어지는지 확인**하세요.

끝말잇기는 다음 조건을 만족해야 합니다:
1. **사용했던 단어는 다시 사용되면 안 됩니다.**
2. **단어의 첫 글자는 앞 단어의 마지막 글자와 같아야 합니다.**  
   (단, 첫 단어의 첫 글자는 확인하지 않습니다.)

---

### 제한사항
1. 단어의 길이는 1 이상 100 이하입니다.
2. 단어는 소문자 알파벳으로만 구성됩니다.
3. 입력은 2개 이상의 단어로 구성됩니다.

---

### 입출력 예

|입력|출력|
|---|---|
|["tank", "kick", "know", "wheel", "land", "dream"]|true|
|["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]|false|
|["apple", "ear", "rabbit", "tiger", "rope"]|true|
|["apple", "elephant", "tiger", "rabbit", "apple"]|false|

---

### 입출력 예 설명

#### 입출력 예 #1
- 입력된 단어들: `["tank", "kick", "know", "wheel", "land", "dream"]`
    - 단어의 연결이 모두 올바르게 이어지고, 중복된 단어가 없으므로 `true`를 반환합니다.

#### 입출력 예 #2
- 입력된 단어들: `["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]`
    - 단어 `tank`가 다시 사용되었으므로 `false`를 반환합니다.

#### 입출력 예 #3
- 입력된 단어들: `["apple", "ear", "rabbit", "tiger", "rope"]`
    - 끝말잇기 규칙과 중복 방지 조건을 모두 만족하므로 `true`를 반환합니다.

#### 입출력 예 #4
- 입력된 단어들: `["apple", "elephant", "tiger", "rabbit", "apple"]`
    - 단어 `apple`이 중복 사용되었으므로 `false`를 반환합니다.

---
