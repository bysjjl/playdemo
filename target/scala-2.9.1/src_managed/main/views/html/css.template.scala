
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
object css extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- The styles 存放全局的样式文件 -->
	<link id="bs-css" href=""""),_display_(Seq[Any](/*2.27*/routes/*2.33*/.Assets.at("moudle/bootstrap/css/bootstrap-cerulean.css"))),format.raw/*2.90*/("""" rel="stylesheet">
	


	<link href=""""),_display_(Seq[Any](/*6.15*/routes/*6.21*/.Assets.at("moudle/bootstrap/css/bootstrap-responsive.css"))),format.raw/*6.80*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Assets.at("moudle/bootstrap/css/charisma-app.css"))),format.raw/*7.72*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*8.15*/routes/*8.21*/.Assets.at("moudle/bootstrap/css/jquery-ui.custom.css"))),format.raw/*8.76*/("""" rel="stylesheet">
	<link href=""""),_display_(Seq[Any](/*9.15*/routes/*9.21*/.Assets.at("moudle/bootstrap/css/fullcalendar.css"))),format.raw/*9.72*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*10.15*/routes/*10.21*/.Assets.at("moudle/bootstrap/css/fullcalendar.print.css"))),format.raw/*10.78*/("""" rel='stylesheet'  media='print'>
	<link href=""""),_display_(Seq[Any](/*11.15*/routes/*11.21*/.Assets.at("moudle/bootstrap/css/chosen.css"))),format.raw/*11.66*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.Assets.at("moudle/bootstrap/css/uniform.default.css"))),format.raw/*12.75*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("moudle/bootstrap/css/colorbox.css"))),format.raw/*13.68*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Assets.at("moudle/bootstrap/css/jquery.cleditor.css"))),format.raw/*14.75*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("moudle/bootstrap/css/jquery.noty.css"))),format.raw/*15.71*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("moudle/bootstrap/css/noty_theme_default.css"))),format.raw/*16.78*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*17.15*/routes/*17.21*/.Assets.at("moudle/bootstrap/css/elfinder.min.css"))),format.raw/*17.72*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*18.15*/routes/*18.21*/.Assets.at("moudle/bootstrap/css/elfinder.theme.css"))),format.raw/*18.74*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*19.15*/routes/*19.21*/.Assets.at("moudle/bootstrap/css/jquery.iphone.toggle.css"))),format.raw/*19.80*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*20.15*/routes/*20.21*/.Assets.at("moudle/bootstrap/css/opa-icons.css"))),format.raw/*20.69*/("""" rel='stylesheet'>
	<link href=""""),_display_(Seq[Any](/*21.15*/routes/*21.21*/.Assets.at("moudle/bootstrap/css/uploadify.css"))),format.raw/*21.69*/("""" rel='stylesheet'>

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  <script src=""""),_display_(Seq[Any](/*25.18*/routes/*25.24*/.Assets.at("moudle/bootstrap/js/html5.js"))),format.raw/*25.66*/(""""></script>
	<![endif]-->


    <style type="text/css">
	  body """),format.raw("""{"""),format.raw/*30.10*/("""
		padding-bottom: 40px;
	  """),format.raw("""}"""),format.raw/*32.5*/("""
	  .sidebar-nav """),format.raw("""{"""),format.raw/*33.18*/("""
		padding: 9px 0;
	  """),format.raw("""}"""),format.raw/*35.5*/("""
	</style>

	<!-- The fav icon -->
	<link rel="shortcut icon" href=""""),_display_(Seq[Any](/*39.35*/routes/*39.41*/.Assets.at("moudle/bootstrap/img/favicon.ico"))),format.raw/*39.87*/("""">
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 14:57:06 CST 2013
                    SOURCE: H:/play/play2/demoplay/app/views/css.scala.html
                    HASH: 0fe5d675177f390deefc99dd9cd181abedfa5a8b
                    MATRIX: 817->0|909->57|923->63|1001->120|1078->162|1092->168|1172->227|1242->262|1256->268|1328->319|1398->354|1412->360|1488->415|1558->450|1572->456|1644->507|1715->542|1730->548|1809->605|1895->655|1910->661|1977->706|2048->741|2063->747|2139->801|2210->836|2225->842|2294->889|2365->924|2380->930|2456->984|2527->1019|2542->1025|2614->1075|2685->1110|2700->1116|2779->1173|2850->1208|2865->1214|2938->1265|3009->1300|3024->1306|3099->1359|3170->1394|3185->1400|3266->1459|3337->1494|3352->1500|3422->1548|3493->1583|3508->1589|3578->1637|3737->1760|3752->1766|3816->1808|3933->1878|4010->1909|4076->1928|4147->1953|4256->2026|4271->2032|4339->2078
                    LINES: 30->1|31->2|31->2|31->2|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|47->18|47->18|47->18|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|54->25|54->25|54->25|59->30|61->32|62->33|64->35|68->39|68->39|68->39
                    -- GENERATED --
                */
            