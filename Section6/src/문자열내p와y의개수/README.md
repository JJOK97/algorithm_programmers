# 문자열 내 p와 y의 개수

<br>

## 목차
*[실습 코드](실습.java)*

<br>
<hr>
<br>

## 문제 설명
대문자와 소문자가 섞여있는 문자열 `s`가 주어집니다.  
`s`에 포함된 **'p'의 개수와 'y'의 개수**를 비교하여:
- 개수가 같으면 `true`를 반환.
- 개수가 다르면 `false`를 반환.

**'p', 'y' 모두 하나도 없는 경우**에는 항상 `true`를 반환합니다.  
단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

<br>
<hr>
<br>

## 제한사항
- 문자열 `s`의 길이: **50 이하의 자연수**.
- 문자열 `s`는 **알파벳**으로만 이루어져 있습니다.

<br>
<hr>
<br>

## 입출력 예

| `s`          | `answer` |
|---------------|----------|
| `"pPoooyY"`   | `true`   |
| `"Pyy"`       | `false`  |

<br>
<hr>
<br>

## 입출력 예 설명

### 입출력 예 #1
- 문자열 `"pPoooyY"`에서:
    - `'p'`의 개수: 2개
    - `'y'`의 개수: 2개
- 개수가 같으므로 `true`를 반환합니다.

### 입출력 예 #2
- 문자열 `"Pyy"`에서:
    - `'p'`의 개수: 1개
    - `'y'`의 개수: 2개
- 개수가 다르므로 `false`를 반환합니다.

<br>
<hr>