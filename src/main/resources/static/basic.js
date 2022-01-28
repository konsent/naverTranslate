$(document).ready(function () {
    $('#query').on('keypress', function (e) {
        if (e.key == 'Enter') {
            searchTranslate();
        }
    });
})

function searchTranslate() {
    let query = $('#query').val();
    if (query == '') {
        alert('번역할 문장을 입력해주세요');
        $('#query').focus();
        return;
    }
    $.ajax({
        type: 'POST',
        url: `/api/search?query=${query}`,
        success: function (response) {
            $('#translated').empty();
            let tempHtml = addHTML(response);
            $('#translated').append(response);
        }
    })
}

function addHTML(response) {
    return `<div class="search-itemDto">
            <div>
            <TEXTAREA ROWS="5", COLS="25">${response}</TEXTAREA>
    </div>`
}