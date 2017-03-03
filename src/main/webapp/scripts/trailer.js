// Get the modal
var modal = document.getElementById('myModal');

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal
btn.onclick = function() {
    modal.style.display = "block";

};

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
};

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
};

function getCertificationImage(string){
    if (string == "U"){
        return "images/U.png";

    } else if(string == "PG"){
        return "images/PG.png";

    } else if(string== "12A"){
        return "images/12A.png";

    } else if(string == "15"){
        return "images/15.png";

    } else if(string == "18"){
        return "images/18.png";
    }
}
