/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(window).scroll(function () {
    if ($(window).scrollTop() > 280) {
        $('#nanav1').addClass('navbar-fixed-top');
        $('#nanav1').addClass('nav-or');
        $('#nanav').addClass('nav-or-a');
    }
    if ($(window).scrollTop() < 281) {
        $('#nanav1').removeClass('nav-or navbar-fixed-top');
        $('#nanav').removeClass('nav-or-a');
    }
});

