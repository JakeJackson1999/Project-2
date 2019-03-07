import java.util.Arrays;

public abstract class MesoAbstract {
	protected String StID;
	
	public MesoAbstract(MesoStation mesostation) {
		StID = mesostation.getStID();
	}
	
	int[] calAverage = new int[3];//TODO	
}

