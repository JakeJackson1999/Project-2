public abstract class MesoInherit {
	String city = MesoStation.getStID();
	 double firstAscii = 0;
	 double secondAscii = 0;
	 double thirdAscii = 0;
	 double fourthAscii = 0;
	 
	 firstAscii = (int)city.subString(0, 1);
	 secondAscii = (int)city.subString(1, 2);
	 thirdAscii = (int)city.subString(2, 3);
	 fourthAscii = (int)city.subString(3, 4);
	 
	//TODO
}