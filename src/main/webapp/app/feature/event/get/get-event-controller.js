(function() {

    var GetEventController =  function(eventDal) {
        var vm = this;

        function init() {
            eventDal.getEvents().then(function (results) {
                vm.events  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };

    angular.module('cinemaApp').controller('getEventController', ['eventDal', GetEventController]);
}());