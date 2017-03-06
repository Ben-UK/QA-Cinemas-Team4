function showDiscountCodeField(){
    var checkbox = document.getElementById("chbx");
    if (checkbox.checked){
        var discountCodeBlock = document.getElementById("discountCodeBlock");
        discountCodeBlock.style.display = 'block';
    }
    else {
        var discountCodeBlock = document.getElementById("discountCodeBlock");
        discountCodeBlock.style.display = 'none';
    }
}

function checkBookingDetails() {
   //////////////// //TO DO///////////////////////
    var passedCname = document.getElementById("cname").value;
    var passedCcn = document.getElementById("ccn").value;
    var passedCvv = document.getElementById("cvv").value;
    var passedCemail = document.getElementById("cemail").value;

    var confirmMessageBlock = document.getElementById("confirmationMessageBlock");

    // Capital I, lower case L, capital o and the number 0 look too similar in certain fonts so have been removed
    var charactersForRandString = 'ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz123456789';
    var randomString = "";
    for(var i = 0; i < 8; i++)
    {
        var rand = Math.round(Math.random() * (charactersForRandString.length - 1));
        var character = charactersForRandString.substr(rand, 1);
        randomString = randomString + character;
    }

    document.getElementById("randomStringSlot").textContent = randomString;

    confirmMessageBlock.style.display = 'block';

    var inputBlock = document.getElementById("inputBlock");
    inputBlock.style.display = 'none';


}
