$("#box").on('keyup', function () {
    var matcher = new RegExp($(this).val(), 'gi');
    $('.sss').show().not(function () {
        return matcher.test($(this).find('.tdtd').text())
    }).hide();
});

