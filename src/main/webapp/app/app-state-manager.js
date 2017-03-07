"use strict";

(function () {

    angular.module('cinemaApp').config(function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/home");

        $stateProvider.state("home", {
            url: "/home",
            templateUrl: "app/feature/homepage/homepage-partial.html"
        }).state("whatson", {
            url: "/whatson",
            templateUrl: "app/feature/whatson/whatson.html"
        }).state("contact", {
            url: "/contact",
            templateUrl: "app/feature/contact/contactus.html"
        }).state("payment", {
            url: "/payment",
            templateUrl: "app/feature/payment/payment.html"
        })
    });
}());