import com.google.appengine.api.datastore.Query
import static com.google.appengine.api.datastore.FetchOptions.Builder.withLimit
 	
 	def query = new Query("url")
 	query.addSort("date", Query.SortDirection.DESCENDING)
 	def preparedQuery = datastore.prepare(query)
 	def urls = preparedQuery.asList( withLimit(100) )
 	
 	request.setAttribute "urls", urls 	
 	
 	forward "list.gtpl"
 	