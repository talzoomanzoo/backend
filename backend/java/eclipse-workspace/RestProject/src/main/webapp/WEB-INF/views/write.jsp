<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <c:set var="contextPath" value="${pageContext.request.contextPath}" />
        <% request.setCharacterEncoding("UTF-8"); %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>글쓰기</title>
                <script>
                    function backToList(frm) {
                        frm.action="${contextPath}/board/list";
                        frm.submit();
                    }
                </script>
                <style>
                    .class-caption {
                        width:100px;
                    }
                    .class-content {
                        width:500px;
                    }
                </style>
            </head>

            <body>
                <h1 style="text-align: center;">글 쓰기</h1>
                <form name="articleForm" method="post" action="${contextPath}/board/addArticle">
                    <table border="0" align="center">
                        <tbody>
                            <tr>
                                <td align="right" class="class-caption">글제목:</td>
                                <td colspan="2">
                                    <input type="text" maxlength="100" name="i_title" class="class-content">
                                </td>
                            </tr>
                            <tr>
                                <td align="right" valign="top" class="class-caption">글내용:</td>
                                <td colspan="2">
                                    <textarea name="i_content" rows="10" maxlength="2000"
                                        class="class-content"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <td align="right"></td>
                                <td colspan="2">
                                    <input type="submit" value="저장">
                                    <input type="button" value="목록보기" onclick="backToList(articleForm)">
                            </tr>
                        </tbody>
                    </table>
                </form>
            </body>

            </html>