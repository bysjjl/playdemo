
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
object error extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
		<link href='http://fonts.googleapis.com/css?family=Creepster|Audiowide' rel='stylesheet' type='text/css'>
		
		<style>
			*"""),format.raw("""{"""),format.raw/*8.6*/("""
				margin:0;
				padding:0;
			"""),format.raw("""}"""),format.raw/*11.5*/("""
			body"""),format.raw("""{"""),format.raw/*12.9*/("""
				font-family: 'Audiowide', cursive, arial, helvetica, sans-serif;
				background:url(img/error_bg.png) repeat;
				background-color:#212121;
				color:white;
				font-size: 18px;
				padding-bottom:20px;
			"""),format.raw("""}"""),format.raw/*19.5*/("""
			.error-code"""),format.raw("""{"""),format.raw/*20.16*/("""
				font-family: 'Creepster', cursive, arial, helvetica, sans-serif;
				font-size: 200px;
				color: white;
				color: rgba(255, 255, 255, 0.98);
				width: 50%;
				text-align: right;
				margin-top: 5%;
				text-shadow: 5px 5px hsl(0, 0%, 25%);
				float: left;
			"""),format.raw("""}"""),format.raw/*30.5*/("""
			.not-found"""),format.raw("""{"""),format.raw/*31.15*/("""
				width: 47%;
				float: right;
				margin-top: 5%;
				font-size: 50px;
				color: white;
				text-shadow: 2px 2px 5px hsl(0, 0%, 61%);
				padding-top: 70px;
			"""),format.raw("""}"""),format.raw/*39.5*/("""
			.clear"""),format.raw("""{"""),format.raw/*40.11*/("""
				float:none;
				clear:both;
			"""),format.raw("""}"""),format.raw/*43.5*/("""
			.content"""),format.raw("""{"""),format.raw/*44.13*/("""
				text-align:center;
				line-height: 30px;
			"""),format.raw("""}"""),format.raw/*47.5*/("""
			input[type=text]"""),format.raw("""{"""),format.raw/*48.21*/("""
				border: hsl(247, 89%, 72%) solid 1px;
				outline: none;
				padding: 5px 3px;
				font-size: 16px;
				border-radius: 8px;
			"""),format.raw("""}"""),format.raw/*54.5*/("""
			a"""),format.raw("""{"""),format.raw/*55.6*/("""
				text-decoration: none;
				color: #9ECDFF;
				text-shadow: 0px 0px 2px white;
			"""),format.raw("""}"""),format.raw/*59.5*/("""
			a:hover"""),format.raw("""{"""),format.raw/*60.12*/("""
				color:white;
			"""),format.raw("""}"""),format.raw/*62.5*/("""

		</style>
		<title>Error</title>
	</head>
	<body>
		
		<p class="error-code">
			404
		</p>
		<p class="not-found">Not<br/>Found</p>
		<div class="clear"></div>
		<div class="content">
			The page your are looking for is not found.
			<br/><a href="index.html">Go Home</a> or<br/><form>Search<br/><input autofocus type="text" name="search" /></form>
		</div>
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
                    SOURCE: H:/play/play2/demoplay/app/views/error.scala.html
                    HASH: 48b5ab008ea8e4fe2a4e56316f8f7245df42bafa
                    MATRIX: 819->0|1066->202|1149->239|1205->249|1470->468|1534->485|1860->765|1923->781|2144->956|2203->968|2289->1008|2350->1022|2450->1076|2519->1098|2704->1237|2757->1244|2895->1336|2955->1349|3025->1373
                    LINES: 30->1|37->8|40->11|41->12|48->19|49->20|59->30|60->31|68->39|69->40|72->43|73->44|76->47|77->48|83->54|84->55|88->59|89->60|91->62
                    -- GENERATED --
                */
            