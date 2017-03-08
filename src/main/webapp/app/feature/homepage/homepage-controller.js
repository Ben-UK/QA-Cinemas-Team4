(function() {

    var HomepageController =  function(eventService) {
        var vm = this;

        vm.reverse = false;

        vm.showFilms = function() {
            vm.sortby = 'Title';
            vm.reverse != vm.reverse
        };

        function init() {
            console.log("In homepage controller");
            eventService.getEvents().then(function (results) {
                vm.events = results;
                cosole.log(events);
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }

        init();
    };

    angular.module('cinemaApp').controller('homepageController', ['eventService', HomepageController]);
}());