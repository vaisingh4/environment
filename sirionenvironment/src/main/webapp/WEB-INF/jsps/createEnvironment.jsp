<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Environment</title>
</head>
<body>

<form action="/saveEnv" method="post">
<pre>
Id: <input type="text" name="id"/>
Client Name: <input type="text" name="clientName"/>
SFTP SdboxHost: <input type="text" name="sftpSdboxHost"/>
SFTP SdboxPassword: <input type="text" name="sftpSdboxPassword"/>
Sirion SdboxEndUserHost: <input type="text" name="sirionSdboxEndUserHost"/>
Sirion SdboxEndUserName: <input type="text" name="sirionSdboxEndUserName"/>
Sirion SdboxEndUserPassword: <input type="text" name="sirionSdboxEndUserPassword"/>
Sirion ProdEndUserHost: <input type="text" name="sirionProdEndUserHost"/>
Sirion ProdEndUserName: <input type="text" name="sirionProdEndUserName"/>
Sirion ProdEndUserPassword: <input type="text" name="sirionProdEndUserPassword"/>
SFTP ProdHost: <input type="text" name="sftpProdHost"/>
SFTP ProdPassword: <input type="text" name="sftpProdPassword"/>
Sirion SdboxAdminUserHost: <input type="text" name="sirionSdboxAdminUserHost"/>
Sirion SdboxAdminUserName: <input type="text" name="sirionSdboxAdminUserName"/>
Sirion SdboxAdminUserPassword: <input type="text" name="sirionSdboxAdminUserPassword"/>
Sirion ProdAdminUserHost: <input type="text" name="sirionProdAdminUserHost"/>
Sirion ProdAdminUserName: <input type="text" name="sirionProdAdminUserName"/>
Sirion ProdAdminUserPassword: <input type="text" name="sirionProdAdminUserPassword"/>
<input type="submit" name="save">
</pre>
</form>
</body>
</html>