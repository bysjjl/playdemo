
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
object table extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[SqlRow],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(rs : List[SqlRow]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Free HTML5 Bootstrap Admin Template</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
	<meta name="author" content="Muhammad Usman">

	
	"""),_display_(Seq[Any](/*12.3*/css())),format.raw/*12.8*/("""
		
		
</head>

<body>
		<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			"""),_display_(Seq[Any](/*21.5*/top())),format.raw/*21.10*/("""
		</div>
	</div>
	<!-- topbar ends -->
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span" >
				<div class="well nav-collapse sidebar-nav">
					"""),_display_(Seq[Any](/*31.7*/menu())),format.raw/*31.13*/("""
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
						<a href="#">Tables</a>
					</li>
				</ul>
			</div>
			
			<div class="row-fluid sortable">		
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-user"></i> Members</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-striped table-bordered bootstrap-datatable datatable">
						  <thead>
							  <tr>
								  <th>用户名</th>
								  <th>创建日期</th>
								  <th>性别</th>
								  <th>用户编码</th>
								  <th>Actions</th>
							  </tr>
						  </thead>   
						  <tbody>
							<tr>
							  """),_display_(Seq[Any](/*83.11*/for(row <- rs) yield /*83.25*/ {_display_(Seq[Any](format.raw/*83.27*/("""
								<td>"""),_display_(Seq[Any](/*84.14*/row("name"))),format.raw/*84.25*/("""</td>
								<td class="center">"""),_display_(Seq[Any](/*85.29*/row("created_datetime"))),format.raw/*85.52*/("""</td>
								<td class="center">"""),_display_(Seq[Any](/*86.29*/row("sex"))),format.raw/*86.39*/("""</td>
								<td class="center">
									"""),_display_(Seq[Any](/*88.11*/row("user_code"))),format.raw/*88.27*/("""
								</td>
								<td class="center">
									<a class="btn btn-success" href="#">
										<i class="icon-zoom-in icon-white"></i>  
										View                                            
									</a>
									<a class="btn btn-info" href="#">
										<i class="icon-edit icon-white"></i>  
										Edit                                            
									</a>
									<a class="btn btn-danger" href="#">
										<i class="icon-trash icon-white"></i> 
										Delete
									</a>
								</td>
							</tr>
				
							""")))})),format.raw/*106.9*/("""
						  </tbody>
					  </table>            
					</div>
				</div><!--/span-->
			
			</div><!--/row-->

			<div class="row-fluid sortable">
				<div class="box span6">
					<div class="box-header well" data-original-title>
						<h2>Simple Table</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table">
							  <thead>
								  <tr>
									  <th>Username</th>
									  <th>Date registered</th>
									  <th>Role</th>
									  <th>Status</th>                                          
								  </tr>
							  </thead>   
							  <tbody>
							  <tr>
						   """),_display_(Seq[Any](/*136.11*/for(row <- rs) yield /*136.25*/ {_display_(Seq[Any](format.raw/*136.27*/("""
								<td>"""),_display_(Seq[Any](/*137.14*/row("name"))),format.raw/*137.25*/("""</td>
								<td class="center">"""),_display_(Seq[Any](/*138.29*/row("created_datetime"))),format.raw/*138.52*/("""</td>
								<td class="center">"""),_display_(Seq[Any](/*139.29*/row("sex"))),format.raw/*139.39*/("""</td>
								<td class="center">
									"""),_display_(Seq[Any](/*141.11*/row("user_code"))),format.raw/*141.27*/("""
								</td>
								<td class="center">
									<a class="btn btn-success" href="#">
										<i class="icon-zoom-in icon-white"></i>  
										View                                            
									</a>
									<a class="btn btn-info" href="#">
										<i class="icon-edit icon-white"></i>  
										Edit                                            
									</a>
									<a class="btn btn-danger" href="#">
										<i class="icon-trash icon-white"></i> 
										Delete
									</a>
								</td>
							</tr>
				
							""")))})),format.raw/*159.9*/("""                                 
							  </tbody>
						 </table>  
						 <div class="pagination pagination-centered">
						  <ul>
							<li><a href="#" >Prev</a></li>
							<li class="active">
							  <a href="#">1</a>
							</li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">Next</a></li>
						  </ul>
						</div>     
					</div>
				</div><!--/span-->
				
				<div class="box span6">
					<div class="box-header well" data-original-title>
						<h2>Striped Table</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-striped">
							  <thead>
								  <tr>
									  <th>Username</th>
									  <th>Date registered</th>
									  <th>Role</th>
									  <th>Status</th>                                          
								  </tr>
							  </thead>   
							  <tbody>
								<tr>
									<td>Muhammad Usman</td>
									<td class="center">2012/01/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                       
								</tr>
								<tr>
									<td>White Horse</td>
									<td class="center">2012/02/01</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-important">Banned</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sheikh Heera</td>
									<td class="center">2012/02/01</td>
									<td class="center">Admin</td>
									<td class="center">
										<span class="label">Inactive</span>
									</td>                                        
								</tr>
								<tr>
									<td>Saruar</td>
									<td class="center">2012/03/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-warning">Pending</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sana Amrin</td>
									<td class="center">2012/01/21</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                        
								</tr>                                   
							  </tbody>
						 </table>  
						 <div class="pagination pagination-centered">
						  <ul>
							<li><a href="#">Prev</a></li>
							<li class="active">
							  <a href="#">1</a>
							</li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">Next</a></li>
						  </ul>
						</div>     
					</div>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid sortable">	
				<div class="box span6">
					<div class="box-header well" data-original-title>
						<h2>Bordered Table</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-bordered">
							  <thead>
								  <tr>
									  <th>Username</th>
									  <th>Date registered</th>
									  <th>Role</th>
									  <th>Status</th>                                          
								  </tr>
							  </thead>   
							  <tbody>
								<tr>
									<td>Muhammad Usman</td>
									<td class="center">2012/01/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                       
								</tr>
								<tr>
									<td>White Horse</td>
									<td class="center">2012/02/01</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-important">Banned</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sheikh Heera</td>
									<td class="center">2012/02/01</td>
									<td class="center">Admin</td>
									<td class="center">
										<span class="label">Inactive</span>
									</td>                                        
								</tr>
								<tr>
									<td>Saruar</td>
									<td class="center">2012/03/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-warning">Pending</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sana Amrin</td>
									<td class="center">2012/01/21</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                        
								</tr>                                   
							  </tbody>
						 </table>  
						 <div class="pagination pagination-centered">
						  <ul>
							<li><a href="#">Prev</a></li>
							<li class="active">
							  <a href="#">1</a>
							</li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">Next</a></li>
						  </ul>
						</div>     
					</div>
				</div><!--/span-->
				
				<div class="box span6">
					<div class="box-header well" data-original-title>
						<h2>Condensed Table</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-condensed">
							  <thead>
								  <tr>
									  <th>Username</th>
									  <th>Date registered</th>
									  <th>Role</th>
									  <th>Status</th>                                          
								  </tr>
							  </thead>   
							  <tbody>
								<tr>
									<td>Muhammad Usman</td>
									<td class="center">2012/01/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                       
								</tr>
								<tr>
									<td>White Horse</td>
									<td class="center">2012/02/01</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-important">Banned</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sheikh Heera</td>
									<td class="center">2012/02/01</td>
									<td class="center">Admin</td>
									<td class="center">
										<span class="label">Inactive</span>
									</td>                                        
								</tr>
								<tr>
									<td>Saruar</td>
									<td class="center">2012/03/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-warning">Pending</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sana Amrin</td>
									<td class="center">2012/01/21</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                        
								</tr>                                   
							  </tbody>
						 </table>  
						 <div class="pagination pagination-centered">
						  <ul>
							<li><a href="#">Prev</a></li>
							<li class="active">
							  <a href="#">1</a>
							</li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">Next</a></li>
						  </ul>
						</div>     
					</div>
				</div><!--/span-->
			
			</div><!--/row-->
			
			<div class="row-fluid sortable">	
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2>Combined All</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-bordered table-striped table-condensed">
							  <thead>
								  <tr>
									  <th>Username</th>
									  <th>Date registered</th>
									  <th>Role</th>
									  <th>Status</th>                                          
								  </tr>
							  </thead>   
							  <tbody>
								<tr>
									<td>Muhammad Usman</td>
									<td class="center">2012/01/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                       
								</tr>
								<tr>
									<td>White Horse</td>
									<td class="center">2012/02/01</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-important">Banned</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sheikh Heera</td>
									<td class="center">2012/02/01</td>
									<td class="center">Admin</td>
									<td class="center">
										<span class="label">Inactive</span>
									</td>                                        
								</tr>
								<tr>
									<td>Saruar</td>
									<td class="center">2012/03/01</td>
									<td class="center">Member</td>
									<td class="center">
										<span class="label label-warning">Pending</span>
									</td>                                       
								</tr>
								<tr>
									<td>Sana Amrin</td>
									<td class="center">2012/01/21</td>
									<td class="center">Staff</td>
									<td class="center">
										<span class="label label-success">Active</span>
									</td>                                        
								</tr>                                   
							  </tbody>
						 </table>  
						 <div class="pagination pagination-centered">
						  <ul>
							<li><a href="#">Prev</a></li>
							<li class="active">
							  <a href="#">1</a>
							</li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">Next</a></li>
						  </ul>
						</div>     
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
			"""),_display_(Seq[Any](/*512.5*/foot())),format.raw/*512.11*/("""
		</footer>
		
	</div><!--/.fluid-container-->

	"""),_display_(Seq[Any](/*517.3*/script())),format.raw/*517.11*/("""
		
</body>
</html>
"""))}
    }
    
    def render(rs:List[SqlRow]) = apply(rs)
    
    def f:((List[SqlRow]) => play.api.templates.Html) = (rs) => apply(rs)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 14:57:06 CST 2013
                    SOURCE: H:/play/play2/demoplay/app/views/table.scala.html
                    HASH: 02de97b4d06189988d1bf575c86f6338dcb17c83
                    MATRIX: 761->1|857->20|1254->382|1280->387|1427->499|1454->504|1724->739|1752->745|3275->2232|3305->2246|3345->2248|3396->2263|3429->2274|3500->2309|3545->2332|3616->2367|3648->2377|3730->2423|3768->2439|4362->3001|5320->3922|5351->3936|5392->3938|5444->3953|5478->3964|5550->3999|5596->4022|5668->4057|5701->4067|5784->4113|5823->4129|6417->4691|18330->16568|18359->16574|18451->16630|18482->16638
                    LINES: 27->1|30->1|41->12|41->12|50->21|50->21|60->31|60->31|112->83|112->83|112->83|113->84|113->84|114->85|114->85|115->86|115->86|117->88|117->88|135->106|165->136|165->136|165->136|166->137|166->137|167->138|167->138|168->139|168->139|170->141|170->141|188->159|541->512|541->512|546->517|546->517
                    -- GENERATED --
                */
            