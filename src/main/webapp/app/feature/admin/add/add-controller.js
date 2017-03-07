//Cinema
(function() {
    var AddCinemaAdminController =  function($state, cinemaAdminDal) {
        var vm = this;

        vm.addCinema = function(cinemaToAdd) {
            cinemaAdminDal.addCinema(cinemaToAdd).then(function (results) {
                vm.cinemaAddMessage  = results;
                $state.go('getCinemas');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('addCinemaAdminController', ['$state','cinemaAdminDal',AddCinemaAdminController]);
}());

//Showing
(function() {
    var AddShowingAdminController =  function($state, showingAdminDal) {
        var vm = this;

        vm.addShowing = function(showingToAdd) {
            showingAdminDal.addShowing(showingToAdd).then(function (results) {
                vm.showingAddMessage  = results;
                $state.go('getEvents');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('addShowingAdminController', ['$state','showingAdminDal',AddShowingAdminController]);
}());

//Event
(function() {
    var AddEventAdminController =  function($state, eventAdminDal) {
        var vm = this;
        vm.addEvent = function(eventToAdd) {
            eventAdminDal.addEvent(eventToAdd).then(function (results) {
                vm.eventAddMessage  = results;
                $state.go('getEvents');
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('addEventAdminController', ['$state','eventAdminDal',AddEventAdminController]);
}());
