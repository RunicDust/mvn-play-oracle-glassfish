
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.6.4.min.js")),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(/*15.23*/routes/*15.29*/.Application.index),format.raw/*15.47*/("""">"""),_display_(/*15.50*/title),format.raw/*15.55*/("""</a>
        </header>
        
        <section>
            """),_display_(/*19.14*/content),format.raw/*19.21*/("""
        """),format.raw/*20.9*/("""</section>
        
    </body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Nov 25 22:23:55 EET 2015
                  SOURCE: c:/Users/Tana/jmvn/app/views/main.scala.html
                  HASH: befb3f2764376879de0af8919e905ef09e5b3225
                  MATRIX: 727->1|845->31|875->35|956->90|981->95|1070->158|1084->164|1138->198|1226->260|1240->266|1292->298|1345->324|1360->330|1426->375|1564->486|1579->492|1618->510|1648->513|1674->518|1768->585|1796->592|1833->602
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|43->15|43->15|43->15|43->15|43->15|47->19|47->19|48->20
                  -- GENERATED --
              */
          