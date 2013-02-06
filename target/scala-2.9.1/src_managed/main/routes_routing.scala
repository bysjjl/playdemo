// @SOURCE:H:/play/play2/demoplay/conf/routes
// @HASH:4b7b27f1c4927f47bc074e5c59acb36c47e01b72
// @DATE:Tue Feb 05 14:57:05 CST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/index"))))
                    

// @LINE:7
val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:8
val controllers_Application_grid2 = Route("GET", PathPattern(List(StaticPart("/grid"))))
                    

// @LINE:9
val controllers_Application_table3 = Route("GET", PathPattern(List(StaticPart("/table"))))
                    

// @LINE:10
val controllers_Application_css4 = Route("GET", PathPattern(List(StaticPart("/css"))))
                    

// @LINE:11
val controllers_Application_script5 = Route("GET", PathPattern(List(StaticPart("/script"))))
                    

// @LINE:12
val controllers_Application_menu6 = Route("GET", PathPattern(List(StaticPart("/menu"))))
                    

// @LINE:13
val controllers_Application_top7 = Route("GET", PathPattern(List(StaticPart("/top"))))
                    

// @LINE:14
val controllers_Application_foot8 = Route("GET", PathPattern(List(StaticPart("/foot"))))
                    

// @LINE:16
val controllers_Application_qlist9 = Route("GET", PathPattern(List(StaticPart("/qlist"))))
                    

// @LINE:17
val controllers_Application_qlistRs10 = Route("GET", PathPattern(List(StaticPart("/qlistRs"))))
                    

// @LINE:18
val controllers_Application_qupdate11 = Route("POST", PathPattern(List(StaticPart("/qupdate"))))
                    

// @LINE:20
val controllers_Application_mform12 = Route("GET", PathPattern(List(StaticPart("/mform"))))
                    

// @LINE:21
val controllers_Application_chart13 = Route("GET", PathPattern(List(StaticPart("/chart"))))
                    

// @LINE:22
val controllers_Application_typography14 = Route("GET", PathPattern(List(StaticPart("/typography"))))
                    

// @LINE:23
val controllers_Application_gallery15 = Route("GET", PathPattern(List(StaticPart("/gallery"))))
                    

// @LINE:24
val controllers_Application_calendar16 = Route("GET", PathPattern(List(StaticPart("/calendar"))))
                    

// @LINE:25
val controllers_Application_file17 = Route("GET", PathPattern(List(StaticPart("/file"))))
                    

// @LINE:26
val controllers_Application_tour18 = Route("GET", PathPattern(List(StaticPart("/tour"))))
                    

// @LINE:27
val controllers_Application_icon19 = Route("GET", PathPattern(List(StaticPart("/icon"))))
                    

// @LINE:28
val controllers_Application_micon20 = Route("GET", PathPattern(List(StaticPart("/micon"))))
                    

// @LINE:29
val controllers_Application_error21 = Route("GET", PathPattern(List(StaticPart("/error"))))
                    

// @LINE:32
val controllers_Assets_at22 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/index""","""controllers.Application.index()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""GET""","""/grid""","""controllers.Application.grid()"""),("""GET""","""/table""","""controllers.Application.table()"""),("""GET""","""/css""","""controllers.Application.css()"""),("""GET""","""/script""","""controllers.Application.script()"""),("""GET""","""/menu""","""controllers.Application.menu()"""),("""GET""","""/top""","""controllers.Application.top()"""),("""GET""","""/foot""","""controllers.Application.foot()"""),("""GET""","""/qlist""","""controllers.Application.qlist()"""),("""GET""","""/qlistRs""","""controllers.Application.qlistRs(page:String, rows:String, sidx:String, sord:String)"""),("""POST""","""/qupdate""","""controllers.Application.qupdate()"""),("""GET""","""/mform""","""controllers.Application.mform()"""),("""GET""","""/chart""","""controllers.Application.chart()"""),("""GET""","""/typography""","""controllers.Application.typography()"""),("""GET""","""/gallery""","""controllers.Application.gallery()"""),("""GET""","""/calendar""","""controllers.Application.calendar()"""),("""GET""","""/file""","""controllers.Application.file()"""),("""GET""","""/tour""","""controllers.Application.tour()"""),("""GET""","""/icon""","""controllers.Application.icon()"""),("""GET""","""/micon""","""controllers.Application.micon()"""),("""GET""","""/error""","""controllers.Application.error()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_grid2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.grid(), HandlerDef(this, "controllers.Application", "grid", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_table3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.table(), HandlerDef(this, "controllers.Application", "table", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_css4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.css(), HandlerDef(this, "controllers.Application", "css", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_script5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.script(), HandlerDef(this, "controllers.Application", "script", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_menu6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.menu(), HandlerDef(this, "controllers.Application", "menu", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_top7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.top(), HandlerDef(this, "controllers.Application", "top", Nil))
   }
}
                    

// @LINE:14
case controllers_Application_foot8(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.foot(), HandlerDef(this, "controllers.Application", "foot", Nil))
   }
}
                    

// @LINE:16
case controllers_Application_qlist9(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.qlist(), HandlerDef(this, "controllers.Application", "qlist", Nil))
   }
}
                    

// @LINE:17
case controllers_Application_qlistRs10(params) => {
   call(params.fromQuery[String]("page", None), params.fromQuery[String]("rows", None), params.fromQuery[String]("sidx", None), params.fromQuery[String]("sord", None)) { (page, rows, sidx, sord) =>
        invokeHandler(_root_.controllers.Application.qlistRs(page, rows, sidx, sord), HandlerDef(this, "controllers.Application", "qlistRs", Seq(classOf[String], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:18
case controllers_Application_qupdate11(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.qupdate(), HandlerDef(this, "controllers.Application", "qupdate", Nil))
   }
}
                    

// @LINE:20
case controllers_Application_mform12(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.mform(), HandlerDef(this, "controllers.Application", "mform", Nil))
   }
}
                    

// @LINE:21
case controllers_Application_chart13(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.chart(), HandlerDef(this, "controllers.Application", "chart", Nil))
   }
}
                    

// @LINE:22
case controllers_Application_typography14(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.typography(), HandlerDef(this, "controllers.Application", "typography", Nil))
   }
}
                    

// @LINE:23
case controllers_Application_gallery15(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.gallery(), HandlerDef(this, "controllers.Application", "gallery", Nil))
   }
}
                    

// @LINE:24
case controllers_Application_calendar16(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.calendar(), HandlerDef(this, "controllers.Application", "calendar", Nil))
   }
}
                    

// @LINE:25
case controllers_Application_file17(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.file(), HandlerDef(this, "controllers.Application", "file", Nil))
   }
}
                    

// @LINE:26
case controllers_Application_tour18(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.tour(), HandlerDef(this, "controllers.Application", "tour", Nil))
   }
}
                    

// @LINE:27
case controllers_Application_icon19(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.icon(), HandlerDef(this, "controllers.Application", "icon", Nil))
   }
}
                    

// @LINE:28
case controllers_Application_micon20(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.micon(), HandlerDef(this, "controllers.Application", "micon", Nil))
   }
}
                    

// @LINE:29
case controllers_Application_error21(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.error(), HandlerDef(this, "controllers.Application", "error", Nil))
   }
}
                    

// @LINE:32
case controllers_Assets_at22(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                