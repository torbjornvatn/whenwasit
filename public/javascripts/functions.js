$(document).ready(function() {
    $("#datepicker").datepicker();

    $('input[title!=""]').hint();

    $("#plus").bind("keyup", updatePlusDate);
    $("#minus").bind("keyup", updateMinusDate);

    function updatePlusDate(event) {
        updateDate(event, "#plus");
    }

    function updateMinusDate(event) {
        updateDate(event, "#minus");
    }

    function updateDate(event, signId) {
        var sign = (signId == "#plus") ? "" : "-";
        if (validKeyup(event)) {
            $.post(calculateAction(), {'date': $("#datepicker").val(), 'extraDays': sign+$(signId).val()}, function(date) {
                $(signId+"_date").text(date);
            }, "text");
        }
    }

    function validKeyup(event) {
        if (event.which > 47 &&  event.which < 58 || event.which == 8) {
            return true;
        } else {
            return false
        }
    }
});

