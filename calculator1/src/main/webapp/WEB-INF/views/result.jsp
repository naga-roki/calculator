<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>計算結果</title>
</head>
<body>
    <h1>計算結果</h1>

    <!-- 計算結果を表示するテキストボックス -->
    <input type="text" value="${result}" readonly>
    
    <!-- 戻るボタン -->
    <br>
    <form action="result.jsp" method="get">
        <button type="submit">戻る</button>
    </form>
</body>
</html>