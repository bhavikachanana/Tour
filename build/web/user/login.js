/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function clearErrors(){

    errors = document.getElementsByClassName('formerror');
    for(let item of errors)
    {
        item.innerHTML = "";
    }


}
function seterror(id, error){
    //sets error inside tag of id 
    element = document.getElementById(id);
    element.getElementsByClassName('formerror')[0].innerHTML = error;

}

function validateForm(){
    var returnval = true;
    clearErrors();

    //perform validation and if validation fails, set the value of returnval to false
    var name = document.forms['myloginform']["utxt"].value;
    if (name.length<2){
        seterror("user", "*Length of name is too short");
        returnval = false;
    }

    if (name.length == 0){
        seterror("user", "*Length of name cannot be zero!");
        returnval = false;
    }

   

    var password = document.forms['myForm']["ptxt"].value;
    if (password.length<5){

        // Quiz: create a logic to allow only those passwords which contain atleast one letter, one number and one special character and one uppercase letter
        seterror("pass", "*Password should be atleast 6 characters long!");
        returnval = false;
    }
    
    if(password!="(?=.\d)(?=.[a-z])(?=.*[A-Z]).{8,}")
    {
      seterror("pass", "Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters");
      returnval=false;
    }


    return returnval;
}
