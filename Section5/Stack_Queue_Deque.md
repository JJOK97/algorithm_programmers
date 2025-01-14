## 출력 원리

```java

public static void main(String[]args){
    
    List<Integer> list = new LinkedList<>();
    
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    
    System.out.println(list);
    // [1, 2, 3, 4, 5]
    
    // 스택 / 큐는 출력시 하나씩 제거됨
    System.out.println(list.remove(0));
    // 1
    System.out.println(list);
    // [2, 3, 4, 5];

    // 스택 큐는 출력시 하나씩 제거됨
    System.out.println(list.remove(0));
    // 2
    System.out.println(list);
    // [3, 4, 5];

    // 스택 큐는 출력시 하나씩 제거됨
    System.out.println(list.remove(0));
    // 3
    System.out.println(list);
    // [4, 5];
    
}

```

<br>

## Queue Docs

|        | Throws exception    | Retruns special value  |
|--------|---------------------|------------------------|
| Insert | `add(e)`            | `offer(e)`             |
| Remove | `remove()`          | `poll()`               |
| Examin | `element()`         | `peek()`               |

<br>

### Queue 활용 코드

```java

public static void main(String[]args){
    
    Queue<Integer> queue = new LinkedList<>();

    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    
    System.out.println(queue);
    // [1, 2, 3, 4, 5]
    
    queue.poll();
    System.out.println(queue);
    // [2, 3, 4, 5]
    
    queue.poll();
    System.out.println(queue);
    // [3, 4, 5]
    
    System.out.println(queue.peek());
    // 3
    
}

```

<br>

## Stack Docs

Stack은 Interface인 Queue와 다르게 클래스이며, Vector를 상속받고 있다.

<br>

### Queue 활용 코드

```java

public static void main(String[]args){
    
    Stack<Integer> stack = new Stack<>();

    // 삽입
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    
    System.out.println(stack);
    // [1, 2, 3, 4, 5]
    
    // 삭제, 출력
    stack.pop();
    System.out.println(stack);
    // [1, 2, 3, 4]
    
    System.out.println(stack.peek());
    // 4
    
}

```

<br>

## Deque Docs

앞 뒤에서 자유롭게 출력할수 있는 Deque, LinkedList로 구현

Summary of Deque methods  

|                 | First Element (Head)          |                       | Last Element (Tail)           |                       |
|-----------------|-------------------------------|-----------------------|--------------------------------|-----------------------|
|                 | **Throws exception**          | **Special value**     | **Throws exception**          | **Special value**     |
| **Insert**      | `addFirst(e)`                 | `offerFirst(e)`       | `addLast(e)`                  | `offerLast(e)`        |
| **Remove**      | `removeFirst()`               | `pollFirst()`         | `removeLast()`                | `pollLast()`          |
| **Examine**     | `getFirst()`                  | `peekFirst()`         | `getLast()`                   | `peekLast()`          |

<br>

### Deque 활용 코드

```java

public static void main(String[]args){
    
    Deque<Integer> deque = new LinkedList<>();

    // 삽입
    deque.offerFirst(1);
    System.out.println(deque);
    // [1]
    
    deque.offerLast(2);
    System.out.println(deque);
    // [1, 2]
    
    deque.offerFirst(3);
    System.out.println(deque);
    // [3, 1, 2]
    
    deque.offerLast(4);
    System.out.println(deque);
    // [3, 1, 2, 4]
    
    // 출력
    deque.pollFirst(); // 3
    System.out.println(deque);
    // [1, 2, 4]
    
    deque.pollLast(); // 4
    System.out.println(deque);
    // [1, 2]
    
}

```

<br>

## 주의할 점
- **Queue** : offer, poll, peek : 들어간 순서대로
- **Stack** : push,  pop,  peek : 들어간 반대로
- **Deque** : offerFirst, offerLast : 양방향

<br>

>
> 데이터를 넣은 후 순서대로 출력을 해야한다면 Stack / Queue
> 
> 

<br>
<hr>