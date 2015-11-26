// @SOURCE:C:/Users/Tana/jmvn/conf/routes
// @HASH:1f73de6df41ac83da696007a11c63c1e72609bde
// @DATE:Wed Nov 25 22:23:53 EET 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_sayHello1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("hello"))))
private[this] lazy val controllers_Application_sayHello1_invoker = createInvoker(
controllers.Application.sayHello(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "sayHello", Nil,"GET", """ Hello action""", Routes.prefix + """hello"""))
        

// @LINE:11
private[this] lazy val controllers_UserController_showUsername2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showuser/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_UserController_showUsername2_invoker = createInvoker(
controllers.UserController.showUsername(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.UserController", "showUsername", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """showuser/$id<[^/]+>"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hello""","""controllers.Application.sayHello()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showuser/$id<[^/]+>""","""controllers.UserController.showUsername(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:9
case controllers_Application_sayHello1_route(params) => {
   call { 
        controllers_Application_sayHello1_invoker.call(controllers.Application.sayHello())
   }
}
        

// @LINE:11
case controllers_UserController_showUsername2_route(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_showUsername2_invoker.call(controllers.UserController.showUsername(id))
   }
}
        

// @LINE:14
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     