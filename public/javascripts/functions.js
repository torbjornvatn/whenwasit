$(document).ready(function() {
    $("#datepicker").datepicker();
});

$(function(){
    // find all the input elements with title attributes
    $('input[title!=""]').hint();
});