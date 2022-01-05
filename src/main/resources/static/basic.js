$(document).ready(function () {
    // id 가 query 인 녀석 위에서 엔터를 누르면 execSearch() 함수를 실행하라는 뜻입니다.
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
            $('#translated').append(tempHtml);
        }
    })

}

function addHTML(response) {
    /**
     * class="search-itemDto" 인 녀석에서
     * image, title, lprice, addProduct 활용하기
     * 참고) onclick='addProduct(${JSON.stringify(itemDto)})'
     */
    return `<div class="search-itemDto">
        <div class="search-itemDto-center">
            <div>${response}</div>
        </div>
    </div>`
}