### 자바에서의 Map

자바에서는 map을 Hashtable로 표현 할 수 있다.

```java

public class Main {
    public static void main(String[] args){
        Hashtable<String, Integer> map = new Hashtable<>();
        
        // map에 데이터 집어넣기
        map.put("A", 1);
        mpa.put("B", 2);
        
        // map 전체 출력
        System.out.println(map); // {A = 1, B = 2}
        
        // map의 value 출력
        System.out.println(map.get("A")); // 1

        /*
            주요 메서드

            삽입
                - put(K key, V value) : K, V 삽입
                - putAll(Map<? extend K, ? extends V> t) : t의 데이터 전체 삽입
                - putIfAbsent(K key, V value) : key-value가 존재하지 않으면 삽입, 존재하면 무시
            
            선택
                - get(key) : Value 선택
                - getOrDefault(key, defaultValue) : key 선택, key가 없으면 defalutValue 삽입
                - keySet() : map의 key들만 뽑아냄, Set으로 return.
                
                keySet() 출력
                1. 전체 키를 한 번에 보고 싶을때
                Set<String> keys = map.keySet();
                System.out.println(keys); // [A, B, C]
                
                2. 향상된 for문을 사용
                for(String key : map.keySet())
                    System.out.println(map.get(key));
                    
                3. Iterator 활용
                Iterator<String> iter = map.keySet().iterator();
                while(iter.hasNext()){
                    if(condition){
                        iter.remove();
                    }
                }
                
                - values() : map의 value들만 뽑아냄, Colletion으로 return -> 정렬, 탐색 등
                
                출력
                1. print 활용
                System.out.println(map.values()); // return : [1, 2]
                
                2. Iterator 활용
                // Iterator<Integer> 대신 var 사용 가능
                Iterator<Integer> iter = map.values().iterator();
                
                while(iter.hasNext()) {
                    System.out.println(iter.next());
                }
                
                3. Collection 활용
                // Collection으로 받기
                CollectionMInteger> values = map.values();
                
                // 3-1 for-each 루프 사용
                values.forEach(System.out::println);
                
                for(Integer value : values)
                    System.out.println(value);
                            
                // 3-2 stream 사용
                values.stream().forEach(System.out::println);
                
                values.stream()
                    .filter(v -> v > 10)
                    .map(v -> v * 2)
                    .forEach(System.out::println);
                
                // 3-3 List로 변환
                List<Integer> valueList = new ArrayList<>(values);
                System.out.println(valueList);
                
            수정 
                - replace(K key, V value) : 덮어쓰기, put이랑 동일
                - replace(K key, V oldValue, V newValue) : oldValue와 동일 할 때 newValue로 변경, boolean으로 return.
                
            삭제
                - remove(Object key) : 해당하는 key의 value를 제거
                - remove(Object key, Object value) : key-value를 둘 다 확인해서 같으면 제거, boolean으로 return.
                
         */
        
    }
}

```

<br>

#### HashTable과 HashMap을 Implement하고있는 Interface, Map

그렇기에 Map으로 표현이 가능하며, 이게 일반적임.

```java

public static void main(String[] args) {
    Map<String, Integer> map = new Hashtable<>();
    
    // 또한 Map은 HashMap도 implement 하고있음
    Map<String, Integer> map2 = new HashMap<>();
    
    map.put("A", 1);
    map.put("B", 2);
    
    method1(map);
    
}

static void method1(Map<String, Integer> map){
    System.out.println(map); // [A = 1, B = 2];
}

```

<br>

#### Hashtable vs HashMap

| 구분 | Synchronization | Thread Safety | 성능 특징                        |
|---|---|---|------------------------------|
| HashMap | Not Synchronized | No | 빠름                           |
| Hashtable | Synchronized | Yes | 병목현상 발생                      |
| ConcurrentHashMap | Synchronized | Yes | High Concurrent,<br>병목현상 최소화 |

<br>
<hr>