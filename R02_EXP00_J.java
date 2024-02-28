//Rule 02: Expressions (EXP)
//XP00-J
//Defective Code:
public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();


//Corrected Code:

//Rule 02: Expressions (EXP)
public void deleteFile(){
	File someFile = new File("someFileName.txt");
	//Do something with someFile
	if (!someFile.delete()){
		//Handle failure to delete the file
	}
}
