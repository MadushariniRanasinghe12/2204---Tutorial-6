object Q1 extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val shift = (scala.io.StdIn.readLine("Shift By = ").toInt + alphabet.size) % alphabet.size

	val inputText = scala.io.StdIn.readLine("Input the string = ")

	//Encryption
	val Text_1 = inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});

	//Decryption
	val Text_2 = inputText.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)

		if ((x - shift)<0){
			alphabet((x - shift)+26)
		}
		else{
			alphabet((x - shift) % alphabet.size)
			} 
	});

	println("Encrypted string = "+Text_1);
	println("Decrypted string = "+Text_2);
}
