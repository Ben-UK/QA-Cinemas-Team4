"use strict";

//Cinema
(function() {

    angular.module("cinemaApp").service("cinemaAdminDal", ["dal", CinemaAdminDal]);

    function CinemaAdminDal (dal) {

        this.getCinemas = function () {
            return dal.http.GET("rest/cinema/json");
        };

        this.addCinema = function (cinemaToSave) {
            return dal.http.POST("rest/cinema/json", cinemaToSave);
        };

        this.deleteCinema = function (cinemaToDeleteID) {
            return dal.http.DELETE("rest/cinema/json/" + cinemaToDeleteID)
        };

        this.updateCinema = function(cinemaToUpdateID, cinemaToUpdate){
            return dal.http.PUT("rest/cinema/json/" + cinemaToUpdateID, cinemaToUpdate);
        }
    }
}());

//Showing
(function() {

    angular.module("cinemaApp").service("showingAdminDal", ["dal", ShowingAdminDal]);

    function ShowingAdminDal (dal) {

        this.getShowings = function () {
            return dal.http.GET("rest/showing/json");
        };

        this.addShowing = function (showingToSave) {
            return dal.http.POST("rest/showing/json", showingToSave);
        };

        this.deleteShowing = function (showingToDeleteID) {
            return dal.http.DELETE("rest/showing/json/" + showingToDeleteID)
        };

        this.updateShowing = function(showingToUpdateID, showingToUpdate){
            return dal.http.PUT("rest/showing/json/" + showingToUpdateID, showingToUpdate);
        }
    }
}());

//Event
(function() {

    angular.module("cinemaApp").service("eventAdminDal", ["dal", EventAdminDal]);

    function EventAdminDal (dal) {

        this.getEvents = function () {
            return dal.http.GET("rest/event/json");
        };

        this.addEvent = function (eventToSave) {
            return dal.http.POST("rest/event/json", eventToSave);
        };

        this.deleteEvent = function (eventToDeleteID) {
            return dal.http.DELETE("rest/event/json/" + eventToDeleteID)
        };

        this.updateEvent = function(eventToUpdateID, eventToUpdate){
            return dal.http.PUT("rest/event/json/" + eventToUpdateID, eventToUpdate);
        }
    }
}());
