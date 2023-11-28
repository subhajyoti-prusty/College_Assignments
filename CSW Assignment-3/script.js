$(document).ready(function() {
    $('.expand-icon').hover(function() {
        $(this).css('color', 'blue');
    }, function() {
        $(this).css('color', 'black');
    });

    $('.expand-icon').click(function() {
        $(this).next('.team-member-content').slideToggle();
    });

    $('#contactForm').submit(function(event) {
        var nameField = $('#name');
        var emailField = $('#email');
        var messageField = $('#message');

        if (nameField.val() === '' || emailField.val() === '' || messageField.val() === '') {
            event.preventDefault();
            displayErrorMessage('All fields are required.');
        } else if (!isValidEmail(emailField.val())) {
            event.preventDefault();
            displayErrorMessage('Please use a valid email address.');
        }
    });

    function displayErrorMessage(message) {
        $('#error-message').remove();
        $('<p id="error-message" class="error-message">' + message + '</p>').insertBefore('#contactForm');
    }

    function isValidEmail(email) {
        return /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]{2,7}$/.test(email);
    }
});
    