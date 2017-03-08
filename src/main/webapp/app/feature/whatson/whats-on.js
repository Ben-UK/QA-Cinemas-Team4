function getCertificationImage(string){
    if (string == "U"){
        return "../../../images/U.png";

    } else if(string == "PG"){
        return "../../../images/PG.png";

    } else if(string== "12A"){
        return "../../../images/12A.png";

    } else if(string == "15"){
        return "../../../images/15.png";

    } else if(string == "18"){
        return "../../../images/18.png";
    }
}

function viewTrailer() {
    var test = document.getElementById("trailer");
    if (true) {
        trailer.style.display = 'block';
    }
    else {
        alert("Error");

    }
}
