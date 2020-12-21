package com.test05;

public class IgTV implements TV {

	private int volume;
	
	public IgTV() {
		System.out.println("ig tv 구매");
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
		volume += 1;
		return volume;
	}

	@Override
	public int volumedown() {
		volume -= 1;
		
		if (volume < 0) {
			volume = 0;
		}
		return volume;
	}

}
