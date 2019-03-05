public class MesoInherit extends MesoAbstract {

	public int[] calAverage() {
		double average = (firstAscii + secondAscii + thirdAscii + fourthAscii) / 4;
		int ceiling = (int)Math.ceil(average);
		int floor = (int)Math.floor(average);
		
		calAverage[0] = ceiling;
		calAverage[1] = floor;
		calAverage[2] = (int)average;
		
		return calAverage;
	}
	
	public char letterAverage() {
		double average = (firstAscii + secondAscii + thirdAscii + fourthAscii) / 4;
		double fraction = average - Math.floor(average);
		int asciiNumber = 0;
		char asciiLetter;
		
		if (fraction >= 0.5) {
			asciiNumber = (int)Math.ceil(average);
		}
		else {
			asciiNumber = (int)Math.floor(average);
		}
		
		asciiLetter = (char)asciiNumber;
		return asciiLetter;
	}
	
	
	
	//TODO
}