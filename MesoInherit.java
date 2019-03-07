public class MesoInherit extends MesoAbstract {
	
	//call super
	public MesoInherit(MesoStation mesostation) {
		super(mesostation);
	}
	
	public int[] calAverage() {
		
		//create char array and set individual chars from StID to each index
		char[] chars = StID.toCharArray();
		char a = StID.charAt(0);
		char b = StID.charAt(1);
		char c = StID.charAt(2);
		char d = StID.charAt(3);
		
		//cast each char to the ascii value
		double firstAscii = (int)a;
		double secondAscii = (int)b;
		double thirdAscii = (int)c;
		double fourthAscii = (int)d;
		
		//find average and set floor and ceiling
		double average = (firstAscii + secondAscii + thirdAscii + fourthAscii) / 4;
		int ceiling = (int)Math.ceil(average);
		int floor = (int)Math.floor(average);
		
		//set each to correct array index
		calAverage[0] = ceiling;
		calAverage[1] = floor;
		calAverage[2] = (int)Math.ceil(average);
		
		//return array
		return calAverage;
	}
	
	public char letterAverage() {
		//get the average
		double average = calAverage[0];
		
		//return the letter
		return (char)average;
	}
	
	
	
	//TODO
}