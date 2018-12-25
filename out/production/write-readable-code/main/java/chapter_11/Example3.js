$.post({
    url: "http://example.com/submit",
    data: data,
    success: function (response_data) {
        var str = "{\n";
        for (var key in response_data) {
            str += "" + key + "=" + response_data[key] + "\n";
        }
        alert(format_pretty(response_data));
        // 继续处理响应数据
    }
});

// 将对象转成json字符串
function format_pretty(json_object) {
    var str = "{\n";
    for (var key in response_data) {
        str += "" + key + "=" + response_data[key] + "\n";
    }
    return str + "}"
}