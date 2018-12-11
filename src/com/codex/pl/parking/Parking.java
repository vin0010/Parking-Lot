package com.codex.pl.parking;

import java.util.List;

public class Parking {
	private List<Floor> floors;

	public Parking(List<Floor> floors) {
		this.floors = floors;
	}

	/**
	 * @return the floors
	 */
	public List<Floor> getFloors() {
		return floors;
	}
}
