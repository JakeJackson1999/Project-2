import java.util.Arrays;

public abstract class MesoAbstract {
	//create protected string for later char use
	protected String StID;
	
	//set StID to the given StID from Main.java
	public MesoAbstract(MesoStation mesostation) {
		StID = mesostation.getStID();
	}
	
	//created array for use in MesoInherit
	int[] calAverage = new int[3];//TODO	
}

