<% include '/WEB-INF/includes/header.gtpl' %>

<h1>LagerUrl</h1>

<p>
 	<% 
 	def urls  = request.getAttribute("urls") 
 	for (url in urls) { %>
 		<li>${url.by}: <a href="${url.url}">${url.url}</a> ${url.desc}
 	<%}%>   
</p>

<% include '/WEB-INF/includes/footer.gtpl' %>