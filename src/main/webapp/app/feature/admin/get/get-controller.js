//Cinema
(function() {
    var GetCinemaAdminController =  function(cinemaAdminDal) {
        var vm = this;

        function init() {
            cinemaAdminDal.getCinemas().then(function (results) {
                vm.cinemas  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getCinemaAdminController', ['cinemaAdminDal', GetCinemaAdminController]);
}());

//Showing
(function() {
    var GetShowingAdminController =  function(showingAdminDal) {
        var vm = this;

        function init() {
            showingAdminDal.getShowings().then(function (results) {
                vm.showings = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getShowingAdminController', ['showingAdminDal', GetShowingAdminController]);
}());

//Event
(function() {
    var GetEventAdminController =  function(eventAdminDal) {
        var vm = this;

        function init() {
            eventAdminDal.getEvents().then(function (results) {
                vm.events = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };
    angular.module('cinemaApp').controller('getEventAdminController', ['eventAdminDal', GetEventAdminController]);
}());


