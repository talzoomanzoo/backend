package com.talzoo.ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator; // 반복자

public class MapTest {
    public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("국어", 90);
		map.put("영어", 85);
		map.put("수학", 95);
		map.put("과학", 100);
		
		System.out.println("총 Entry수: " + map.size());
		System.out.println(map);

		System.out.println("국어점수: " + map.get("국어") + "\n");
		//key를 먼저 가져오고 value 가져오기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) { // .hasNext(): 데이터가 있느냐 ; 갖고 올 데이터가 있으면 true -> while문 실행, 아니면 false -> while 문 빠져나감
			String key = keyIterator.next(); // .next(): 실제 데이터 가져옴
			Integer value = map.get(key);
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		map.remove("국어");
		System.out.println("총 Entry수: " + map.size());
		

        // key value 같이 가지고 있는 entry라는 클래스 동시에 뽑아오기
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // key, value 같이 나옴
        System.out.println(entrySet);



        // Iterator<Map<String, Integer>> entry1 = map.iterator(); // The method iterator() is undefined for the type Map<String,Integer> -> 이래서 set으로 바꿈

		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next(); // entry 가 나옴
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		System.out.println();
		
		map.clear(); // map 데이터 다 날리기
		System.out.println("총 Entry수: " + map.size());
    }   
}
