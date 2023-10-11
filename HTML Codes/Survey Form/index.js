function submitForm(){

        if (validateForm()) {
            
            var firstName = document.getElementById("firstName").value;
            var lastName = document.getElementById("lastName").value;
            var dob = document.getElementById("dob").value;
            var country = document.getElementById("country").value;
            var gender = document.querySelector('input[name="gender"]:checked').value;
            var profession = document.getElementById("profession").value;
            var email = document.getElementById("email").value;
            var mobile = document.getElementById("mobile").value;

            
            var message = "Please check your details\n\n";
            message += "First Name: " + firstName + "\n";
            message += "Last Name: " + lastName + "\n";
            message += "Date of Birth: " + dob + "\n";
            message += "Country: " + country + "\n";
            message += "Gender: " + gender + "\n";
            message += "Profession: " + profession + "\n";
            message += "Email: " + email + "\n";
            message += "Mobile Number: " + mobile;

            return confirm(message);

            
        }
};

function validateForm() {
    var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var dob = document.getElementById("dob").value;
    var country = document.getElementById("country").value;
    var gender = document.querySelector('input[name="gender"]:checked');
    var profession = document.getElementById("profession").value;
    var email = document.getElementById("email").value;
    var mobile = document.getElementById("mobile").value;

    if (firstName === "" || lastName === "" || dob === "" || country === "Select" || !gender || profession === "" || email === "" || mobile === "") {
        alert("Please fill in all details.");
        return false;
    }
    return true;
}