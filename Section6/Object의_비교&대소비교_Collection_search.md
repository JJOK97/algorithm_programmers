# List의 Search

```java

public static void main(String[] args){
    List<Integer> list = new LinkedList<>();
    
    for(int i = 1; i <= 100; i++) list.add(i);
    
    System.out.println(list);
    
    // 기본 제공 search
    int index = list.indexOf(63);
    System.out.println(index); // 62
}

```

<br>

### Custom Class의 Search

```java

class MyData {

    int v;
    
    public MyData(int v){
        this.v = v;
    }
    
    @Override
    public String toString() {
        return "" + b = v;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return v == myData.v;
    }
}

public class Main{
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        
        for(int i = 1; i <= 100; i++) list.add(i);
        
        System.out.println(list);
        
        int index = list.indexOf(new MyData(63));
        // 그냥 실행하면 -1
        // equals를 override하게 되면 62가 나옴
        
        System.out.println(index);
    }
}

```

<br>

### 순차적인값이 아니라 랜덤이라면?

```java

class MyData {

    int v;
    
    public MyData(int v){
        this.v = v;
    }
    
    @Override
    public String toString() {
        return "" + b = v;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return v == myData.v;
    }
}

public class Main{
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        
        Random r = new Random();
        for(int i = 1; i <= 100; i++) list.add(r.nextInt(100));
        
        System.out.println(list);
        
        // 완전 탐색의 메서드, O(n)
        int index = list.indexOf(new MyData(63));
        
        System.out.println(index);
    }
}

```


<br>

### 탐색 시간을 줄여보자 ( binary search )

```java

class MyData implements Comparable<MyData>{

    int v;
    
    public MyData(int v){
        this.v = v;
    }
    
    @Override
    public String toString() {
        return "" + b = v;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return v == myData.v;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
    
    @Override
    public int compareTo(MyData o){
        // 1 == 1? 어떻게 알아낼까?
        // 1 - 1 == 0 ? 같다. : 다르다.   -> return  0
        //        < 0 ? 오른쪽이 크다      -> return  1
        //        > 0 ? 왼쪽이 크다.       -> return -1
        return v - v.o;
    }
    
}

public class Main{
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
        
        Random r = new Random();
        for(int i = 1; i <= 100; i++) list.add(r.nextInt(100));
        
        // Collections.binarySearch(list, new MyData(63));
        // 될까?
        
        // Docs에 따르면 binarySearch는 (List< extends Comparable<? super T>> list, T key)를
        // 매개변수로 가진다.
        
        // Comparable은 인터페이스이므로 사용하려면 커스텀 class에 compareTo라는 메서드와 함께 implement해야 한다
        
        int index = Collections.binarySearch(list, new MyData(63));

        System.out.println(index);
        // 그냥 하게 되면 이상한 값이 나옴..
        // 그래서 정렬이 필요함
        
        Arrays.sort(list);

        index = Collections.binarySearch(list, new MyData(63));
        
        System.out.println(index);
        // 정상적인 index
    }
}

```

<br>

### 단원 정리

**Brute force search**는 indexOf, contains, remove 같은 곳에서 이미 구현되어 있다. 

그러나 해당 메서드들을 활용하려면 list에 제공되는 객체는 **equals**를 제공해주어야 한다.

<br>

또한 **Collections**의 **binarySearch**를 활용하면 이진탐색을 통해 더 효율적으로 탐색가능하다.

binarySearch를 사용하려면, **Comparable**를 implements 해주어야 하며, list는 **정렬**이 되어있어야 한다.

<br>
<hr>