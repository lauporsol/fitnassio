<%@include file="includes/header.jsp"%>

<h1>Files in your Google Drive</h1>

<div class="container">

    <p class="message">${message}</p>

    <table id="files">
        <tr>
            <th>Name</th>
            <th>Size</th>
            <th>Last modification date</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${requestScope.files.items}" var="file">
            <tr>
                <td><c:out value="${file.title}"/></td>
                <td><c:out value="${file.fileSize}"/></td>
                <td><c:out value="${file.modifiedDate}"/></td>
                <td>
                    <a href="/googleDriveFileUpdate?id=${file.id}"><img src="./images/edit.png" width="30px"></a>
                </td>
                <td>
                    <a href="/googleDriveFileDelete?id=${file.id}"><img src="./images/delete.png" width="30px"></a>
                </td>
            </tr>
        </c:forEach>			
    </table>
    <p>
        <a href="/googleDriveFileEdit.jsp" class="button">Create new plain text file</a>
        <button type="button" onClick="javascript:window.location.href = '/'" class="button">Back</button>
</div>

<%@include file="includes/footer.jsp"%>
