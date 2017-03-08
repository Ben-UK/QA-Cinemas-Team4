function setFilm(filmToSet)
{
    var element1 = document.getElementById('main');
    element1.disabled = false;

    var element2 = document.getElementById('film');
    element2.value = filmToSet;
    element2.disabled = false;

    var element3 = document.getElementById('day');
    element3.disabled = false;

    var element4 = document.getElementById('time');
    element4.disabled = false;
}