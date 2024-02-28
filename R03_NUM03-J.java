//Rule 03: Numeric Types and Operations (NUM)
//NUM03-J
//Defective Code:

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}

//Corrected Code
//Rule 03: Numeric Types and Operations (NUM)
//NUM03-J
public static long getInteger(DataInputStream is) throws IOException {
	return is.readInt() & 0xFFFFFFFFL; //Mask with 32 one-bits
}
