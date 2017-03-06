"use strict";

(function () {

    angular.module("cinemaApp").service("eventDal", ["dal", EventDal]);

    function EventDal (dal) {

        this.getEvents = function () {
            return dal.http.GET("rest/event/json");
        };

    }
}());
