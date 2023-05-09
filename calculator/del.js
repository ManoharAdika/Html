function delet(){
    var value = document.getElementById("back").value;
    document.getElementById("back").value = value.substr(0, value.length - 1);
}