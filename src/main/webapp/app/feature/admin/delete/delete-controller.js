//Cinema
(function() {
    var DeleteCinemaAdminController =  function(cinemaAdminDal){
        var vm = this;
        vm.deleteCinema = function(cinemaToDeleteID, cinemaToDelete){
            cinemaAdminDal.deleteCinema(cinemaToDeleteID, cinemaToDelete).then(function(results){
                vm.cinemaDeleteMessage  = results;
                $state.go('deleteCinema');
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('deleteCinemaAdminController', ['$state','cinemaAdminDal',DeleteCinemaAdminController]);
}());

//Showing
(function() {
    var DeleteShowingAdminController =  function(showingAdminDal){
        var vm = this;
        vm.deleteShowing = function(showingToDeleteID, showingToDelete){
            showingAdminDal.deleteShowing(showingToDeleteID, showingToDelete).then(function(results){
                vm.showingDeleteMessage  = results;
                $state.go('deleteShowing');
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('deleteShowingAdminController', ['$state','showingAdminDal',DeleteShowingAdminController]);
}());

//Event
(function() {
    var DeleteEventAdminController =  function(eventAdminDal){
        var vm = this;
        vm.deleteEvent = function(eventToDeleteID, eventToDelete){
            eventAdminDal.deleteEvent(eventToDeleteID, eventToDelete).then(function(results){
                vm.eventDeleteMessage  = results;
                $state.go('deleteEvent');
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('deleteEventAdminController', ['$state','eventAdminDal',DeleteEventAdminController]);
}());

