function getLocation() {
    var currentLoc = document.getElementById('addressValue');
    var i = currentLoc.selectedIndex;
    return document.getElementById("test").innerHTML = currentLoc.options[i].value;
}

function getDirections() {
        var addressArray = ["Lowry Outlet, The Lowry Designer Outlet the Quays, Salford M50 3AG",
            "Conway Park, Europa Blvd, Birkenhead CH41 4PE",
            "Great North Leisure Park, Chaplin Square, London N12 0GL",
            "Festival Place Shopping Centre, Festival Place, New Market Square, Basingstoke RG21 7BB"];
        var currentLoc = document.getElementById('addressValue');
        var j = currentLoc.selectedIndex;
        if(j == 0){
           return document.getElementById('addressValue').value = addressArray[0];
        }else if(j == 1){
           return document.getElementById('addressValue').value = addressArray[1];
        }else if(j == 2) {
           return document.getElementById('addressValue').value = addressArray[2];
        }else if(j == 3) {
           return document.getElementById('addressValue').value = addressArray[3];
        }

}

function locations(){
    var loc = new Array(4);
    for (i=0; i <3; i++){
        loc[i]=new Array(3)
    }
    loc[0][0] = "https://www.google.com/maps/embed/v1/place?key=AIzaSyDJ0t6FZauzVy9XrOo1ayihquRrR7su47Y&q=Vue+Cinema,Manchester";
    loc[0][1] = "https://www.google.com/maps/embed/v1/place?key=AIzaSyDJ0t6FZauzVy9XrOo1ayihquRrR7su47Y&q=Vue+Cinema,Liverpool";
    loc[0][2] = "https://www.google.com/maps/embed/v1/place?key=AIzaSyDJ0t6FZauzVy9XrOo1ayihquRrR7su47Y&q=Vue+Cinema,London";
    loc[0][3] = "https://www.google.com/maps/embed/v1/place?key=AIzaSyDJ0t6FZauzVy9XrOo1ayihquRrR7su47Y&q=Vue+Cinema,BasingStoke";
    loc[1][0] = "Lowry Outlet, The Lowry Designer Outlet the Quays, Salford M50 3AG";
    loc[1][1] = "Conway Park, Europa Blvd, Birkenhead CH41 4PE";
    loc[1][2] = "Great North Leisure Park, Chaplin Square, London N12 0GL";
    loc[1][3] = "Festival Place Shopping Centre, Festival Place, New Market Square, Basingstoke RG21 7BB";

}