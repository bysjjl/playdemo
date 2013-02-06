
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
object menu extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<ul class="nav nav-tabs nav-stacked main-menu">
<li class="nav-header hidden-tablet">主要功能</li>
<li><a class="ajax-link" href="/index"><i class="icon-home"></i><span class="hidden-tablet"> 首页</span></a></li>
<li><a  href="/qlist"><i class="icon-eye-open"></i><span class="hidden-tablet"> 增删改查示例</span></a></li>
<li><a class="ajax-link" href="/mform"><i class="icon-edit"></i><span class="hidden-tablet"> 表单</span></a></li>
<li><a class="ajax-link" href="/chart"><i class="icon-list-alt"></i><span class="hidden-tablet"> """),_display_(Seq[Any](/*6.99*/Messages("menu.chart"))),format.raw/*6.121*/("""</span></a></li>
<li><a class="ajax-link" href="/typography"><i class="icon-font"></i><span class="hidden-tablet"> 排印格式</span></a></li>
<li><a class="ajax-link" href="/gallery"><i class="icon-picture"></i><span class="hidden-tablet"> 图库</span></a></li>
<li class="nav-header hidden-tablet">其他功能</li>
<li><a class="ajax-link" href="/table"><i class="icon-align-justify"></i><span class="hidden-tablet"> 表格</span></a></li>
<li><a class="ajax-link" href="/calendar"><i class="icon-calendar"></i><span class="hidden-tablet"> 日历</span></a></li>
<li><a class="ajax-link" href="/grid"><i class="icon-th"></i><span class="hidden-tablet"> 栅格</span></a></li>
<li><a class="ajax-link" href="/file"><i class="icon-folder-open"></i><span class="hidden-tablet"> 文件</span></a></li>
<li><a href="/tour"><i class="icon-globe"></i><span class="hidden-tablet"> 向导</span></a></li>
<li><a class="ajax-link" href="/icon"><i class="icon-star"></i><span class="hidden-tablet"> 图标</span></a></li>
<li><a href="/error"><i class="icon-ban-circle"></i><span class="hidden-tablet"> 错误页面</span></a></li>
<li><a href="/login"><i class="icon-lock"></i><span class="hidden-tablet"> 登录页面</span></a></li>
</ul>
<label id="for-is-ajax" class="hidden-tablet" for="is-ajax"><input id="is-ajax" type="checkbox" checked> Ajax on menu</label>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 05 14:57:06 CST 2013
                    SOURCE: H:/play/play2/demoplay/app/views/menu.scala.html
                    HASH: da3d2789c1ae0be8e483fc8cd7d566a052ae9fcb
                    MATRIX: 818->0|1378->525|1422->547
                    LINES: 30->1|35->6|35->6
                    -- GENERATED --
                */
            