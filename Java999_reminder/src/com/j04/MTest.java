package com.j04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MTest {

	public static void main(String[] args) {
		
		Person[] people = new Person[5];
		
		people[0] = new Person("홍길동", 50, 'M');
		people[1] = new Person("신사임당", 40, 'F');
		people[2] = new Person("이순신", 50, 'M');
		people[3] = new Person("김선달", 50, 'M');
		people[4] = new Person("잔다르크", 500, 'F');
		
		// 반목문을 사용하여 전체 출력하는데, 나이가 10인 사람은 이름만 출력하자.
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() == 500) {
				System.out.println(people[i].getName());
			} else {
				System.out.println(people[i]);
			}
			
		}
		
		for (Person p : people) {
			if (p.getAge() == 500) {
				System.out.println(p.getName());
			} else {
				System.out.println(p);
			}
		}
		
		// List<Person> list = Arrays.asList(people);
		List<Person> list = new ArrayList<Person>();
		
		list.addAll(Arrays.asList(people));
		//System.out.println(list);
		
		Set<Person> set = new HashSet<Person>();
		set.addAll(list);
		//System.out.println(list);
		
		Map<String, Person> map = new HashMap<String,Person>();
		
		for (int i = 0; i < people.length; i++) {
			map.put(people[i].getName(), people[i]);
		}
		
		// System.out.println(map);
		
		// map을 반복해서 가지고 와서
		// age가 10인 사람의 key와 value를 각각 출력하는데,
		// key를 출력하고/ value가 가지고 있는 age만 출력하자.
		// 단, iterator와 entry를 사용하자.
		
		Set<Entry<String, Person>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Person>> entryIr = entrySet.iterator();
		
		while (entryIr.hasNext()) {
			Entry<String, Person> entry = entryIr.next();
			
			if (entry.getValue().getAge() == 500) {
				System.out.println(entry.getKey() + " : " + entry.getValue().getAge());
			}
		}
		
	}
	
}
