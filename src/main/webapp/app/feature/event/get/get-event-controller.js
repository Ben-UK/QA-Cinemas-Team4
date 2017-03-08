(function() {

    var GetEventController =  function(eventService) {
        var vm = this;

        function init() {
            eventService.getEvents().then(function (results) {
                console.log("In Event Controller");
                vm.event  = results;
                console.log()
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };

    angular.module('cinemaApp').controller('getEventController', ['eventService', GetEventController]);
}());