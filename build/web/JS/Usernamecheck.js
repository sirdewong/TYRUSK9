var input = $("#phone"),
        output = $("#output"),
        errorMsg = $("#error-msg"),
        validMsg = $("#valid-msg");
$("#phone").intlTelInput({
  initialCountry: "auto",
  geoIpLookup: function (callback) {
    $.get('http://ipinfo.io', function () {}, "jsonp").always(function (resp) {
      var countryCode = (resp && resp.country) ? resp.country : "";
      callback(countryCode);
    });
  },
  utilsScript: "JS/utils.js",
  seperateDialCode: true,
  preferredCountries: ["ph"],
  nationalMode: true

});
input.on("keyup change", function () {
  var intlNumber = input.intlTelInput("getNumber");
  if (intlNumber) {
    output.text("International: " + intlNumber);
    document.getElementById("phone").value = intlNumber;
  } else {
    output.text("Please enter a number below");
  }
});

var reset = function () {
  input.removeClass("error");
  errorMsg.addClass("hide");
  validMsg.addClass("hide");
};

input.blur(function () {
  reset();
  if ($.trim(input.val())) {
    if (input.intlTelInput("isValidNumber")) {
      validMsg.removeClass("hide");
    } else {
      input.addClass("error");
      errorMsg.removeClass("hide");
    }
  }
});
input.on("keyup change", reset);

$('#phone').keypress(function (e) {
  if (this.value.length == 0 && e.which == 48) {
    return false;
  }
});

function checkUsername() {
  var uname = $(".uname").val();

  if (uname.length >= 6 && uname.length <= 23) {
    $(".status").html("<img src='Images/loading.gif'><font color=gray> Checking availability...</font>");
    if (!/^[a-zA-Z0-9.]+$/.test(uname)) {
      $(".status").html("<font color=red>Accept AlphaNumeric and . only</font>");
    } else {
      setTimeout(ajaxCheck, 2300);
    }
  } else {
    $(".status").html("<font color=red>Username should be <b>6</b>&nbsp;-&nbsp;24 character long.</font>");
  }

}

function checkPasswordMatch() {
  var password = $(".passs").val();
  var confirmPassword = $(".repasss").val();
  if (password.length >= 8) {
    if (password != confirmPassword) {
      $(".pstatus").html("<font color=red>Password does not match</font>");
    } else {
      $(".pstatus").html("<font color=green>Password match</font>");
    }
  } else {
    $(".pstatus").html("<font color=red>Password should be <b>8</b>&nbsp character long.</font>");
  }
}

$(document).ready(function () {
  $(".passs, .repasss").keyup(checkPasswordMatch);
  $(".uname").keyup(checkUsername);
});

function ajaxCheck() {
  var uname = $(".uname").val();
  $.ajax({
    type: "POST",
    url: "Availability",
    data: "uname=" + uname,
    success: function (msg) {
      $(".status").html(msg);
    }
  });
}
              