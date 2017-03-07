(function() {

    var EventService =  function(eventDal) {

        this.getEvents = function() {
            return eventDal.getEvents();
        };
    };

    angular.module('cinemaApp').service('eventService', ['eventDal', EventService]);
}());
