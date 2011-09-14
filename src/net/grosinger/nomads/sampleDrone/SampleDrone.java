package net.grosinger.nomads.sampleDrone;

import net.grosinger.nomads.Drone;
import net.grosinger.nomads.DroneListItem.EnumMove;
import net.grosinger.nomads.DroneTools;
import net.grosinger.nomads.NeighborDrone;
import net.grosinger.nomads.Upgrade;

public class SampleDrone implements Drone {

	// You can change this if you want
	private static final boolean DEBUGGINGALL = true;

	// Do not change these
	private String name;
	private String UID;

	// Define any variables that you need
	private DroneTools tools;

	// Leave these methods alone, they are required //

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String newName) {
		name = newName;
	}

	@Override
	public void setUID(String newUID) {
		UID = newUID;
	}

	@Override
	public String getUID() {
		return UID;
	}

	@Override
	public void setDroneTools(DroneTools newTools) {
		tools = newTools;
	}

	// Edit from here down //

	@Override
	public EnumMove move() {
		if (DEBUGGINGALL) {
			System.out.println("SampleDrone initiating move...");
			System.out.println("Current X = " + tools.getX());
			System.out.println("Current Y = " + tools.getY());
		}

		tools.checkRadar();

		if (tools.canMoveEast())
			return EnumMove.East;
		else if (tools.canMoveSouth())
			return EnumMove.South;
		else if (tools.canMoveWest())
			return EnumMove.West;
		else if (tools.canMoveNorth())
			return EnumMove.North;
		else
			return EnumMove.NoMove;
	}

	@Override
	public NeighborDrone steal() {
		return null;
	}

	@Override
	public NeighborDrone attack() {
		return null;
	}
}
