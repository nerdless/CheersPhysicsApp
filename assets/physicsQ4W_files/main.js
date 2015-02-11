/*
 Here you call your objects
*/
webapp = null;



$(document).ready(function() {
    $(function() {
        if (window.PIE) {
            $('.iefix').each(function() {
                PIE.attach(this);
            });
        }
    });
    webapp = new WEBAPP();


});