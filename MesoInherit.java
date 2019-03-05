public class MesoInherit extends MesoAbstract {
	
	public MesoInherit(MesoStation mesostation) {
		super(mesostation);
	}
	
	public int[] calAverage() {
		
		char[] chars = StID.toCharArray();
		char a = StID.charAt(0);
		char b = StID.charAt(1);
		char c = StID.charAt(2);
		char d = StID.charAt(3);
		
		double firstAscii = (int)a;
		double secondAscii = (int)b;
		double thirdAscii = (int)c;
		double fourthAscii = (int)d;
		
		double average = (firstAscii + secondAscii + thirdAscii + fourthAscii) / 4;
		int ceiling = (int)Math.ceil(average);
		int floor = (int)Math.floor(average);
		
		calAverage[0] = ceiling;
		calAverage[1] = floor;
		calAverage[2] = (int)Math.ceil(average);
		
		return calAverage;
	}
	
	public char letterAverage() {
		double average = calAverage[0];
		
		
		return (char)average;
	}
	
	
	
	//TODO
}