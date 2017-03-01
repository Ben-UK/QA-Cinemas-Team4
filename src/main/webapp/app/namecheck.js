function namecheck() {
    var un = document.getElementById("username").value;
    var pw = document.getElementById("password").value;
    var test = document.getElementById("test");
    // var login = document.getElementById("login");
    if (un == "admin" && pw == "password") {
        test.style.display = 'block';
        document.getElementById("username").value = "";
        document.getElementById("password").value = "";
    }
    else {
        alert("Access denied");
        document.getElementById("username").value = "";
        document.getElementById("password").value = "";
    }
}

function logout() {
    var test = document.getElementById("test");
    test.style.display = 'none';
}