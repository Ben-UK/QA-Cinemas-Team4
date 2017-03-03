"use strict";

(function () {

    angular.module('movieApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/home");

        $stateProvider.state("dashboard", {
            url: "/dashboard",
            templateUrl: "app/feature/dashboard/dashboard-partial.html"
        }).state("addmovie", {
            url: "/addmovie",
            templateUrl: "app/feature/movie/add/add-movie-partial.html"
        }).state("getmovie", {
            url: "/getmovie",
            templateUrl: "app/feature/movie/get/get-movie-partial.html"
        }).state("home", {
            url: "/home",
            templateUrl: "app/feature/homepage/homepage-partial.html"
        }).state("whatson", {
            url: "/whatson",
            templateUrl: "app/feature/whatson/whatson.html"
        })
    });
}());