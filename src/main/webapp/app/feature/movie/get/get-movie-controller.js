(function() {

    var GetMovieController =  function(movieDal) {
        var vm = this;

        function init() {
            movieDal.getMovies().then(function (results) {
                vm.movies  = results;
            }, function (error) {
                vm.error = true;
                vm.errorMessage = error;
            });
        }
        init();
    };

    angular.module('cinemaApp').controller('getMovieController', ['movieDal', GetMovieController]);
}());