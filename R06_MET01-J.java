//Rule 06: Methods (MET)
//MET01-J

//Defective Code:

public static int getAbsAdd(int x, int y) {
  return Math.abs(x) + Math.abs(y);
}
getAbsAdd(Integer.MIN_VALUE, 1);

//Corrected Code
//Rule 06: Methods (MET)
//MET01-J
public static int getAbsAdd(int x, int y){
	if(x == Integer.MIN_VALUE || y == Integer.MIN_VALUE){
		throw new IllegalArgumentException();
	}
	int absX = Math.abs(x);
	int absY = Math.abs(y);
	if (absX > Integer.MAX_VALUE - absY){
		throw new IllegalArgumentException();
	}
	return absX + absY;
}
