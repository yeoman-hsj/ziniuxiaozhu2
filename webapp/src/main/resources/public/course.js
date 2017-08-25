var courseList = {};
$(function () {
    getCourseList();
});
function showPubBox() {
    pubBox.style.display = "block";
}
function publish() {
    $.ajax({
        type: "POST",
        url: "/course/publish",
        data: {"title":title.value,"descrip":descrip.value,"audience":audience.value},
        success: function (result) {
            if (!result.success){
                alert(result.msg);
            }
            window.location.reload();
        },
        dataType: "json"
    });
    pubBox.style.display = "none";
}
function getCourseList(){
    $.ajax({
        type: "GET",
        url: "/course/getList",
        success: function (result) {
            if (!result.success){
                alert(result.msg);
            }else{
                showCards(result.data);
            }
        },
        dataType: "json"
    });
}
function showCards(courses) {
    for(i in courses){
        courseList[courses[i].id] = courses[i];
        var cardNode = $("#card").clone();
        $(cardNode).children().first().html(setStage(courses[i].id));
        $(cardNode).find("div").first().attr("data", courses[i].id);
        $(cardNode).find("p[name=lecturerName]").first().html(courses[i].lecturerName);
        $(cardNode).find("p[name=title]").first().html(courses[i].title);
        $(cardNode).css("background", 'url('+courses[i].coverUrl+')');
        $(cardNode).css("background-size", "100% 100%");
        $(cardNode).css("display", "block");
        var liNode = document.createElement("li");
        $("#list").append(liNode);
        $(liNode).append(cardNode);
        $(cardNode).click(function () {
            showUpdateBox($(this).find("div").first().attr("data"));
        });
    }
}
function showUpdateBox(cid) {
    updateBox.style.display = "block";
    $("#updateBox").children().first().attr("data", cid);
    $("#updateBox").find("img").first().attr("src", courseList[cid].coverUrl);
    $("#upTitle").val(courseList[cid].title);
    $("#upDescrip").val(courseList[cid].descrip);
    $("#upAudience").val(courseList[cid].audience);
}
function closeBox(node) {
    pubBox.style.display = "none";
    updateBox.style.display = "none";
}
function updateCourse() {
    $.ajax({
        type: "POST",
        url: "/course/update",
        data: {"id":$("#updateBox").children().first().attr("data"),"title":$("#upTitle").val(),
            "descrip":$("#upDescrip").val(),"audience":$("#upAudience").val()},
        success: function (result) {
            if (!result.success){
                alert(result.msg);
            }
            window.location.reload();
        },
        dataType: "json"
    });
    updateBox.style.display = "none";
}
function setStage(id) {
    switch (courseList[id].stage){
        case 0: return "发布中";
        case 1: return "审核中";
        case 2: return "已滞留";
        case 3:
            return znxz.commons.dateFmt("yyyy-MM-dd hh:mm:ss", new Date(courseList[id].gmtLecture));
        case 4: return "已闭课";
        case 5: return "进行中";
        case 6: return "已完成";
        default: return "已闭课";
    }
}