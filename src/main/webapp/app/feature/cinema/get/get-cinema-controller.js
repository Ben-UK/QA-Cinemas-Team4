(function() {

    var GetCinemaController =  function(cinemaService) {
        var vm = this;

        function init() {
            cinemaService.getCinemas().then(function (results) {
                console.log("In Cinema Controller");
                vm.cinemas  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }

        function showingEvents($scope){

        }

        init();
    };

    angular.module('cinemaApp').controller('getCinemaController', ['cinemaService', GetCinemaController]);
}());