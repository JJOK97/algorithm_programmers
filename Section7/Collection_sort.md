# 기본적인 sort

```java

public static void main(String[] args){
    
    List<Integer> list = new LinkedList<>();
    
    Random r = new Random();
    
    for (int i = 0; i < 20; i++) list.add(r.nextInt(50));
    
    // 오름차순 정렬
    list.sort(Comparator.naturalOrder());
    
    // 내림차순 정렬
    list.sort(Comparator.reverseOrder());
    
    System,out.println(list);
    
}

```

<br>

## 그럼 Comparator가 뭐야!

Comparator는 compare을 구현체로 가지는 functional Interface. ( 람다 활용 가능 )

```java

public static void main(String[] args){
    
    List<Integer> list = new LinkedList<>();
    
    Random r = new Random();
    
    for (int i = 0; i < 20; i++) list.add(r.nextInt(50));
    
    // Comparator 활용한 오름차순 정렬
    list.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2){
            return o1.intValue() - o2.intValue();
        }
    });

    // Comparator 활용한 내림차순 정렬
    list.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2){
            return o2.intValue() - o1.intValue();
        }
    });
    
    // Integer인지 모른다면?
    list.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2){
            return o2.compartTo(o2);
        }
    });
    
    // 람다를 활용하여
    list.sort((o1, o2) -> o2.compareTo(o1));

    System,out.println(list);
    
}

```

<br>

## 커스텀 클래스 활용

```java

class MyData implements Comoparable<MyData> {
    int v;
    
    public MyData(int v){
        this.v = v;
    }
    
    @Override
    public String toString(){
        return String.valueOf(v); // "" + v;
    }
    
    @Override
    public int compareTo(Mydata o){
        return Integer.compare(v, o.v); // v - o.v;
    }
    
}

public static void main(String[] args){
    
    List<MyData> list = new LinkedList<>();
    
    Random r = new Random();
    
    for (int i = 0; i < 20; i++) list.add(new MyData(r.nextInt(50)));
  
    // 커스텀 클래스에서는 natural과 reverse 활용 불가
    //    // 오름차순 정렬
    //    list.sort(Comparator.naturalOrder());
    //    
    //    // 내림차순 정렬
    //    list.sort(Comparator.reverseOrder());
    
    list.sort(new Comparator<MyData>() {
        @Override
        public int compare(MyData o1, MyData o2){
            return o1.v - o2.v;
        }
    });

    // 이게 되려면 Comparable을 implement 해줘야함
    list.sort(new Comparator<MyData>() {
        @Override
        public int compare(MyData o1, MyData o2){
            return o1.compareTo(o2);
        }
    });
    
    // implement 하면 naturalOrder, reverseOrder 가능
    list.sort(Comparator.reverseOrder());
    
    System,out.println(list);
    
}

```

<br>

## Quick Sort 구현

```java

class MyData implements Comoparable<MyData> {
    int v;
    
    public MyData(int v){
        this.v = v;
    }
    
    @Override
    public String toString(){
        return String.valueOf(v);
    }
    
    @Override
    public int compareTo(Mydata o){
        return Integer.compare(v, o.v);
    }
    
}

public static void main(String[] args){
    
    List<MyData> list = new LinkedList<>();
    
    Random r = new Random();
    
    for (int i = 0; i < 20; i++) list.add(new MyData(r.nextInt(50)));
  
    list = quickSort(list);
    
    System,out.println(list);
    
}

static List<MyData> quickSort(List<MyData> list){
    
    if(list.size() <= 1) return list;
    
    MyData pivot = list.remove(0);
    
    List<MyData> lesser = new LinkedList<>();
    List<MyData> greater = new LinkedList<>();
    
    for(Mydata m : list){
        if(pivot.compareTo(m) > 0) lesser.add(m);
        else greater.add(m);
    }
    
    List<MyData> merged = new LinkedList<>();
    merged.addAll(quickSort(lesser));
    merged.add(pivot);
    merged.addAll(quickSort(greater));
    
    return merged;
}

```

<br>

### 왜 종류별로 알고리즘을 학습해야 하나?


1. 다양한 알고리즘을 학습하면서 : 문제풀이의 접근방식을 학습할 수 있다.
2. 문제를 해결하는 알고리즘은 한가지가 아니구나!, 효율성이 달라지는구나!, 절대적인것은 없구나!


<br>
<hr>