"use strict";

(function () {

    angular.module("cinemaApp").service("showingDal", ["dal", ShowingDal]);

    function ShowingDal (dal) {

        this.getShowings = function () {
            return dal.http.GET("rest/showing/json");
        };
    }
}());
