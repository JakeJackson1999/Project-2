public abstract class MesoAbstract 
{
	private MesoStation StID;
	
	public MesoAbstract(MesoStation StID) {
		this.StID = StID;
	}
	
	double firstAscii = 0;
	double secondAscii = 0;
	double thirdAscii = 0;
	double fourthAscii = 0;
	 
	firstAscii = (int)StID.subString(0, 1);
	secondAscii = (int)StID.subString(1, 2);
	thirdAscii = (int)StID.subString(2, 3);
	fourthAscii = (int)StID.subString(3, 4);
	
	//TODO	
}
