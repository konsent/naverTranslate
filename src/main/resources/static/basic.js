$(document).ready(function () {
    // id 가 query 인 녀석 위에서 엔터를 누르면 execSearch() 함수를 실행하라는 뜻입니다.
    $('#query').on('keypress', function (e) {
        if (e.key == 'Enter') {
            execSearch();
        }
    });
})

function execSearch() {
    let inputLang = $('#inputLang').val();
    let outputLang = $('#outputLang').val();
    let query = $('#query').val();
    if (query == '') {
        alert('번역할 문장을 입력해주세요');
        $('#query').focus();
        return;
    }
    $.ajax({
        type: 'POST',
        url: `/api/result?source=${inputLang}&target=${outputLang}&text=${query}`,
        success: function (response) {
            $('#translated').empty();
            $('#translated').append(response);
        }
    })

}