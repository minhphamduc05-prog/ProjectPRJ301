<%-- 
    Document   : products
    Created on : Nov 9, 2025, 10:30:32 PM
    Author     : MinhPD
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>Products</title>
        <link rel="stylesheet" href="<c:url value='/resource/client/css/products.css'/>" />
        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">

        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="<c:url value='/resource/client/css/bootstrap.min.css'/>"/>

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="<c:url value='/resource/client/css/slick.css'/>"/>
        <link type="text/css" rel="stylesheet" href="<c:url value='/resource/client/css/slick-theme.css'/>"/>


        <link type="text/css" rel="stylesheet" href="<c:url value='/resource/client/css/nouislider.min.css'/>"/>

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="<c:url value='/resource/client/css/font-awesome.min.css'/>">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="<c:url value='/resource/client/css/style.css'/>"/>
    </head>
    <body>

        <jsp:include page="/client/layout/header.jsp" />

        <div class="product-section">
            <h2>Products</h2>
            <div class="product-container">
                <c:forEach var="p" items="${products}">
                    <div class="product-card">
                        <img src="images/${p.getImage()}" alt="${p.getProductName()}" />
                        <h3>${p.getProductName()}</h3>
                        <p>${p.getPrice()} USD</p>
                        <a href="productdetail?id=${p.getpID()}" class="btn">View Details</a>
                    </div>
                </c:forEach>
            </div>
        </div>

        <jsp:include page="/client/layout/footer.jsp" />

    </body>
</html>

