
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
object icon extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
			"""),_display_(Seq[Any](/*18.5*/css())),format.raw/*18.10*/("""
		</div>
	</div>
	<!-- topbar ends -->
		<div class="container-fluid">
		<div class="row-fluid">
				
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					"""),_display_(Seq[Any](/*28.7*/menu())),format.raw/*28.13*/("""
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
						<a href="#"> Icons</a>
					</li>
				</ul>
			</div>

			<div class="row-fluid sortable">
				<div class="box span12">
					<div class="box-header well" data-original-title>
						<h2><i class="icon-picture"></i> Icons</h2>
						<div class="box-icon">
							<a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
							<a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<section id="icons1">
						  <div class="page-header">
							<h1>Icons <small>Graciously provided by <a href="http://glyphicons.com" target="_blank">Glyphicons</a></small></h1>
						  </div>
						  <div class="row-fluid bs-icons">
							<div class="span3">
							  <ul class="the-icons">
								<li><i class="icon-glass"></i> icon-glass</li>
								<li><i class="icon-music"></i> icon-music</li>
								<li><i class="icon-search"></i> icon-search</li>
								<li><i class="icon-envelope"></i> icon-envelope</li>
								<li><i class="icon-heart"></i> icon-heart</li>
								<li><i class="icon-star"></i> icon-star</li>
								<li><i class="icon-star-empty"></i> icon-star-empty</li>
								<li><i class="icon-user"></i> icon-user</li>
								<li><i class="icon-film"></i> icon-film</li>
								<li><i class="icon-th-large"></i> icon-th-large</li>
								<li><i class="icon-th"></i> icon-th</li>
								<li><i class="icon-th-list"></i> icon-th-list</li>
								<li><i class="icon-ok"></i> icon-ok</li>
								<li><i class="icon-remove"></i> icon-remove</li>
								<li><i class="icon-zoom-in"></i> icon-zoom-in</li>
								<li><i class="icon-zoom-out"></i> icon-zoom-out</li>
								<li><i class="icon-off"></i> icon-off</li>
								<li><i class="icon-signal"></i> icon-signal</li>
								<li><i class="icon-cog"></i> icon-cog</li>
								<li><i class="icon-trash"></i> icon-trash</li>
								<li><i class="icon-home"></i> icon-home</li>
								<li><i class="icon-file"></i> icon-file</li>
								<li><i class="icon-time"></i> icon-time</li>
								<li><i class="icon-road"></i> icon-road</li>
								<li><i class="icon-download-alt"></i> icon-download-alt</li>
								<li><i class="icon-download"></i> icon-download</li>
								<li><i class="icon-upload"></i> icon-upload</li>
								<li><i class="icon-inbox"></i> icon-inbox</li>
								<li><i class="icon-play-circle"></i> icon-play-circle</li>
								<li><i class="icon-repeat"></i> icon-repeat</li>
								<li><i class="icon-refresh"></i> icon-refresh</li>
								<li><i class="icon-list-alt"></i> icon-list-alt</li>
								<li><i class="icon-lock"></i> icon-lock</li>
								<li><i class="icon-flag"></i> icon-flag</li>
								<li><i class="icon-headphones"></i> icon-headphones</li>
							  </ul>
							</div>
							<div class="span3">
							  <ul class="the-icons">
								<li><i class="icon-volume-off"></i> icon-volume-off</li>
								<li><i class="icon-volume-down"></i> icon-volume-down</li>
								<li><i class="icon-volume-up"></i> icon-volume-up</li>
								<li><i class="icon-qrcode"></i> icon-qrcode</li>
								<li><i class="icon-barcode"></i> icon-barcode</li>
								<li><i class="icon-tag"></i> icon-tag</li>
								<li><i class="icon-tags"></i> icon-tags</li>
								<li><i class="icon-book"></i> icon-book</li>
								<li><i class="icon-bookmark"></i> icon-bookmark</li>
								<li><i class="icon-print"></i> icon-print</li>
								<li><i class="icon-camera"></i> icon-camera</li>
								<li><i class="icon-font"></i> icon-font</li>
								<li><i class="icon-bold"></i> icon-bold</li>
								<li><i class="icon-italic"></i> icon-italic</li>
								<li><i class="icon-text-height"></i> icon-text-height</li>
								<li><i class="icon-text-width"></i> icon-text-width</li>
								<li><i class="icon-align-left"></i> icon-align-left</li>
								<li><i class="icon-align-center"></i> icon-align-center</li>
								<li><i class="icon-align-right"></i> icon-align-right</li>
								<li><i class="icon-align-justify"></i> icon-align-justify</li>
								<li><i class="icon-list"></i> icon-list</li>
								<li><i class="icon-indent-left"></i> icon-indent-left</li>
								<li><i class="icon-indent-right"></i> icon-indent-right</li>
								<li><i class="icon-facetime-video"></i> icon-facetime-video</li>
								<li><i class="icon-picture"></i> icon-picture</li>
								<li><i class="icon-pencil"></i> icon-pencil</li>
								<li><i class="icon-map-marker"></i> icon-map-marker</li>
								<li><i class="icon-adjust"></i> icon-adjust</li>
								<li><i class="icon-tint"></i> icon-tint</li>
								<li><i class="icon-edit"></i> icon-edit</li>
								<li><i class="icon-share"></i> icon-share</li>
								<li><i class="icon-check"></i> icon-check</li>
								<li><i class="icon-move"></i> icon-move</li>
								<li><i class="icon-step-backward"></i> icon-step-backward</li>
								<li><i class="icon-fast-backward"></i> icon-fast-backward</li>
							  </ul>
							</div>
							<div class="span3">
							  <ul class="the-icons">
								<li><i class="icon-backward"></i> icon-backward</li>
								<li><i class="icon-play"></i> icon-play</li>
								<li><i class="icon-pause"></i> icon-pause</li>
								<li><i class="icon-stop"></i> icon-stop</li>
								<li><i class="icon-forward"></i> icon-forward</li>
								<li><i class="icon-fast-forward"></i> icon-fast-forward</li>
								<li><i class="icon-step-forward"></i> icon-step-forward</li>
								<li><i class="icon-eject"></i> icon-eject</li>
								<li><i class="icon-chevron-left"></i> icon-chevron-left</li>
								<li><i class="icon-chevron-right"></i> icon-chevron-right</li>
								<li><i class="icon-plus-sign"></i> icon-plus-sign</li>
								<li><i class="icon-minus-sign"></i> icon-minus-sign</li>
								<li><i class="icon-remove-sign"></i> icon-remove-sign</li>
								<li><i class="icon-ok-sign"></i> icon-ok-sign</li>
								<li><i class="icon-question-sign"></i> icon-question-sign</li>
								<li><i class="icon-info-sign"></i> icon-info-sign</li>
								<li><i class="icon-screenshot"></i> icon-screenshot</li>
								<li><i class="icon-remove-circle"></i> icon-remove-circle</li>
								<li><i class="icon-ok-circle"></i> icon-ok-circle</li>
								<li><i class="icon-ban-circle"></i> icon-ban-circle</li>
								<li><i class="icon-arrow-left"></i> icon-arrow-left</li>
								<li><i class="icon-arrow-right"></i> icon-arrow-right</li>
								<li><i class="icon-arrow-up"></i> icon-arrow-up</li>
								<li><i class="icon-arrow-down"></i> icon-arrow-down</li>
								<li><i class="icon-share-alt"></i> icon-share-alt</li>
								<li><i class="icon-resize-full"></i> icon-resize-full</li>
								<li><i class="icon-resize-small"></i> icon-resize-small</li>
								<li><i class="icon-plus"></i> icon-plus</li>
								<li><i class="icon-minus"></i> icon-minus</li>
								<li><i class="icon-asterisk"></i> icon-asterisk</li>
								<li><i class="icon-exclamation-sign"></i> icon-exclamation-sign</li>
								<li><i class="icon-gift"></i> icon-gift</li>
								<li><i class="icon-leaf"></i> icon-leaf</li>
								<li><i class="icon-fire"></i> icon-fire</li>
								<li><i class="icon-eye-open"></i> icon-eye-open</li>
							  </ul>
							</div>
							<div class="span3">
							  <ul class="the-icons">
								<li><i class="icon-eye-close"></i> icon-eye-close</li>
								<li><i class="icon-warning-sign"></i> icon-warning-sign</li>
								<li><i class="icon-plane"></i> icon-plane</li>
								<li><i class="icon-calendar"></i> icon-calendar</li>
								<li><i class="icon-random"></i> icon-random</li>
								<li><i class="icon-comment"></i> icon-comment</li>
								<li><i class="icon-magnet"></i> icon-magnet</li>
								<li><i class="icon-chevron-up"></i> icon-chevron-up</li>
								<li><i class="icon-chevron-down"></i> icon-chevron-down</li>
								<li><i class="icon-retweet"></i> icon-retweet</li>
								<li><i class="icon-shopping-cart"></i> icon-shopping-cart</li>
								<li><i class="icon-folder-close"></i> icon-folder-close</li>
								<li><i class="icon-folder-open"></i> icon-folder-open</li>
								<li><i class="icon-resize-vertical"></i> icon-resize-vertical</li>
								<li><i class="icon-resize-horizontal"></i> icon-resize-horizontal</li>
								<li><i class="icon-hdd"></i> icon-hdd</li>
								<li><i class="icon-bullhorn"></i> icon-bullhorn</li>
								<li><i class="icon-bell"></i> icon-bell</li>
								<li><i class="icon-certificate"></i> icon-certificate</li>
								<li><i class="icon-thumbs-up"></i> icon-thumbs-up</li>
								<li><i class="icon-thumbs-down"></i> icon-thumbs-down</li>
								<li><i class="icon-hand-right"></i> icon-hand-right</li>
								<li><i class="icon-hand-left"></i> icon-hand-left</li>
								<li><i class="icon-hand-up"></i> icon-hand-up</li>
								<li><i class="icon-hand-down"></i> icon-hand-down</li>
								<li><i class="icon-circle-arrow-right"></i> icon-circle-arrow-right</li>
								<li><i class="icon-circle-arrow-left"></i> icon-circle-arrow-left</li>
								<li><i class="icon-circle-arrow-up"></i> icon-circle-arrow-up</li>
								<li><i class="icon-circle-arrow-down"></i> icon-circle-arrow-down</li>
								<li><i class="icon-globe"></i> icon-globe</li>
								<li><i class="icon-wrench"></i> icon-wrench</li>
								<li><i class="icon-tasks"></i> icon-tasks</li>
								<li><i class="icon-filter"></i> icon-filter</li>
								<li><i class="icon-briefcase"></i> icon-briefcase</li>
								<li><i class="icon-fullscreen"></i> icon-fullscreen</li>
							  </ul>
							</div>
						  </div>

						  <br>

						  <div class="row-fluid">
							<div class="span4">
							  <h3>Built as a sprite</h3>
							  <p>Instead of making every icon an extra request, we've compiled them into a sprite&mdash;a bunch of images in one file that uses CSS to position the images with <code>background-position</code>. This is the same method we use on Twitter.com and it has worked well for us.</p>
							  <p>All icons classes are prefixed with <code>.icon-</code> for proper namespacing and scoping, much like our other components. This will help avoid conflicts with other tools.</p>
							</div>
							<div class="span4">
							  <h3>How to use</h3>
							  <p>Bootstrap uses an <code>&lt;i&gt;</code> tag for all icons, but they have no case class&mdash;only a shared prefix. To use, place the following code just about anywhere:</p>
						<pre class="prettyprint linenums">&lt;i class="icon-search"&gt;&lt;/i&gt;</pre>
							  <p>There are also styles available for inverted (white) icons, made ready with one extra class:</p>
						<pre class="prettyprint linenums">&lt;i class="icon-search icon-white"&gt;&lt;/i&gt;</pre>
						<div class="alert alert-info"><i class="icon-info-sign"></i> In dark themes (Cyborg and Slate) normal icons become white and icon-white become black.</div>
							  <p>There are 140 classes to choose from for your icons. Just add an <code>&lt;i&gt;</code> tag with the right classes and you're set. You can find the full list in <strong>sprites.less</strong> or right here in this document.</p>
							  <p>
								<span class="label label-info">Heads up!</span>
								When using beside strings of text, as in buttons or nav links, be sure to leave a space after the <code>&lt;i&gt;</code> tag for proper spacing.
							  </p>
							</div>
							<div class="span4">
							  <h3>Use cases</h3>
							  <p>Icons are great, but where would one use them? Here are a few ideas:</p>
							  <ul>
								<li>As visuals for your sidebar navigation</li>
								<li>For a purely icon-driven navigation</li>
								<li>For buttons to help convey the meaning of an action</li>
								<li>With links to share context on a user's destination</li>
							  </ul>
							  <p>Essentially, anywhere you can put an <code>&lt;i&gt;</code> tag, you can put an icon.</p>
							</div>
						  </div>

						  <h3>Examples</h3>
						  <p>Use them in buttons, button groups for a toolbar, navigation, or prepended form inputs.</p>
						  <div class="row-fluid">
							<div class="span4">
							  <div class="btn-toolbar" style="margin-bottom: 9px">
								<div class="btn-group">
								  <a class="btn" href="#"><i class="icon-align-left"></i></a>
								  <a class="btn" href="#"><i class="icon-align-center"></i></a>
								  <a class="btn" href="#"><i class="icon-align-right"></i></a>
								  <a class="btn" href="#"><i class="icon-align-justify"></i></a>
								</div>
								<div class="btn-group">
								  <a class="btn btn-primary" href="#"><i class="icon-user icon-white"></i> User</a>
								  <a class="btn btn-primary dropdown-toggle" data-toggle="dropdown" href="#"><span class="caret"></span></a>
								  <ul class="dropdown-menu">
									<li><a href="#"><i class="icon-pencil"></i> Edit</a></li>
									<li><a href="#"><i class="icon-trash"></i> Delete</a></li>
									<li><a href="#"><i class="icon-ban-circle"></i> Ban</a></li>
									<li class="divider"></li>
									<li><a href="#"><i class="i"></i> Make admin</a></li>
								  </ul>
								</div>
							  </div>
							  <p>
								<a class="btn" href="#"><i class="icon-refresh"></i> Refresh</a>
								<a class="btn btn-success" href="#"><i class="icon-shopping-cart icon-white"></i> Checkout</a>
								<a class="btn btn-danger" href="#"><i class="icon-trash icon-white"></i> Delete</a>
							  </p>
							  <p>
								<a class="btn btn-large" href="#"><i class="icon-comment"></i> Comment</a>
								<a class="btn btn-small" href="#"><i class="icon-cog"></i> Settings</a>
								<a class="btn btn-small btn-info" href="#"><i class="icon-info-sign icon-white"></i> More Info</a>
							  </p>
							</div>
							<div class="span4">
							  <div class="well" style="padding: 8px 0;">
								<ul class="nav nav-list">
								  <li class="active"><a href="#"><i class="icon-home icon-white"></i> Home</a></li>
								  <li><a href="#"><i class="icon-book"></i> Library</a></li>
								  <li><a href="#"><i class="icon-pencil"></i> Applications</a></li>
								  <li><a href="#"><i class="i"></i> Misc</a></li>
								</ul>
							  </div> <!-- /well -->
							</div>
							<div class="span4">
							  <form>
								<div class="control-group">
								  <label class="control-label" for="inputIcon">Email address</label>
								  <div class="controls">
									<div class="input-prepend">
									  <span class="add-on"><i class="icon-envelope"></i></span><input id="inputIcon" type="text">
									</div>
								  </div>
								</div>
							  </form>
							</div>
						  </div>
						</section>
						
						
					</div>
				</div><!--/span-->
			
			</div><!--/row-->
    
					<!-- content ends -->
			</div><!--/#content.span10-->
				</div><!--/fluid-row-->
				
		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">脳</button>
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
			"""),_display_(Seq[Any](/*349.5*/foot())),format.raw/*349.11*/("""
		</footer>
		
	</div><!--/.fluid-container-->

	"""),_display_(Seq[Any](/*354.3*/script())),format.raw/*354.11*/("""
	
		
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
                    SOURCE: H:/play/play2/demoplay/app/views/icon.scala.html
                    HASH: d51fd5fb1009cc50cf63c94fd571b7cab4ed7428
                    MATRIX: 818->0|1022->169|1048->174|1191->282|1218->287|1487->521|1515->527|17819->16795|17848->16801|17940->16857|17971->16865
                    LINES: 30->1|39->10|39->10|47->18|47->18|57->28|57->28|378->349|378->349|383->354|383->354
                    -- GENERATED --
                */
            