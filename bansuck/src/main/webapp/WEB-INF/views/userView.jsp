<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
</head>

<style>

    * {
        list-style: none;
        color: black;
        padding: 0px;
        margin: 0px;
        text-decoration: none;
        border-collapse: collapse;
    }

    .signupForm {
        background: lightgray;
        border: 3px solid red;
        width: 300px;
        height: 100%;

        margin-top: 50px;

        text-align: center;
    }

    .signupForm > h2 {
        margin-top: 15px;
    }

    .signupForm > div {
        margin: 15px 0 5px 0;
    }

    .signupForm > button {
        width: 200px;
        margin: 15px 0 15px 0;
    }

</style>

<body>

    <form class="signupForm" id="signupForm">
        <h2>회원가입</h2>
        <div>
            <label for="">아이디</label>
            <input id="signupInputId" type="text" />
        </div>
        <div>
            <label for="">패스워드</label>
            <input id="signupInputPwd" type="password" />
        </div>
        <div>
            <label for="">이름</label>
            <input id="signupInputName" type="text" />
        </div>
        <div>
            <label for="">이메일</label>
            <input id="signupInputEmail" type="email" />
        </div>
        <div>
            <label for="">번호</label>
            <input id="signupInputPhone" type="text" />
        </div>
        <div>
            <label for="">주소</label>
            <input id="signupInputAddr" type="text" />
        </div>
        <button id="signupBtn" type="button" > 가입 </button>
    </form>


    <script>

        var signupInputId = $('#signupInputId');
        var signupInputPwd = $('#signupInputPwd');
        var signupInputName = $('#signupInputName');
        var signupInputEmail = $('#signupInputEmail');
        var signupInputPhone = $('#signupInputPhone');
        var signupInputAddr = $('#signupInputAddr');

        $(document).ready(function () {
            $('#signupBtn').on("click", function() {
                
                const form = $('#signupForm'); // 가입 서식
                const formData = new FormData(); // 데이터폼

                // 가입 정보
                formData.append("id", signupInputId);
                formData.append("pwd", signupInputPwd);
                formData.append("name", signupInputName);
                formData.append("email", signupInputEmail);
                formData.append("phone", signupInputPhone);
                formData.append("addr", signupInputAddr);
                
                $.ajax({
                    url: "/api/user/signup",
                    type: 'post',
                    data: formData,
                    cache: false,
                    contentType: false,
                    processData: false,
                    success: function (res) {
                        console.log(res);
                    },
                    error: function (xhr) {
                        console.log(xhr);
                    }
                });


                // form.attr("method", "POST"); // ("속성", "값")
                request.open("POST", "/api/user/signup");


                request.send(formData);
            })
            }
        )

    </script>

</body>

</html>