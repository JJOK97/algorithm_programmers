# 스킬트리

<br>

## 목차
*[실습 코드](실습.java)*

<br>
<hr>
<br>

## 문제 설명
선행 스킬이란 **어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬**을 뜻합니다.

예를 들어, 선행 스킬 순서가 `스파크 → 라이트닝 볼트 → 썬더`일 때:
- **썬더**를 배우려면 **라이트닝 볼트**를 먼저 배워야 하고,
- **라이트닝 볼트**를 배우려면 **스파크**를 먼저 배워야 합니다.

### 규칙
- 선행 스킬 순서에 없는 다른 스킬(예: 힐링)은 순서에 상관없이 배울 수 있습니다.
- 예: `스파크 → 힐링 → 라이트닝 볼트 → 썬더`는 가능한 스킬 트리지만,  
  `썬더 → 스파크`나 `라이트닝 볼트 → 스파크 → 힐링 → 썬더`는 불가능합니다.

**입력값**으로 주어진 스킬 순서와 유저가 만든 스킬 트리 배열을 이용해,  
**가능한 스킬 트리 개수**를 반환하는 `solution` 함수를 작성하세요.

<br>
<hr>
<br>

## 제한 조건
- `skill`: 스킬 순서를 나타내는 문자열 (1 ≤ 길이 ≤ 26, 중복 없음).
- `skill_trees`: 유저가 만든 스킬 트리를 나타내는 문자열 배열 (1 ≤ 길이 ≤ 20).
- 각 스킬 트리의 길이: 2 ≤ 길이 ≤ 26.

<br>
<hr>
<br>

## 입출력 예

| skill  | skill_trees                       | return |
|--------|-----------------------------------|--------|
| `"CBD"` | `["BACDE", "CBADF", "AECB", "BDA"]` | `2`    |

<br>
<hr>
<br>

## 입출력 예 설명

### 예 #1
- `BACDE`: **B** 스킬을 배우기 전에 **C** 스킬을 먼저 배워야 합니다. → **불가능**
- `CBADF`: 올바른 순서로 스킬을 배웠습니다. → **가능**
- `AECB`: 올바른 순서로 스킬을 배웠습니다. → **가능**
- `BDA`: **B** 스킬을 배우기 전에 **C** 스킬을 먼저 배워야 합니다. → **불가능**

따라서, 가능한 스킬 트리는 총 2개입니다.
