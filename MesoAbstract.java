import java.util.Arrays;

public abstract class MesoAbstract {
	//create protected string for later char use
	protected String StID;
	
	public MesoAbstract(MesoStation mesostation) {
		StID = mesostation.getStID();
	}
	
	int[] calAverage = new int[3];//TODO	
}

