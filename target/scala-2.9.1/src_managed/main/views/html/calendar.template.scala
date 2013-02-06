
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
object calendar extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title></title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	

	"""),_display_(Seq[Any](/*9.3*/css())),format.raw/*9.8*/("""
		
</head>

<body>
		<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			"""),_display_(Seq[Any](/*17.5*/top())),format.raw/*17.10*/("""
		</div>
	</div>
	<!-- topbar ends -->
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					"""),_display_(Seq[Any](/*27.7*/menu())),format.raw/*27.13*/("""
					<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox"> Ajax on menu</label>
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
						<a href="#">Calendar</a>
					</li>
				</ul>
			</div>

			<div class="row-fluid sortable">
				<div class="box span12">
				  <div class="box-header well" data-original-title>
					  <h2><i class="icon-calendar"></i>Calendar</h2>
					  <div class="box-icon">
						  <a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
						  <a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
						  <a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
				  </div>
				  <div class="box-content">
					<div id="external-events" class="well">
						<h4>Draggable Events</h4>
						<div class="external-event badge">Default</div>
						<div class="external-event badge badge-success">Completed</div>
						<div class="external-event badge badge-warning">Warning</div>
						<div class="external-event badge badge-important">Important</div>
						<div class="external-event badge badge-info">Info</div>
						<div class="external-event badge badge-inverse">Other</div>
						<p>
						<label for="drop-remove"><input type="checkbox" id="drop-remove" /> remove after drop</label>
						</p>
						</div>

						<div id="calendar"></div>

						<div class="clearfix"></div>
					</div>
				</div>
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
			"""),_display_(Seq[Any](/*106.5*/foot())),format.raw/*106.11*/("""
		</footer>
		
	</div><!--/.fluid-container-->

	"""),_display_(Seq[Any](/*111.3*/script())),format.raw/*111.11*/("""
	
		
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
                    SOURCE: H:/play/play2/demoplay/app/views/calendar.scala.html
                    HASH: 0ad44bfe0ce2cd84945bac17a400c2197c14d7ad
                    MATRIX: 822->0|1022->166|1047->171|1190->279|1217->284|1486->518|1514->524|4141->3115|4170->3121|4262->3177|4293->3185
                    LINES: 30->1|38->9|38->9|46->17|46->17|56->27|56->27|135->106|135->106|140->111|140->111
                    -- GENERATED --
                */
            