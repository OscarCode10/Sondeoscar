var admin = document.querySelector(".admin");
var ciuda = document.querySelector(".ciuda");

document.getElementById("ciudadano").addEventListener("click", function() {
    admin.style.display = "none";
    ciuda.style.display = "block";
});

document.getElementById("administrador").addEventListener("click", function() {
    admin.style.display = "block";
    ciuda.style.display = "none";
});
