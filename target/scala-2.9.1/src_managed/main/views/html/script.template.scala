
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
object script extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- external javascript 存放全局的js脚本文件
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- jQuery -->
	<script src=""""),_display_(Seq[Any](/*6.16*/routes/*6.22*/.Assets.at("moudle/bootstrap/js/jquery.min.js"))),format.raw/*6.69*/(""""></script>
	<!-- jQuery UI -->
	<script src=""""),_display_(Seq[Any](/*8.16*/routes/*8.22*/.Assets.at("moudle/bootstrap/js/jquery-ui.custom.min.js"))),format.raw/*8.79*/(""""></script>
	<!-- transition / effect library -->
	<script src=""""),_display_(Seq[Any](/*10.16*/routes/*10.22*/.Assets.at("moudle/bootstrap/js/bootstrap-transition.js"))),format.raw/*10.79*/(""""></script>
	<!-- alert enhancer library -->
	<script src=""""),_display_(Seq[Any](/*12.16*/routes/*12.22*/.Assets.at("moudle/bootstrap/js/bootstrap-alert.js"))),format.raw/*12.74*/(""""></script>
	<!-- modal / dialog library -->
	<script src=""""),_display_(Seq[Any](/*14.16*/routes/*14.22*/.Assets.at("moudle/bootstrap/js/bootstrap-modal.js"))),format.raw/*14.74*/(""""></script>
	<!-- custom dropdown library -->
	<script src=""""),_display_(Seq[Any](/*16.16*/routes/*16.22*/.Assets.at("moudle/bootstrap/js/bootstrap-dropdown.js"))),format.raw/*16.77*/(""""></script>
	<!-- scrolspy library -->
	<script src=""""),_display_(Seq[Any](/*18.16*/routes/*18.22*/.Assets.at("moudle/bootstrap/js/bootstrap-scrollspy.js"))),format.raw/*18.78*/(""""></script>
	<!-- library for creating tabs -->
	<script src=""""),_display_(Seq[Any](/*20.16*/routes/*20.22*/.Assets.at("moudle/bootstrap/js/bootstrap-tab.js"))),format.raw/*20.72*/(""""></script>
	<!-- library for advanced tooltip -->
	<script src=""""),_display_(Seq[Any](/*22.16*/routes/*22.22*/.Assets.at("moudle/bootstrap/js/bootstrap-tooltip.js"))),format.raw/*22.76*/(""""></script>
	<!-- popover effect library -->
	<script src=""""),_display_(Seq[Any](/*24.16*/routes/*24.22*/.Assets.at("moudle/bootstrap/js/bootstrap-popover.js"))),format.raw/*24.76*/(""""></script>
	<!-- button enhancer library -->
	<script src=""""),_display_(Seq[Any](/*26.16*/routes/*26.22*/.Assets.at("moudle/bootstrap/js/bootstrap-button.js"))),format.raw/*26.75*/(""""></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src=""""),_display_(Seq[Any](/*28.16*/routes/*28.22*/.Assets.at("moudle/bootstrap/js/bootstrap-collapse.js"))),format.raw/*28.77*/(""""></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src=""""),_display_(Seq[Any](/*30.16*/routes/*30.22*/.Assets.at("moudle/bootstrap/js/bootstrap-carousel.js"))),format.raw/*30.77*/(""""></script>
	<!-- autocomplete library -->
	<script src=""""),_display_(Seq[Any](/*32.16*/routes/*32.22*/.Assets.at("moudle/bootstrap/js/bootstrap-typeahead.js"))),format.raw/*32.78*/(""""></script>
	<!-- tour library -->
	<script src=""""),_display_(Seq[Any](/*34.16*/routes/*34.22*/.Assets.at("moudle/bootstrap/js/bootstrap-tour.js"))),format.raw/*34.73*/(""""></script>
	<!-- library for cookie management -->
	<script src=""""),_display_(Seq[Any](/*36.16*/routes/*36.22*/.Assets.at("moudle/bootstrap/js/jquery.cookie.js"))),format.raw/*36.72*/(""""></script>
	<!-- calander plugin -->
	<script src=""""),_display_(Seq[Any](/*38.16*/routes/*38.22*/.Assets.at("moudle/bootstrap/js/fullcalendar.min.js"))),format.raw/*38.75*/(""""></script>
	<!-- data table plugin -->
	<script src=""""),_display_(Seq[Any](/*40.16*/routes/*40.22*/.Assets.at("moudle/bootstrap/js/jquery.dataTables.min.js"))),format.raw/*40.80*/(""""></script>

	<!-- chart libraries start -->
	<script src=""""),_display_(Seq[Any](/*43.16*/routes/*43.22*/.Assets.at("moudle/bootstrap/js/excanvas.js"))),format.raw/*43.67*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*44.16*/routes/*44.22*/.Assets.at("moudle/bootstrap/js/jquery.flot.min.js"))),format.raw/*44.74*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*45.16*/routes/*45.22*/.Assets.at("moudle/bootstrap/js/jquery.flot.pie.min.js"))),format.raw/*45.78*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*46.16*/routes/*46.22*/.Assets.at("moudle/bootstrap/js/jquery.flot.stack.js"))),format.raw/*46.76*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*47.16*/routes/*47.22*/.Assets.at("moudle/bootstrap/js/jquery.flot.resize.min.js"))),format.raw/*47.81*/(""""></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src=""""),_display_(Seq[Any](/*51.16*/routes/*51.22*/.Assets.at("moudle/bootstrap/js/jquery.chosen.min.js"))),format.raw/*51.76*/(""""></script>
	<!-- checkbox, radio, and file input styler -->
	<script src=""""),_display_(Seq[Any](/*53.16*/routes/*53.22*/.Assets.at("moudle/bootstrap/js/jquery.uniform.min.js"))),format.raw/*53.77*/(""""></script>
	<!-- plugin for gallery image view -->
	<script src=""""),_display_(Seq[Any](/*55.16*/routes/*55.22*/.Assets.at("moudle/bootstrap/js/jquery.colorbox.min.js"))),format.raw/*55.78*/(""""></script>
	<!-- rich text editor library -->
	<script src=""""),_display_(Seq[Any](/*57.16*/routes/*57.22*/.Assets.at("moudle/bootstrap/js/jquery.cleditor.min.js"))),format.raw/*57.78*/(""""></script>
	<!-- notification plugin -->
	<script src=""""),_display_(Seq[Any](/*59.16*/routes/*59.22*/.Assets.at("moudle/bootstrap/js/jquery.noty.js"))),format.raw/*59.70*/(""""></script>
	<!-- file manager library -->
	<script src=""""),_display_(Seq[Any](/*61.16*/routes/*61.22*/.Assets.at("moudle/bootstrap/js/jquery.elfinder.min.js"))),format.raw/*61.78*/(""""></script>
	<!-- star rating plugin -->
	<script src=""""),_display_(Seq[Any](/*63.16*/routes/*63.22*/.Assets.at("moudle/bootstrap/js/jquery.raty.min.js"))),format.raw/*63.74*/(""""></script>
	<!-- for iOS style toggle switch -->
	<script src=""""),_display_(Seq[Any](/*65.16*/routes/*65.22*/.Assets.at("moudle/bootstrap/js/jquery.iphone.toggle.js"))),format.raw/*65.79*/(""""></script>
	<!-- autogrowing textarea plugin -->
	<script src=""""),_display_(Seq[Any](/*67.16*/routes/*67.22*/.Assets.at("moudle/bootstrap/js/jquery.autogrow-textarea.js"))),format.raw/*67.83*/(""""></script>
	<!-- multiple file upload plugin -->
	<script src=""""),_display_(Seq[Any](/*69.16*/routes/*69.22*/.Assets.at("moudle/bootstrap/js/jquery.uploadify-3.1.min.js"))),format.raw/*69.83*/(""""></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src=""""),_display_(Seq[Any](/*71.16*/routes/*71.22*/.Assets.at("moudle/bootstrap/js/jquery.history.js"))),format.raw/*71.73*/(""""></script>
	<!-- application script for Charisma demo -->
	<script src=""""),_display_(Seq[Any](/*73.16*/routes/*73.22*/.Assets.at("moudle/bootstrap/js/charisma.js"))),format.raw/*73.67*/(""""></script>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 14:57:06 CST 2013
                    SOURCE: H:/play/play2/demoplay/app/views/script.scala.html
                    HASH: afdc576ada998f8e398595bb47cf70f4fe413849
                    MATRIX: 820->0|1055->200|1069->206|1137->253|1221->302|1235->308|1313->365|1416->432|1431->438|1510->495|1608->557|1623->563|1697->615|1795->677|1810->683|1884->735|1983->798|1998->804|2075->859|2167->915|2182->921|2260->977|2361->1042|2376->1048|2448->1098|2552->1166|2567->1172|2643->1226|2741->1288|2756->1294|2832->1348|2931->1411|2946->1417|3021->1470|3143->1556|3158->1562|3235->1617|3366->1712|3381->1718|3458->1773|3554->1833|3569->1839|3647->1895|3735->1947|3750->1953|3823->2004|3928->2073|3943->2079|4015->2129|4106->2184|4121->2190|4196->2243|4289->2300|4304->2306|4384->2364|4483->2427|4498->2433|4565->2478|4629->2506|4644->2512|4718->2564|4782->2592|4797->2598|4875->2654|4939->2682|4954->2688|5030->2742|5094->2770|5109->2776|5190->2835|5326->2935|5341->2941|5417->2995|5531->3073|5546->3079|5623->3134|5728->3203|5743->3209|5821->3265|5921->3329|5936->3335|6014->3391|6109->3450|6124->3456|6194->3504|6290->3564|6305->3570|6383->3626|6477->3684|6492->3690|6566->3742|6669->3809|6684->3815|6763->3872|6866->3939|6881->3945|6964->4006|7067->4073|7082->4079|7165->4140|7290->4229|7305->4235|7378->4286|7490->4362|7505->4368|7572->4413
                    LINES: 30->1|35->6|35->6|35->6|37->8|37->8|37->8|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|45->16|45->16|47->18|47->18|47->18|49->20|49->20|49->20|51->22|51->22|51->22|53->24|53->24|53->24|55->26|55->26|55->26|57->28|57->28|57->28|59->30|59->30|59->30|61->32|61->32|61->32|63->34|63->34|63->34|65->36|65->36|65->36|67->38|67->38|67->38|69->40|69->40|69->40|72->43|72->43|72->43|73->44|73->44|73->44|74->45|74->45|74->45|75->46|75->46|75->46|76->47|76->47|76->47|80->51|80->51|80->51|82->53|82->53|82->53|84->55|84->55|84->55|86->57|86->57|86->57|88->59|88->59|88->59|90->61|90->61|90->61|92->63|92->63|92->63|94->65|94->65|94->65|96->67|96->67|96->67|98->69|98->69|98->69|100->71|100->71|100->71|102->73|102->73|102->73
                    -- GENERATED --
                */
            