package com.design.pattern.adapter2;

public class Application {

	public static void main(String[] args) {
		MemoryCardType memoryCardType = new MemoryCardType();
		memoryCardType.insert(new CameraMemoryCard());
		memoryCardType.insert(new PhoneMemoryCard());
		memoryCardType.insert(new MemoryCardAdapter(new AcceptedByLeptop()));
		memoryCardType.execute();
	}

}
