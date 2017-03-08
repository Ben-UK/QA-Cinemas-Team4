(function() {

    var EventService =  function(eventDal) {

        this.getEvents = function() {
            console.log("In Event Service");
            return eventDal.getEvents();

        };

    };

    angular.module("cinemaApp").service("eventService", ["eventDal", EventService]);
}());