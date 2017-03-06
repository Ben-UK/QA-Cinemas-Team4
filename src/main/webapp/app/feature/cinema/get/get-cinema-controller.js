(function() {

    var GetCinemaController =  function(cinemaDal) {
        var vm = this;

        function init() {
            cinemaDal.getCinemas().then(function (results) {
                vm.cinemas  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };

    angular.module('cinemaApp').controller('getCinemaController', ['cinemaDal', GetCinemaController]);
}());