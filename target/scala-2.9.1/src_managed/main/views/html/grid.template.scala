
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
object grid extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
	
	<meta charset="utf-8">
	<title>Free HTML5 Bootstrap Admin Template</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
	<meta name="author" content="Muhammad Usman">

	"""),_display_(Seq[Any](/*13.3*/css())),format.raw/*13.8*/("""
			
</head>

<body>
		<!-- topbar starts -->
	<div class="navbar">
		"""),_display_(Seq[Any](/*20.4*/top())),format.raw/*20.9*/("""
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
						<a href="#">Grid</a>
					</li>
				</ul>
			</div>

			<div class="row-fluid sortable">
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 12</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid sortable">
				<div class="box span3">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 3</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
				<div class="box span3">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 3</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
				<div class="box span3">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 3</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
				<div class="box span3">
					<div class="box-header well" data-original-title>
						<h2>Plain</h2>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid sortable">
				<div class="box span6">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 6</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
				
				<div class="box span6">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 6</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
			</div><!--/row-->
			<div class="row-fluid sortable">
				<div class="box span4">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 4</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
				
				<div class="box span4">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 4</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
				
				<div class="box span4">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-th"></i> Grid 4</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
                  	<div class="row-fluid">
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                        <div class="span4"><h6>span 4</h6></div>
                    </div>                   
                  </div>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid">
				<div class="span12 well">
					<div>
						<h1>Box less area</h1>
						<p>The flat boxes can be created using grids. But you can also use grids inside grids, which makes the layout 100% flexible!</p>
					</div>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid show-grid">
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
				<div class="span1">1</div>
			</div>
			
			<div class="row-fluid show-grid">
				<div class="span4">4</div>
				<div class="span4">4</div>
				<div class="span4">4</div>
			</div>
			
			<div class="row-fluid show-grid">
				<div class="span3">3</div>
				<div class="span3">3</div>
				<div class="span3">3</div>
				<div class="span3">3</div>
			</div>
			
			<div class="row-fluid show-grid">
				<div class="span4">4</div>
				<div class="span8">8</div>
			</div>
			
			<div class="row-fluid show-grid">
				<div class="span6">6</div>
				<div class="span6">6</div>
			</div>
			
			<div class="row-fluid show-grid">
				<div class="span12">12</div>
			</div>

    
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
			"""),_display_(Seq[Any](/*302.5*/foot())),format.raw/*302.11*/("""
		</footer>
		
	</div><!--/.fluid-container-->

	"""),_display_(Seq[Any](/*307.3*/script())),format.raw/*307.11*/("""
	
		
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
                    SOURCE: H:/play/play2/demoplay/app/views/grid.scala.html
                    HASH: ad88ccddb9a0f96eaf074af206eefccf4459b6d4
                    MATRIX: 818->4|1213->364|1239->369|1352->447|1378->452|1637->676|1665->682|11895->10876|11924->10882|12016->10938|12047->10946
                    LINES: 30->3|40->13|40->13|47->20|47->20|56->29|56->29|329->302|329->302|334->307|334->307
                    -- GENERATED --
                */
            