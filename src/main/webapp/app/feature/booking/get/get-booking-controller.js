(function() {

    var GetBookingController =  function(bookingDal) {
        var vm = this;

        function init() {
            bookingDal.getBookings().then(function (results) {
                vm.bookings  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };

    angular.module('cinemaApp').controller('getBookingController', ['bookingDal', GetBookingController]);
}());