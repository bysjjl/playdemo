
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object file extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
	
	<meta charset="utf-8">
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	

	"""),_display_(Seq[Any](/*10.3*/css())),format.raw/*10.8*/("""
		
</head>

<body>
		<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			
			"""),_display_(Seq[Any](/*19.5*/top())),format.raw/*19.10*/("""
		</div>
	</div>
	<!-- topbar ends -->
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					"""),_display_(Seq[Any](/*29.7*/menu())),format.raw/*29.13*/("""
				</div><!--/.well -->
			</div><!--/span-->
			<!-- left menu ends -->
			
			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
				</div>
			</noscript>
			
			<div id="content" class="span10">
			<!-- content starts -->
			
			<div>
				<ul class="breadcrumb">
					<li>
						<a href="#">Home</a> <span class="divider">/</span>
					</li>
					<li>
						<a href="#">File Manager</a>
					</li>
				</ul>
			</div>

			<div class="row-fluid sortable">
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-picture"></i> File Manager</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div class="alert alert-info">
							<button type="button" class="close" data-dismiss="alert">×</button>
							<i class="icon-info-sign"></i> As its a demo, you currently have read-only permission, in your server you may do everything like, upload or delete. It will work on a server only.
						</div>
						<div class="file-manager"></div>
					</div>
				</div><!--/span-->
			
			</div><!--/row-->

		
					<!-- content ends -->
			</div><!--/#content.span10-->
				</div><!--/fluid-row-->
				
		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>

		<footer>
			"""),_display_(Seq[Any](/*98.5*/foot())),format.raw/*98.11*/("""
		</footer>
		
	</div><!--/.fluid-container-->

	"""),_display_(Seq[Any](/*103.3*/script())),format.raw/*103.11*/(""";
	
		
</body>
</html>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 14:57:06 CST 2013
                    SOURCE: H:/play/play2/demoplay/app/views/file.scala.html
                    HASH: cbff51f739cac1ff6ff4d9bd70e41bfc364d57b5
                    MATRIX: 818->0|1022->169|1048->174|1196->287|1223->292|1492->526|1520->532|3708->2685|3736->2691|3828->2747|3859->2755
                    LINES: 30->1|39->10|39->10|48->19|48->19|58->29|58->29|127->98|127->98|132->103|132->103
                    -- GENERATED --
                */
            