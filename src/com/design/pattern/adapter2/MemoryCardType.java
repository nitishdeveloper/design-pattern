package com.design.pattern.adapter2;

import java.util.ArrayList;
import java.util.List;

public class MemoryCardType {
		
	List<MemoryCardTarget> memoryCardTargets = new ArrayList<MemoryCardTarget>();
	
	public MemoryCardType() {
		super();
		
	}

	public void insert(MemoryCardTarget memoryCard) {
		memoryCardTargets.add(memoryCard);
	}
	
	public void execute() {
		if(memoryCardTargets.isEmpty()) {
			System.out.println("empty card reader....!!!");
		}
		else {
			memoryCardTargets.stream().forEach(card->card.insertCard());
		}
	}
}
