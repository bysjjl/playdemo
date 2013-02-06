
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
object micon extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<p class="pull-left">&copy; <a href="http://www.wcs-global.com" target="_blank">Wilmar</a> 2013</p>
<p class="pull-right">Powered by: <a href="http://www.wilmartech.com/">康博嘉信息科技（上海）有限公司</a></p>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 17:59:10 CST 2013
                    SOURCE: H:/play/play2/demoplay/app/views/micon.scala.html
                    HASH: 455448a2503878ff67d123a077018a8744304883
                    MATRIX: 819->0
                    LINES: 30->1
                    -- GENERATED --
                */
            