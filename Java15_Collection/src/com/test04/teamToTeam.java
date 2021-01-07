package com.test04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class teamToTeam {

	public static void main(String[] args) {
		
		List<Integer> team = new ArrayList<Integer>();
		
		team.add(1);
		team.add(2);
		team.add(3);
		team.add(4);
		team.add(5);
		Collections.shuffle(team);
		
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < team.size(); i++) {
			result.put(i+1, team.get(i));
		}
		
		for (int i = 0; i < team.size(); i++) {
			System.out.printf("%d -> %d \n", i, result.get(i+1));
		}
	}
}
