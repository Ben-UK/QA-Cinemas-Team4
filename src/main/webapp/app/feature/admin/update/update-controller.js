//Cinema
(function() {
    var UpdateCinemaAdminController =  function(cinemaAdminDal){
        var vm = this;
        vm.updateCinema = function(cinemaToUpdateID, cinemaToUpdate){
            cinemaAdminDal.updateCinema(cinemaToUpdateID, cinemaToUpdate).then(function(results){
                vm.cinemaUpdateMessage  = results;
                $state.go('updateCinema');
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateCinemaAdminController', ['$state','cinemaAdminDal',UpdateCinemaAdminController]);
}());

//Showing
(function() {
    var UpdateShowingAdminController =  function(showingAdminDal){
        var vm = this;
        vm.updateShowing = function(showingToUpdateID, showingToUpdate){
            cinemaAdminDal.updateShowing(showingToUpdateID, showingToUpdate).then(function(results){
                vm.showingUpdateMessage  = results;
                $state.go('updateShowing');
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateShowingAdminController', ['$state','showingAdminDal',UpdateShowingAdminController]);
}());

//Event
(function() {
    var UpdateEventAdminController =  function(eventAdminDal){
        var vm = this;
        vm.updateEvent = function(eventToUpdateID, eventToUpdate){
            eventAdminDal.updateShowing(eventToUpdateID, eventToUpdate).then(function(results){
                vm.eventUpdateMessage  = results;
                $state.go('updateEvent');
            }, function(error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        };
    };
    angular.module('cinemaApp').controller('updateEventAdminController', ['$state','eventAdminDal',UpdateEventAdminController]);
}());
