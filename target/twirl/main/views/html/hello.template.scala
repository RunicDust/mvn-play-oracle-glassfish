
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
object hello extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Int,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, repeat: Int, color: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("Here is the result:")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    """),format.raw/*5.5*/("""<ul style="color: """),_display_(/*5.24*/if(color != null)/*5.41*/ {_display_(Seq[Any](format.raw/*5.43*/(""" """),_display_(/*5.45*/color),format.raw/*5.50*/(""" """)))}/*5.53*/else/*5.58*/{_display_(Seq[Any](format.raw/*5.59*/(""" """),format.raw/*5.60*/("""inherited """)))}),format.raw/*5.71*/("""">
        """),_display_(/*6.10*/for(i <- 1 to repeat) yield /*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
            """),format.raw/*7.13*/("""<li>Hello """),_display_(/*7.24*/name),format.raw/*7.28*/("""!</li>
        """)))}),format.raw/*8.10*/("""
    """),format.raw/*9.5*/("""</ul>
    
    <p class="buttons">
        <a href=""""),_display_(/*12.19*/routes/*12.25*/.Application.index),format.raw/*12.43*/("""">Back to the form</a>
    </p>
    
""")))}))}
  }

  def render(name:String,repeat:Int,color:String): play.twirl.api.HtmlFormat.Appendable = apply(name,repeat,color)

  def f:((String,Int,String) => play.twirl.api.HtmlFormat.Appendable) = (name,repeat,color) => apply(name,repeat,color)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 22:23:55 EET 2015
                  SOURCE: c:/Users/Tana/jmvn/app/views/hello.scala.html
                  HASH: 62efb93edd50ad94a0718fef2c9a23e3b1ea5da7
                  MATRIX: 734->1|864->43|894->48|929->75|968->77|1006->89|1051->108|1076->125|1115->127|1143->129|1168->134|1188->137|1200->142|1238->143|1266->144|1307->155|1346->168|1382->189|1421->191|1462->205|1499->216|1523->220|1570->237|1602->243|1685->299|1700->305|1739->323
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|37->9|40->12|40->12|40->12
                  -- GENERATED --
              */
          