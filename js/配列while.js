function print_table(){
    var goods = ["チェア", "デスク", "ブックスタンド"];
    var price = [4000, 12000, 800];
    i = 0;
    while(i<3){
        document.write("<tr>");
        document.write("<td>"+goods[i]+"</td>");
        document.write("<td>"+price[i]+"円</td>");
        document.write("</tr>");
        i++;                
    }
}