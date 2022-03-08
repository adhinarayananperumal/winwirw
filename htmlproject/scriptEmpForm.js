	console.log("Outside script");
	alert("alert Outside script");

function validateEmpForm(){

	console.log("Inside script");

	alert("alert script.....");

	let formValidStatus=true;

	let name = document.forms["myForm"]["fname"].value;
	let age = document.forms["myForm"]["age"].value;


	if (name == "") {
    		alert("Name must be filled out");
		formValidStatus=false;
  	}

	if (age == "") {
    		alert("Age must be filled out");
		formValidStatus=false;
  	}

	

      if(!document.querySelector('input[name="gender"]:checked') )
	{
		alert ( "Choose gender!");
		formValidStatus=false;
	}

       let education = document.forms["myForm"]["education"].value;
        if (education == "") {
            //If the "Please Select" option is selected display error.
            alert("Please select an education!");
		formValidStatus=false;
        }

	if(!formValidStatus){
		document.getElementById("empfv").innerHTML="Employee Form Invalid";
	}
      
	return formValidStatus;

}


function cc(){

	console.log("cc script");

	alert("alert cc.....");

     
}