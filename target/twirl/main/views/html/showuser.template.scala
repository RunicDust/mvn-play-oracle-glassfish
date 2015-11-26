
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object showuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Show User Name")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

        """),format.raw/*5.9*/("""<div class="well">
        <h1>"""),_display_(/*6.14*/message),format.raw/*6.21*/("""</h1>
    </div>

""")))}),format.raw/*9.2*/("""

"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 22:23:55 EET 2015
                  SOURCE: c:/Users/Tana/jmvn/app/views/showuser.scala.html
                  HASH: 27844bbc2ba325c0828152093e690789d99ec364
                  MATRIX: 726->1|831->18|861->23|891->45|930->47|968->59|1027->92|1054->99|1105->121
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|34->6|34->6|37->9
                  -- GENERATED --
              */
          