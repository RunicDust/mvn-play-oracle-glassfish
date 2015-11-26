
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Hello],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(helloForm: Form[Application.Hello]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(title = "The 'helloworld' application")/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
    
    """),format.raw/*7.5*/("""<h1>Configure your 'Hello world':</h1>
    
    """),_display_(/*9.6*/form(action = routes.Application.sayHello, args = 'id -> "helloform")/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
        
        """),_display_(/*11.10*/inputText(
            field = helloForm("name"),
            args = '_label -> "What's your name?", 'placeholder -> "World"
        )),format.raw/*14.10*/("""
        
        """),_display_(/*16.10*/inputText(
            field = helloForm("repeat"),
            args = '_label -> "How many times?", 'size -> 3, 'placeholder -> 10
        )),format.raw/*19.10*/("""
        
        """),_display_(/*21.10*/select(
            field = helloForm("color"), 
            options = options(
                "" -> "Default",
                "red" -> "Red",
                "green" -> "Green",
                "blue" -> "Blue"
            ),
            args = '_label -> "Choose a color"
        )),format.raw/*30.10*/("""
        
        """),format.raw/*32.9*/("""<p class="buttons">
            <input type="submit">
        <p>
        
    """)))}),format.raw/*36.6*/("""
    
""")))}))}
  }

  def render(helloForm:Form[Application.Hello]): play.twirl.api.HtmlFormat.Appendable = apply(helloForm)

  def f:((Form[Application.Hello]) => play.twirl.api.HtmlFormat.Appendable) = (helloForm) => apply(helloForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 22:23:55 EET 2015
                  SOURCE: c:/Users/Tana/jmvn/app/views/index.scala.html
                  HASH: dd53b8754a4f9d96e7db66a8df80058e44382369
                  MATRIX: 740->1|879->37|909->59|937->62|989->106|1028->108|1066->120|1142->171|1219->240|1258->242|1306->263|1464->400|1512->421|1677->565|1725->586|2040->880|2087->900|2201->984
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7|36->9|36->9|36->9|38->11|41->14|43->16|46->19|48->21|57->30|59->32|63->36
                  -- GENERATED --
              */
          