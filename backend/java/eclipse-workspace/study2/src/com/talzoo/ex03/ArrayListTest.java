package com.talzoo.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest { // 고정되지 않은 동적 list
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
		
        //추가
		list.add("Java");
		list.add("C++");
		list.add("Python");
		list.add("C#");
		list.add("Objective-C");
		
        //길이
		int size = list.size();
		System.out.println("총 데이터 수: " + size);
		System.out.println();
		
        //인덱싱
		String item = list.get(2);
		System.out.println("인덱스 2번 항목: " + item + "\n");
		
        //하나씩 뽑기
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();

		Iterator<String> listIterator = list.iterator();
		while(listIterator.hasNext()) {
			String element = listIterator.next();
			System.out.println(element);
		}
		
		System.out.println();
		
        //삭제
		list.remove(2);
		list.remove(2);
		list.remove("C++");
		
        //하나씩 뽑기
		for(String s: list) {
			System.out.println(s);
		}
    }
}
