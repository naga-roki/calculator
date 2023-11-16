<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>簡易電卓</title>
</head>
<body>
    <h1>簡易電卓</h1>

    <!-- 計算結果を表示するテキストボックス -->
    <form action="CalculatorServlet" method="post">
        <input type="text" name="display" value="${result}" readonly><br>
        
        <!-- 数字ボタン -->
        <button type="submit" name="number" value="7">7</button>
        <button type="submit" name="number" value="8">8</button>
        <button type="submit" name="number" value="9">9</button>
        <button type="submit" name="operator" value="+">+</button><br>
        <!-- 演算子ボタン -->
        <button type="submit" name="number" value="4">4</button>
        <button type="submit" name="number" value="5">5</button>
        <button type="submit" name="number" value="6">6</button>
        <button type="submit" name="operator" value="-">-</button><br>
        <button type="submit" name="number" value="1">1</button>
        <button type="submit" name="number" value="2">2</button>
        <button type="submit" name="number" value="3">3</button>
        <button type="submit" name="operator" value="*">*</button><br>
        
        <!-- 0、クリア、計算ボタン -->
        <button type="submit" name="number" value="0">0</button>
        <button type="submit" name="operator" value="/">/</button>
        <button type="submit" name="clear" value="true">C</button>
        <button type="submit" name="calculate" value="true">=</button>
        
        <ul>
      <li><p><a href='calculator'>戻る</a></p></li>
    </ul>    
    </form>
</body>
</html>