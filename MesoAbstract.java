import java.util.Arrays;

public abstract class MesoAbstract {
	protected String StID;
	
	public MesoAbstract(MesoStation mesostation) {
		StID = mesostation.getStID();
	}
	
	/*char[] chars = StID.toCharArray();
	char a = StID.charAt(0);
	char b = StID.charAt(1);
	char c = StID.charAt(2);
	char d = StID.charAt(3);
	
	double firstAscii = (int)a;
	double secondAscii = (int)b;
	double thirdAscii = (int)c;
	double fourthAscii = (int)d;*/
	
	int[] calAverage = new int[3];//TODO	
}

