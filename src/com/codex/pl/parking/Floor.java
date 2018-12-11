package com.codex.pl.parking;

import java.util.List;

public class Floor {
	private List<Integer> availableSlots;

	public Floor(List<Integer> availableSlots) {
		this.availableSlots = availableSlots;
	}

	public List<Integer> getAvailableSlots() {
		return availableSlots;
	}
}
