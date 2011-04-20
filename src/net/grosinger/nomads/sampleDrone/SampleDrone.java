package net.grosinger.nomads.sampleDrone;

import net.grosinger.nomads.Drone;

public class SampleDrone extends Drone {

	private static final boolean DEBUGGINGALL = true;

	/*
	 * Override the move method. This is your main way of doing anything
	 */
	@Override
	public void move() {
		if (DEBUGGINGALL)
			System.out.println("SampleDrone initiating move...");

		if (DEBUGGINGALL)
			System.out.println("SampleDrone finished move");
	}
}
