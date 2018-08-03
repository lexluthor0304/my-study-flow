function print_table(){
    var goods = ["チェア", "デスク", "ブックスタンド"];
    var price = [4000, 12000, 800];
    for(var i = 0; i < 3; i++) {
        document.write("<tr>");
        document.write("<td>"+goods[i]+"</td>");
        document.write("<td>"+price[i]+"円</td>");
        document.write("</tr>");
    }
}