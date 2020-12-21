package com.test05;

public class SamsongTV implements TV {

	private int volume;

	public SamsongTV() {
		System.out.println("Samsong TV 구매");
	}

	/*
	public int getVol() {
		return volume;
	}
	
	public void setVol(int volume) {
		this.volume = volume;
	}
	*/

	@Override
	public int volumeup() {
		volume += 3;
		return volume;
	}

	@Override
	public int volumedown() {
		volume -= 3;
		
		if (volume < 0) {
			volume = 0;
		}
		return volume;
	}

}
