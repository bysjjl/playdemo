
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
object typography extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
			"""),_display_(Seq[Any](/*18.5*/top())),format.raw/*18.10*/("""
		</div>
	</div>
	<!-- topbar ends -->
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					"""),_display_(Seq[Any](/*28.7*/menu())),format.raw/*28.13*/("""
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
						<a href="#">Typography</a>
					</li>
				</ul>
			</div>

			<div class="row-fluid sortable">
				<div class="box span9">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-font"></i> Typography</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						  <div class="page-header">
							  <h1>Typography <small>Headings, paragraphs, lists, and other inline type elements</small></h1>
						  </div>     
						  <div class="row-fluid ">            
							  <div class="span4">
								<h3>Sample text and paragraphs</h3>
								<p>
								Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales at. Nulla tellus elit, varius non commodo eget, mattis vel eros. In sed ornare nulla. Donec consectetur, velit a pharetra ultricies, diam lorem lacinia risus, ac commodo orci erat eu massa. Sed sit amet nulla ipsum. Donec felis mauris, vulputate sed tempor at, aliquam a ligula. Pellentesque non pulvinar nisi.
								</p>
								<p>
								Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales at. Nulla tellus elit, varius non commodo eget, mattis vel eros. In sed ornare nulla. Donec consectetur, velit a pharetra ultricies, diam lorem lacinia risus, ac commodo orci erat eu massa. Sed sit amet nulla ipsum. Donec felis mauris, vulputate sed tempor at, aliquam a ligula. Pellentesque non pulvinar nisi.
								</p>
							  </div>
							  <div class="span4">
								<h3>Example body text</h3>
								<p>Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
								<p>Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Donec sed odio dui.</p>
							  </div>
							  <div class="span4 ">
								<div class="well">
								  <h1>h1. Heading 1</h1>
								  <h2>h2. Heading 2</h2>
								  <h3>h3. Heading 3</h3>
								  <h4>h4. Heading 4</h4>
								  <h5>h5. Heading 5</h5>
								  <h6>h6. Heading 6</h6>
								</div>
							  </div>
						  </div><!--/row -->                           
						
						  <div class="row-fluid">
							  <div class="span12">
								  <h3>Example blockquotes</h3>
								  <div class="row-fluid">
									<div class="span6">
									  <p>Default blockquotes are styled as such:</p>
									  <blockquote>
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante venenatis.</p>
										<small>Someone famous in <cite title="">Body of work</cite></small>
									  </blockquote>
									</div>
									<div class="span6">
									  <p>You can always float your blockquote to the right:</p>
									  <blockquote class="pull-right">
										<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante venenatis.</p>
										<small>Someone famous in <cite title="">Body of work</cite></small>
									  </blockquote>
									</div>
								  </div>
							  </div>
						  </div>
						  <div class="row-fluid">
								<div class="span6">
								<h3>More Sample Text</h3>
								<p>
								Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales at. Nulla tellus elit, varius non commodo eget, mattis vel eros. In sed ornare nulla. Donec consectetur, velit a pharetra ultricies, diam lorem lacinia risus, ac commodo orci erat eu massa. Sed sit amet nulla ipsum. Donec felis mauris, vulputate sed tempor at, aliquam a ligula. Pellentesque non pulvinar nisi.
								</p>
								</div>
								<div class="span6">
								<h3>And Paragraphs</h3>
								<p>
								Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales at. Nulla tellus elit, varius non commodo eget, mattis vel eros. In sed ornare nulla. Donec consectetur, velit a pharetra ultricies, diam lorem lacinia risus, ac commodo orci erat eu massa. Sed sit amet nulla ipsum. Donec felis mauris, vulputate sed tempor at, aliquam a ligula. Pellentesque non pulvinar nisi.
								</p>
							  </div>
						  </div>
						  <div class="row-fluid">
							  <div class="span12">
								<h2>Example use of Tooltips</h2>
								<p>Hover over the links below to see tooltips:</p>
								<div class="tooltip-demo well">
								  <p class="muted" style="margin-bottom: 0;">Tight pants next level keffiyeh <a href="#" data-rel="tooltip" data-original-title="first tooltip">you probably</a> haven't heard of them. Photo booth beard raw denim letterpress vegan messenger bag stumptown. Farm-to-table seitan, mcsweeney's fixie sustainable quinoa 8-bit american appadata-rel <a href="#" data-rel="tooltip" data-original-title="Another tooltip">have a</a> terry richardson vinyl chambray. Beard stumptown, cardigans banh mi lomo thundercats. Tofu biodiesel williamsburg marfa, four loko mcsweeney's cleanse vegan chambray. A <a href="#" data-rel="tooltip" data-original-title="Another one here too">really ironic</a> artisan whatever keytar, scenester farm-to-table banksy Austin <a href="#" data-rel="tooltip" data-original-title="The last tip!">twitter handle</a> freegan cred raw denim single-origin coffee viral.
								  </p>
								</div>                                  
							  </div>
						  </div>	 
					  </div>
				</div><!--/span-->
				
				<div class="box span3">
					<div class="box-header well" data-original-title>
						<h3>Unordered List</h3>
						<div class="box-icon">
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<ul>
						  <li>Lorem ipsum dolor sit amet</li>
						  <li>Consectetur adipiscing elit</li>
						  <li>Integer molestie lorem at massa</li>
						  <li>Facilisis in pretium nisl aliquet</li>
						  <li>Nulla volutpat aliquam velit
							<ul>
							  <li>Phasellus iaculis neque</li>
							  <li>Purus sodales ultricies</li>
							  <li>Vestibulum laoreet porttitor sem</li>
							  <li>Ac tristique libero volutpat at</li>
							</ul>
						  </li>
						  <li>Faucibus porta lacus fringilla vel</li>
						  <li>Aenean sit amet erat nunc</li>
						  <li>Eget porttitor lorem</li>
						</ul>            
					</div>
				</div><!--/span-->
				
				<div class="box span3">
					<div class="box-header well" data-original-title>
						<h3>Ordered List</h3>
						<div class="box-icon">
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<ol>
						  <li>Lorem ipsum dolor sit amet</li>
						  <li>Consectetur adipiscing elit</li>
						  <li>Integer molestie lorem at massa</li>
						  <li>Facilisis in pretium nisl aliquet</li>
						  <li>Nulla volutpat aliquam velit</li>
						  <li>Faucibus porta lacus fringilla vel</li>
						  <li>Aenean sit amet erat nunc</li>
						  <li>Eget porttitor lorem</li>
						</ol>           
					</div>
				</div><!--/span-->
				
				<div class="box span3">
					<div class="box-header well" data-original-title>
						<h3>Description List</h3>
						<div class="box-icon">
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<dl>
						  <dt>Description lists</dt>
						  <dd>A description list is perfect for defining terms.</dd>
						  <dt>Euismod</dt>
						  <dd>Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.</dd>
						  <dd>Donec id elit non mi porta gravida at eget metus.</dd>
						  <dt>Malesuada porta</dt>
						  <dd>Etiam porta sem malesuada magna mollis euismod.</dd>
						</dl>            
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
			"""),_display_(Seq[Any](/*238.5*/foot())),format.raw/*238.11*/("""
		</footer>
		
	</div><!--/.fluid-container-->

	"""),_display_(Seq[Any](/*243.3*/script())),format.raw/*243.11*/("""
	
		
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
                    DATE: Tue Feb 05 14:57:07 CST 2013
                    SOURCE: H:/play/play2/demoplay/app/views/typography.scala.html
                    HASH: e057fe7b9f8a10ec0c84c6329bee265063733882
                    MATRIX: 824->0|1027->168|1053->173|1196->281|1223->286|1492->520|1520->526|11324->10294|11353->10300|11445->10356|11476->10364
                    LINES: 30->1|39->10|39->10|47->18|47->18|57->28|57->28|267->238|267->238|272->243|272->243
                    -- GENERATED --
                */
            