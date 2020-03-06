function checkIt(myForm){
	
	var fehler = false;
	var kunde = myForm.kunde.value;
	
	if (!kunde)fehler = true;
	
	var checked = false;
	for(var index = 0; index < myForm.artikel.length; index++){
		if (myForm.artikel[index].checked) checked = true;
	}
	if (!checked) fehler = true;
	
	if (fehler){
		
	var myMeldeDiv =document.getElementById("meldung");	
		myMeldeDiv.innerHTML = "bestell was!";
		myForm.artikel[0].checked = true;
		return false;
	}else{
		return true;
	}
}
