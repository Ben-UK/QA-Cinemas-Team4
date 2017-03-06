(function() {

    var GetShowingController =  function(showingDal) {
        var vm = this;

        function init() {
            showingDal.getShowings().then(function (results) {
                vm.showings  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };

    angular.module('cinemaApp').controller('getShowingController', ['showingDal', GetShowingController]);
}());