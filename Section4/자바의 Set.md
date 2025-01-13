### Set Code 분석

list에 값을 넣어보자.
```java

public class Main {
    
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println(list);
        
        // [1, 2, 3, 1, 2, 3]
        
        // 중복 확인하려면?
        if(!list.contains(1)) list.add(1);
        if(!list.contains(1)) list.add(2);
        if(!list.contains(1)) list.add(3);
        
    }
    
}

```

<br>

```java

public class Main {
    
    public static void main(String[] args){
        HashSet<Integer> list = new HashSet<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        
        // 이 과정에서 List의 contains의 동작이 실행됨
        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println(list);
        // [1, 2, 3]
        
    }
    
}

```

<br>

#### HashSet, LinkedHashSet, TreeSet

생성 방법의 차이일뿐 결과는 똑같음!
- HashSet : hash
- LinkedHashSet : LinkedList
- TreeSet : bianrySearchTree

<br>

#### 합집합, 차집합, 교집합

기본 코드
```java

class MyData {
    
    int v;
    
    public MyData(int v){
        this.v = v;
    }
    
    @Override
    public String toString() {
        return "" + v;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == i) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return v == myData.v;
    }
    
    // hash 코드로 변환해주면, 다른 인스턴스도 중복 제거 할 수 있다.
    @Overrid
    public int hashCode(){
        return Objects.hash(v);
    }
    
}

public class Main {

    public static void main(String[] args){
        Set<MyData> list = new HashSet<>();

        list.add(new Mydata(1));
        list.add(new Mydata(2));
        list.add(new Mydata(3));

        list.add(new Mydata(1));
        list.add(new Mydata(2));
        list.add(new Mydata(3));

        System.out.println(list);
        // [1, 2, 3, 2, 3, 1]
        // Set은 순서를 보장하지 않음

    }

}

```

<br>

#### 합, 차, 교

```java

public class Main {

    public static void main(String[] args){
        Set<MyData> setA = new HashSet<>();
        Set<MyData> setB = new HashSet<>();
        
        // A
        setA.add(new Mydata(1));
        setA.add(new Mydata(2));
        setA.add(new Mydata(3));

        // B
        setB.add(new Mydata(2));
        setB.add(new Mydata(3));
        setB.add(new Mydata(4));

        // 합치기
        setA.addAll(setB);
        System.out.println(setA);
        // [1, 2, 3, 4]
        
        // 빼기
        setA.removeAll(setB);
        System.out.println(setA);
        // [1]

        // 교집합
        setA.retainAll(setB);
        System.out.println(setA);
        // [2, 3, 4]
    }

}

```

<br>
<hr>