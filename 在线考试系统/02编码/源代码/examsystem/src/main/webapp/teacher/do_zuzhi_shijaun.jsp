<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="/OnlineExamSystem/image/main_logo.ico" rel="shortcut icon">
    <title>在线考试系统-正在考试</title>

    <script type="text/javascript">
        $(function(){
            show_time(2*60);
            $("#submi").click(function(){
                var b = checkIfselected();
                if(b==false){
                    return false;
                }
                var flag=confirm("确定要交卷吗？");
                if(flag){
                    return true;
                }else{
                    return false;
                }
            })
        })
        function show_time(totalTime){
            if(totalTime==0){
                alert("考试时间结束！系统将会自动提交试卷！");
                $("form").submit(function(){
                    checkIfselected();
                });
                return false;
            }
            var remainTime=totalTime-1;
            var min = remainTime/60;
            min=parseInt(min);
            var s=remainTime%60;
            if(s<10){
                s="0"+s;
            }
            var str="0"+min+":"+s;
            $("#sp4").text(str);
            setTimeout("show_time("+remainTime+")",1000);
        }

        function checkIfselected(){
            var size = $("input:checkbox:checked").size();
            var size2 = $("input:radio:checked").size();
            if(size<1 && size2<1){
                alert("请至少做一道吧，同学！");
                return false;
            }
        }

    </script>
</head>
<body >
<div data-options="region:'north'" style="line-height:60px;height:80px;background-size:cover">
    <font id="ft1" size="3px" style="margin-left:5%">当 前 考 生：<span id="sp1">AA</span></font>
    <font id="ft3" size="3px" style="margin-left:2%">考 试 限 时：<span id="sp3">2分钟</span></font>
    <font id="ft4" size="3px" style="margin-left:2%">剩 余 时 间：<span id="sp4"></span></font>
</div>

<div data-options="region:'center'">
    <div style="margin-top:2%;margin-left:2%">
        <font size="3px" color="red" style="margin-left:20%">正在考试： </font>
        <br>
        <br>
        <br>
        <center>
            <font size="6px">语文&nbsp;&nbsp;&nbsp;&nbsp;考试卷</font>
        </center>
    </div>
    <br>
    <div style="margin-top:2%;margin-left:36%;font-size:15px">
        <form action="#" method="post">

            <table cellpadding="20px">
                <tr>
                    <td><font style="font-weight:bold">一、单选题</font>（每题5 分，答错不得分）</td>
                </tr>

                <c:forEach items="${zyList}" var="zy">
                    <tr>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;1、语文难不难？<br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="answerMap[12]" value="A">A、难&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="radio" name="answerMap[12]" value="B">B、不难&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="radio" name="answerMap[12]" value="C">C、一般般&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="radio" name="answerMap[12]" value="D">D、很简单
                        </td>
                        <td>
                            <button type="button" class="btn btn-default" title="新建"
                                    onclick="location.href='${pageContext.request.contextPath}/zy/zy-add.jsp'">
                                <i class="fa fa-file-o"></i> 刷新题库
                            </button>
                        </td>
                    </tr>




                </c:forEach>



                <tr>
                    <td><font style="font-weight:bold">二、多选题</font>（每题20分，答错不得分）</td>
                </tr>



                <c:forEach items="${zyList}" var="zy">
                    <tr>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;2、语文为什么难？<br><br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="answerMap[13]" value="A">A、老师太凶了&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="checkbox" name="answerMap[13]" value="B">B、看不懂文言文&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="checkbox" name="answerMap[13]" value="C">C、我是理科男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="checkbox" name="answerMap[13]" value="D">D、情商不高
                        </td>
                        <td>
                            <button type="button" class="btn btn-default" title="新建"
                                    onclick="location.href='${pageContext.request.contextPath}/zy/zy-add.jsp'">
                                <i class="fa fa-file-o"></i> 刷新题库
                            </button>
                        </td>
                    </tr>





                </c:forEach>




                <tr>
                    <td align="center"><input id="" type="submit" style="background:yellow" value="生成试卷"></td>
                </tr>
            </table>
            <br>
            <br>
        </form>
    </div>
</div>
</body>
</html>