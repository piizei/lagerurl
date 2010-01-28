import com.google.appengine.api.datastore.Entity

//println "thanks"

//println "$params.by: <a href=\"$params.url\">$params.url</a> $params.desc"

def url = new Entity("url")
url.url = params.url
url.desc = params.desc
url.by = params.by
url.date = new Date()

url.save()