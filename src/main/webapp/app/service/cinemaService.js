(function() {

    var CinemaService =  function(cinemaDal) {

        this.getCinemas = function() {
            console.log("In Cinema Service");
            return cinemaDal.getCinemas();

        };

    };

    angular.module("cinemaApp").service("cinemaService", ["cinemaDal", CinemaService]);
}());