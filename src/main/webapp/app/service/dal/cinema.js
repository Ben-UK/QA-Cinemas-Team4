"use strict";

(function () {

    angular.module("cinemaApp").service("cinemaDal", ["dal", CinemaDal]);

    function CinemaDal (dal) {
        console.log("In cinema DAL");
        this.getCinemas = function () {
            return dal.http.GET("rest/cinema/json");
        };

    }
}());

