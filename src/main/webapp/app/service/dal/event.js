"use strict";

(function () {

    angular.module("cinemaApp").service("eventDal", ["dal", EventDal]);

    function EventDal (dal) {
        console.log("In event DAL");
        this.getEvents = function () {
            return dal.http.GET("rest/event/json");
        };
    }
}());
