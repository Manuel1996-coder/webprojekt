function inputCheck(myForm){
	if (myForm.buttonClicked == "login") return true;
	var myUserid = myForm.matrkid.value;
	var myUseridMsg = checkUserid(myUserid);
//	document.getElementById("useridMsgFeld").innerText = myUseridMsg;
	var myUsername = myForm.username.value;
	var myUsernameMsg = checkUsername(myUsername);
	document.getElementById("usernameMsgFeld").innerText = myUsernameMsg;
	var myPassword = myForm.password.value;
	var myPasswordMsg = checkPassword(myPassword);
	document.getElementById("passwordMsgFeld").innerText = myPasswordMsg;
	var myEmail = myForm.email.value;
	var myEmailMsg = checkEmail(myEmail);
	document.getElementById("emailMsgFeld").innerText = myEmailMsg;

	var fehler = myUseridMsg + myUsernameMsg +
						myPasswordMsg + myEmailMsg;
	if (fehler){
//		alert(myUseridMsg + "\n" +
//			myPasswordMsg + "\n" +
//			myUsernameMsg + "\n" +
//			myEmailMsg
//		);
		return false;
	}else return true;
}
function checkEmail(textInput){
	if (textInput == ""){
		return "Die E-Mail-Adresse darf nicht leer sein";
	}else if(textInput.indexOf("@") == -1){
		return "Die E-Mail muss ein @ enthalten";
	}else{
		return "";	
	}
}
function checkPassword(textInput){
	var myMsg = "";
	if (textInput == ""){
		myMsg = "Das Passwort darf nicht leer sein";
	}else if(textInput.length < 6){
		myMsg = "Das Passwort muss mindestens 6 Zeichen lang sein";
	}else{
		myMsg = "";
	}
	document.getElementById("passwordMsgFeld").innerText = myMsg;
	return myMsg;
}
function checkUsername(textInput){
	var myMsg = "";
	if (textInput == ""){
		myMsg = "Der Username darf nicht leer sein";
	}else{
		myMsg = "";
	}
	document.getElementById("usernameMsgFeld").innerText = myMsg;
	return myMsg;
}
function checkUserid(textInput){
	var myMsg = "";
	if (textInput == ""){
		myMsg = "Die Matrikelnummer darf nicht leer sein";
	}else if(textInput.length < 6){
		myMsg = "Die Matrikelnummer muss mindestens 6 Zeichen lang sein";

		
	}else{
		myMsg = "";
	}
	document.getElementById("useridMsgFeld").innerText = myMsg;
	return myMsg;
}
function setButton(buttonValue){
	document.getElementById("regForm").buttonClicked = buttonValue;
}
function switchIt(){
	//alert("switch geklickt");
	//html-Bildelement (img) in die Hand nehmen
	// img-src verändern
	var myImg = document.images[0];
//	Alternative	
//	var myImg1 = document.getElementById("myImage");
//	alert(myImg1.src);
	var mySrc = myImg.src; //Quelle des Bildes: Pfad/File
	var lastSlashPos = mySrc.lastIndexOf("/");
	var myPath = mySrc.substring(0, lastSlashPos + 1); // incl. '/'
	var myFile = mySrc.substring(lastSlashPos + 1); //bis zum Ende
	//alert(myFile);
	var newFile = "";
	var newClass = "";
	if (myFile == "DonaldDuck.jpg"){
		newFile = "MickyMaus.jpg";
		newClass = "micky";
	}else{
		newFile = "DonaldDuck.jpg";
		newClass = "donald";
	}
	myImg.src = myPath + newFile;
	
	var openSpan = "<span class='" + newClass + "'>";
	var closeSpan = "</span>";
	var logText = "geswitched from " + myFile + " to " + newFile + "<br>\n";
	var myLogDiv = document.getElementById("logArea");
	var myLogContent = myLogDiv.innerHTML;
	myLogContent = openSpan + logText + closeSpan + myLogContent;
	myLogDiv.innerHTML = myLogContent; 
	
	
	//alert(myLogContent);
	
	
	
	
	

}

function hello(ausgabe){
	
	alert(ausgabe);
	
}