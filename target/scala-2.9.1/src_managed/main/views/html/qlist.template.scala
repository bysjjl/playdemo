
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
object qlist extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*10.63*/routes/*10.69*/.Assets.at("moudle/jqgrid/css/ui.jqgrid.css"))),format.raw/*10.114*/("""" />	
		
</head>

<body>
		<!-- topbar starts -->
	<div class="navbar">
		<div class="navbar-inner">
			"""),_display_(Seq[Any](/*18.5*/top())),format.raw/*18.10*/("""
		</div>
	</div>
	<!-- topbar ends -->
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span" >
				<div class="well nav-collapse sidebar-nav">
					"""),_display_(Seq[Any](/*28.7*/menu())),format.raw/*28.13*/("""
				</div><!--/.well -->
			</div><!--/span-->
			<!-- left menu ends -->
			
			
			
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
						<h2><i class="icon-user"></i> JqGrid</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table id="listcsc" ></table>
                        <div id="pagercsc"></div>          
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
			"""),_display_(Seq[Any](/*99.5*/foot())),format.raw/*99.11*/("""
		</footer>
		
	</div><!--/.fluid-container-->

	"""),_display_(Seq[Any](/*104.3*/script())),format.raw/*104.11*/("""
	<script src=""""),_display_(Seq[Any](/*105.16*/routes/*105.22*/.Assets.at("moudle/jqgrid/js/i18n/grid.locale-en.js"))),format.raw/*105.75*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*106.19*/routes/*106.25*/.Assets.at("moudle/jqgrid/js/jquery.jqGrid.min.js"))),format.raw/*106.76*/("""" type="text/javascript"></script>


    <script>
    
    		
  		  
    		
		    jQuery("#listcsc").jqGrid("""),format.raw("""{"""),format.raw/*114.34*/("""
		    	
			   	url:'/qlistRs',
				datatype: "json",
				ajaxRowOptions:  """),format.raw("""{"""),format.raw/*118.23*/(""" async: true """),format.raw("""}"""),format.raw/*118.37*/(""",
			   	colNames:[' ','id','用户名','用户编码', '性别', '创建日期'],
			   	colModel:[
					"""),format.raw("""{"""),format.raw/*121.7*/("""name: 'myac', width:80, fixed:true, sortable:false, resize:false, formatter:'actions',
						formatoptions:"""),format.raw("""{"""),format.raw/*122.22*/("""keys:true"""),format.raw("""}"""),format.raw("""}"""),format.raw/*122.33*/(""",
					"""),format.raw("""{"""),format.raw/*123.7*/("""name:'cp_employee_id',index:'cp_employee_id' ,editoptions:"""),format.raw("""{"""),format.raw("""}"""),format.raw/*123.67*/(""",editable:false,editrules:"""),format.raw("""{"""),format.raw/*123.94*/("""required:true"""),format.raw("""}"""),format.raw("""}"""),format.raw/*123.109*/(""",					
			   		"""),format.raw("""{"""),format.raw/*124.10*/("""name:'name',index:'user_code',editable:true,editrules:"""),format.raw("""{"""),format.raw/*124.65*/("""required:true"""),format.raw("""}"""),format.raw("""}"""),format.raw/*124.80*/(""",
			   		"""),format.raw("""{"""),format.raw/*125.10*/("""name:'user_code',index:'name',editable:true,editrules:"""),format.raw("""{"""),format.raw/*125.65*/("""required:true"""),format.raw("""}"""),format.raw("""}"""),format.raw/*125.80*/(""",
			   		"""),format.raw("""{"""),format.raw/*126.10*/("""name:'sex',index:'sex',editable:true,editrules:"""),format.raw("""{"""),format.raw/*126.58*/("""required:true"""),format.raw("""}"""),format.raw("""}"""),format.raw/*126.73*/(""",
			   		"""),format.raw("""{"""),format.raw/*127.10*/("""name:'created_datetime',index:'created_datetime',width:200,editable:true ,editoptions:"""),format.raw("""{"""),format.raw/*127.97*/("""
						dataInit:function(el)"""),format.raw("""{"""),format.raw/*128.29*/("""
							$(el).datepicker("""),format.raw("""{"""),format.raw/*129.26*/("""dateFormat:'yy-mm-dd'"""),format.raw("""}"""),format.raw/*129.48*/(""");
						"""),format.raw("""}"""),format.raw/*130.8*/(""" 
			   		"""),format.raw("""}"""),format.raw("""}"""),format.raw/*131.11*/("""
			   			
			   	],
			   	multiselect: true,
			   	height:'100%',
			   	rowNum:10,
			   	rowList:[10,20,30],
			   	pager: '#pagercsc',
			   	sortname: 'name',
			    viewrecords: true,
			    sortorder: "asc",
			    caption:"Csc JSON Example",
			    editurl:"/qupdate",
			    rownumbers: true

			    
			    
			"""),format.raw("""}"""),format.raw/*148.5*/(""");
		   jQuery("#listcsc").jqGrid(
			   'navGrid','#pagercsc',
			   """),format.raw("""{"""),format.raw("""}"""),format.raw/*151.9*/(""",
			   """),format.raw("""{"""),format.raw/*152.8*/("""reloadAfterSubmit:true,closeAfterEdit : true"""),format.raw("""}"""),format.raw/*152.53*/(""", // edit options
			   """),format.raw("""{"""),format.raw/*153.8*/("""reloadAfterSubmit:true,closeAfterAdd : true"""),format.raw("""}"""),format.raw/*153.52*/(""", // add options
			   """),format.raw("""{"""),format.raw/*154.8*/("""reloadAfterSubmit:true"""),format.raw("""}"""),format.raw/*154.31*/(""", // del options
			   """),format.raw("""{"""),format.raw("""}"""),format.raw/*155.9*/(""" // search options
		   );

		  
		   jQuery("#listcsc").jqGrid('setGroupHeaders', """),format.raw("""{"""),format.raw/*159.52*/("""
			   useColSpanStyle: false, 
			   groupHeaders:[
			 	"""),format.raw("""{"""),format.raw/*162.7*/("""startColumnName: 'name', numberOfColumns: 2, titleText: '<em>分组头</em>'"""),format.raw("""}"""),format.raw/*162.78*/(""",
			 	
			   ]	
			 """),format.raw("""}"""),format.raw/*165.6*/(""");



		   
    </script>
		
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
                    SOURCE: H:/play/play2/demoplay/app/views/qlist.scala.html
                    HASH: f685d5fadb0b224f6dfd164160d37a2611480d84
                    MATRIX: 819->0|1020->167|1045->172|1145->236|1160->242|1228->287|1376->400|1403->405|1673->640|1701->646|3394->2304|3422->2310|3514->2366|3545->2374|3599->2391|3615->2397|3691->2450|3782->2504|3798->2510|3872->2561|4037->2678|4165->2758|4227->2772|4358->2856|4515->2965|4593->2976|4649->2985|4776->3045|4851->3072|4934->3087|4999->3104|5102->3159|5184->3174|5244->3186|5347->3241|5429->3256|5489->3268|5585->3316|5667->3331|5727->3343|5862->3430|5940->3460|6015->3487|6085->3509|6143->3520|6223->3533|6611->3874|6752->3949|6809->3959|6902->4004|6975->4030|7067->4074|7139->4099|7210->4122|7302->4148|7438->4236|7547->4298|7666->4369|7738->4394
                    LINES: 30->1|38->9|38->9|39->10|39->10|39->10|47->18|47->18|57->28|57->28|128->99|128->99|133->104|133->104|134->105|134->105|134->105|135->106|135->106|135->106|143->114|147->118|147->118|150->121|151->122|151->122|152->123|152->123|152->123|152->123|153->124|153->124|153->124|154->125|154->125|154->125|155->126|155->126|155->126|156->127|156->127|157->128|158->129|158->129|159->130|160->131|177->148|180->151|181->152|181->152|182->153|182->153|183->154|183->154|184->155|188->159|191->162|191->162|194->165
                    -- GENERATED --
                */
            