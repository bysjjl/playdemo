// @SOURCE:H:/play/play2/demoplay/conf/routes
// @HASH:4b7b27f1c4927f47bc074e5c59acb36c47e01b72
// @DATE:Tue Feb 05 14:57:05 CST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def css() = {
   Call("GET", "/css")
}
                                                        
 
// @LINE:22
def typography() = {
   Call("GET", "/typography")
}
                                                        
 
// @LINE:29
def error() = {
   Call("GET", "/error")
}
                                                        
 
// @LINE:7
def login() = {
   Call("GET", "/login")
}
                                                        
 
// @LINE:12
def menu() = {
   Call("GET", "/menu")
}
                                                        
 
// @LINE:21
def chart() = {
   Call("GET", "/chart")
}
                                                        
 
// @LINE:18
def qupdate() = {
   Call("POST", "/qupdate")
}
                                                        
 
// @LINE:13
def top() = {
   Call("GET", "/top")
}
                                                        
 
// @LINE:8
def grid() = {
   Call("GET", "/grid")
}
                                                        
 
// @LINE:9
def table() = {
   Call("GET", "/table")
}
                                                        
 
// @LINE:28
def micon() = {
   Call("GET", "/micon")
}
                                                        
 
// @LINE:24
def calendar() = {
   Call("GET", "/calendar")
}
                                                        
 
// @LINE:23
def gallery() = {
   Call("GET", "/gallery")
}
                                                        
 
// @LINE:16
def qlist() = {
   Call("GET", "/qlist")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/index")
}
                                                        
 
// @LINE:26
def tour() = {
   Call("GET", "/tour")
}
                                                        
 
// @LINE:25
def file() = {
   Call("GET", "/file")
}
                                                        
 
// @LINE:20
def mform() = {
   Call("GET", "/mform")
}
                                                        
 
// @LINE:27
def icon() = {
   Call("GET", "/icon")
}
                                                        
 
// @LINE:14
def foot() = {
   Call("GET", "/foot")
}
                                                        
 
// @LINE:17
def qlistRs(page:String, rows:String, sidx:String, sord:String) = {
   Call("GET", "/qlistRs" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("page", page)), Some(implicitly[QueryStringBindable[String]].unbind("rows", rows)), Some(implicitly[QueryStringBindable[String]].unbind("sidx", sidx)), Some(implicitly[QueryStringBindable[String]].unbind("sord", sord)))))
}
                                                        
 
// @LINE:11
def script() = {
   Call("GET", "/script")
}
                                                        

                      
    
}
                            

// @LINE:32
class ReverseAssets {
    


 
// @LINE:32
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def css = JavascriptReverseRoute(
   "controllers.Application.css",
   """
      function() {
      return _wA({method:"GET", url:"/css"})
      }
   """
)
                                                        
 
// @LINE:22
def typography = JavascriptReverseRoute(
   "controllers.Application.typography",
   """
      function() {
      return _wA({method:"GET", url:"/typography"})
      }
   """
)
                                                        
 
// @LINE:29
def error = JavascriptReverseRoute(
   "controllers.Application.error",
   """
      function() {
      return _wA({method:"GET", url:"/error"})
      }
   """
)
                                                        
 
// @LINE:7
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:12
def menu = JavascriptReverseRoute(
   "controllers.Application.menu",
   """
      function() {
      return _wA({method:"GET", url:"/menu"})
      }
   """
)
                                                        
 
// @LINE:21
def chart = JavascriptReverseRoute(
   "controllers.Application.chart",
   """
      function() {
      return _wA({method:"GET", url:"/chart"})
      }
   """
)
                                                        
 
// @LINE:18
def qupdate = JavascriptReverseRoute(
   "controllers.Application.qupdate",
   """
      function() {
      return _wA({method:"POST", url:"/qupdate"})
      }
   """
)
                                                        
 
// @LINE:13
def top = JavascriptReverseRoute(
   "controllers.Application.top",
   """
      function() {
      return _wA({method:"GET", url:"/top"})
      }
   """
)
                                                        
 
// @LINE:8
def grid = JavascriptReverseRoute(
   "controllers.Application.grid",
   """
      function() {
      return _wA({method:"GET", url:"/grid"})
      }
   """
)
                                                        
 
// @LINE:9
def table = JavascriptReverseRoute(
   "controllers.Application.table",
   """
      function() {
      return _wA({method:"GET", url:"/table"})
      }
   """
)
                                                        
 
// @LINE:28
def micon = JavascriptReverseRoute(
   "controllers.Application.micon",
   """
      function() {
      return _wA({method:"GET", url:"/micon"})
      }
   """
)
                                                        
 
// @LINE:24
def calendar = JavascriptReverseRoute(
   "controllers.Application.calendar",
   """
      function() {
      return _wA({method:"GET", url:"/calendar"})
      }
   """
)
                                                        
 
// @LINE:23
def gallery = JavascriptReverseRoute(
   "controllers.Application.gallery",
   """
      function() {
      return _wA({method:"GET", url:"/gallery"})
      }
   """
)
                                                        
 
// @LINE:16
def qlist = JavascriptReverseRoute(
   "controllers.Application.qlist",
   """
      function() {
      return _wA({method:"GET", url:"/qlist"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/index"})
      }
   """
)
                                                        
 
// @LINE:26
def tour = JavascriptReverseRoute(
   "controllers.Application.tour",
   """
      function() {
      return _wA({method:"GET", url:"/tour"})
      }
   """
)
                                                        
 
// @LINE:25
def file = JavascriptReverseRoute(
   "controllers.Application.file",
   """
      function() {
      return _wA({method:"GET", url:"/file"})
      }
   """
)
                                                        
 
// @LINE:20
def mform = JavascriptReverseRoute(
   "controllers.Application.mform",
   """
      function() {
      return _wA({method:"GET", url:"/mform"})
      }
   """
)
                                                        
 
// @LINE:27
def icon = JavascriptReverseRoute(
   "controllers.Application.icon",
   """
      function() {
      return _wA({method:"GET", url:"/icon"})
      }
   """
)
                                                        
 
// @LINE:14
def foot = JavascriptReverseRoute(
   "controllers.Application.foot",
   """
      function() {
      return _wA({method:"GET", url:"/foot"})
      }
   """
)
                                                        
 
// @LINE:17
def qlistRs = JavascriptReverseRoute(
   "controllers.Application.qlistRs",
   """
      function(page,rows,sidx,sord) {
      return _wA({method:"GET", url:"/qlistRs" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("page", page), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("rows", rows), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sidx", sidx), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sord", sord)])})
      }
   """
)
                                                        
 
// @LINE:11
def script = JavascriptReverseRoute(
   "controllers.Application.script",
   """
      function() {
      return _wA({method:"GET", url:"/script"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:32
class ReverseAssets {
    


 
// @LINE:32
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def css() = new play.api.mvc.HandlerRef(
   controllers.Application.css(), HandlerDef(this, "controllers.Application", "css", Seq())
)
                              
 
// @LINE:22
def typography() = new play.api.mvc.HandlerRef(
   controllers.Application.typography(), HandlerDef(this, "controllers.Application", "typography", Seq())
)
                              
 
// @LINE:29
def error() = new play.api.mvc.HandlerRef(
   controllers.Application.error(), HandlerDef(this, "controllers.Application", "error", Seq())
)
                              
 
// @LINE:7
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:12
def menu() = new play.api.mvc.HandlerRef(
   controllers.Application.menu(), HandlerDef(this, "controllers.Application", "menu", Seq())
)
                              
 
// @LINE:21
def chart() = new play.api.mvc.HandlerRef(
   controllers.Application.chart(), HandlerDef(this, "controllers.Application", "chart", Seq())
)
                              
 
// @LINE:18
def qupdate() = new play.api.mvc.HandlerRef(
   controllers.Application.qupdate(), HandlerDef(this, "controllers.Application", "qupdate", Seq())
)
                              
 
// @LINE:13
def top() = new play.api.mvc.HandlerRef(
   controllers.Application.top(), HandlerDef(this, "controllers.Application", "top", Seq())
)
                              
 
// @LINE:8
def grid() = new play.api.mvc.HandlerRef(
   controllers.Application.grid(), HandlerDef(this, "controllers.Application", "grid", Seq())
)
                              
 
// @LINE:9
def table() = new play.api.mvc.HandlerRef(
   controllers.Application.table(), HandlerDef(this, "controllers.Application", "table", Seq())
)
                              
 
// @LINE:28
def micon() = new play.api.mvc.HandlerRef(
   controllers.Application.micon(), HandlerDef(this, "controllers.Application", "micon", Seq())
)
                              
 
// @LINE:24
def calendar() = new play.api.mvc.HandlerRef(
   controllers.Application.calendar(), HandlerDef(this, "controllers.Application", "calendar", Seq())
)
                              
 
// @LINE:23
def gallery() = new play.api.mvc.HandlerRef(
   controllers.Application.gallery(), HandlerDef(this, "controllers.Application", "gallery", Seq())
)
                              
 
// @LINE:16
def qlist() = new play.api.mvc.HandlerRef(
   controllers.Application.qlist(), HandlerDef(this, "controllers.Application", "qlist", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:26
def tour() = new play.api.mvc.HandlerRef(
   controllers.Application.tour(), HandlerDef(this, "controllers.Application", "tour", Seq())
)
                              
 
// @LINE:25
def file() = new play.api.mvc.HandlerRef(
   controllers.Application.file(), HandlerDef(this, "controllers.Application", "file", Seq())
)
                              
 
// @LINE:20
def mform() = new play.api.mvc.HandlerRef(
   controllers.Application.mform(), HandlerDef(this, "controllers.Application", "mform", Seq())
)
                              
 
// @LINE:27
def icon() = new play.api.mvc.HandlerRef(
   controllers.Application.icon(), HandlerDef(this, "controllers.Application", "icon", Seq())
)
                              
 
// @LINE:14
def foot() = new play.api.mvc.HandlerRef(
   controllers.Application.foot(), HandlerDef(this, "controllers.Application", "foot", Seq())
)
                              
 
// @LINE:17
def qlistRs(page:String, rows:String, sidx:String, sord:String) = new play.api.mvc.HandlerRef(
   controllers.Application.qlistRs(page, rows, sidx, sord), HandlerDef(this, "controllers.Application", "qlistRs", Seq(classOf[String], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:11
def script() = new play.api.mvc.HandlerRef(
   controllers.Application.script(), HandlerDef(this, "controllers.Application", "script", Seq())
)
                              

                      
    
}
                            

// @LINE:32
class ReverseAssets {
    


 
// @LINE:32
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                