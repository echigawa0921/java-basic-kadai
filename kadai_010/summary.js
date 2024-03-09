$(document).ready(function() {
  $("#change-color").click(function() {
    $("#target").css("color", "red"); // 色が変わる（赤色）
  });

  $("#change-text").click(function() {
    $("#target").text("Hello"); // 文字が切り替わる
  });

  $("#fade-out").click(function() {
    $("#target").fadeOut(); // フェードアウトで文字が消える
  });

  $("#fade-in").click(function() {
    $("#target").fadeIn(); // フェードインで文字が現れる
  });
});
