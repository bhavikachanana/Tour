/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function generateOTP(limit)
{
    var digits='0123456789';
    let OTP='';
    for(let i=0;i<limit;i++)
    {
        OTP+= digits[Math.floor(Math.random()*10)];
    }

    return OTP;

}
var otpText = generateOTP(4);
alert(otpText);
function validateOTP(otpText)
{
 var otpinput1 = document.getElementById("first").value;
 var otpinput2 =document.getElementById("second").value;
 var otpinput3 =document.getElementById("third").value;
 var otpinput4 = document.getElementById("fourth").value;

 var otptext2=otpinput1 + otpinput2 + otpinput3 + otpinput4;
   if(otpText===otptext2)
   {
         document.getElementById("text").innerHTML="Verifield";
   }
   else{
    document.getElementById("text").innerHTML="Incorrect OTp";
  }
   }




const inputs = document.querySelectorAll("input"),
  button = document.querySelector("button");

// iterate over all inputs
inputs.forEach((input, index1) => {
  input.addEventListener("keyup", (e) => {
    // This code gets the current input element and stores it in the currentInput variable
    // This code gets the next sibling element of the current input element and stores it in the nextInput variable
    // This code gets the previous sibling element of the current input element and stores it in the prevInput variable
    const currentInput = input,
  
      nextInput = input.nextElementSibling,
      prevInput = input.previousElementSibling;

    // if the value has more than one character then clear it
    if (currentInput.value.length > 1) {
      currentInput.value = "";
      return;
    }
    // if the next input is disabled and the current value is not empty
    //  enable the next input and focus on it
    if (nextInput && nextInput.hasAttribute("disabled") && currentInput.value !== "") {
      nextInput.removeAttribute("disabled");
      nextInput.focus();
    }

    // if the backspace key is pressed
    if (e.key === "Backspace") {
      // iterate over all inputs again
      inputs.forEach((input, index2) => {
        // if the index1 of the current input is less than or equal to the index2 of the input in the outer loop
        // and the previous element exists, set the disabled attribute on the input and focus on the previous element
        if (index1 <= index2 && prevInput) {
          input.setAttribute("disabled", true);
          input.value = "";
          prevInput.focus();
        }
      });
    }
    //if the fourth input( which index number is 3) is not empty and has not disable attribute then
    //add active class if not then remove the active class.
    if (!inputs[3].disabled && inputs[3].value !== "") {
      button.classList.add("active");
      
      return;
    }
    button.classList.remove("active");
  });
 
});


//focus the first input which index is 0 on window load
window.addEventListener("load", () => inputs[0].focus());