
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], addUserForm: Form[models.users.User], user: models.users.User,  categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.167*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user, categories, catId, filter)/*5.48*/ {_display_(Seq[Any](format.raw/*5.50*/("""

	"""),format.raw/*7.2*/("""<section id="form"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						"""),_display_(/*13.8*/if(loginForm.hasGlobalErrors)/*13.37*/ {_display_(Seq[Any](format.raw/*13.39*/("""
            						"""),format.raw/*14.19*/("""<p class="alert alert-warning">
            					"""),_display_(/*15.19*/loginForm/*15.28*/.globalError.message),format.raw/*15.48*/("""
           				"""),format.raw/*16.16*/("""</p>
						""")))}),format.raw/*17.8*/("""
						"""),_display_(/*18.8*/if(flash.containsKey("error"))/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
						    """),format.raw/*19.11*/("""<div class="alert alert-warning">
						    """),_display_(/*20.12*/flash/*20.17*/.get("loginRequired")),format.raw/*20.38*/("""
						    """),format.raw/*21.11*/("""</div>
						""")))}),format.raw/*22.8*/("""
						

							"""),format.raw/*25.8*/("""<!-- The login form -->
							"""),_display_(/*26.9*/helper/*26.15*/.form(action = controllers.routes.LoginController.loginSubmit(catId, filter))/*26.92*/ {_display_(Seq[Any](format.raw/*26.94*/("""

								"""),format.raw/*28.9*/("""<div class="form-group">
								"""),_display_(/*29.10*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.113*/("""
								"""),format.raw/*30.9*/("""</div>
								<div class="form-group">
								"""),_display_(/*32.10*/inputPassword(loginForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*32.123*/("""
								"""),format.raw/*33.9*/("""</div>
							"""),format.raw/*34.18*/("""
								"""),format.raw/*35.54*/("""
								"""),format.raw/*36.30*/("""
							"""),format.raw/*37.19*/("""
							"""),format.raw/*38.88*/("""
							"""),format.raw/*39.8*/("""<div class="form-group"> <input type="submit" value="Sign In" class="btn btn-primary"> </div>
						""")))}),format.raw/*40.8*/("""
					
					"""),format.raw/*42.6*/("""</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User? Signup!</h2>
						<h4>Password must have: </h4>
						<ul>
							<li>At least 8 characters</li>
							<li>One uppercase letter</li>
							<li>One lowercase letter</li>
							<li>A number</li>
							
						</ul>


						"""),_display_(/*60.8*/if(flash.containsKey("success"))/*60.40*/{_display_(Seq[Any](format.raw/*60.41*/("""
							"""),format.raw/*61.8*/("""<div class="alert alert-success">
							"""),_display_(/*62.9*/flash/*62.14*/.get("success")),format.raw/*62.29*/("""
							"""),format.raw/*63.8*/("""</div>
						""")))}),format.raw/*64.8*/("""
						"""),_display_(/*65.8*/if(flash.containsKey("fail"))/*65.37*/{_display_(Seq[Any](format.raw/*65.38*/("""
							"""),format.raw/*66.8*/("""<div class="alert alert-danger">
							"""),_display_(/*67.9*/flash/*67.14*/.get("fail")),format.raw/*67.26*/("""
							"""),format.raw/*68.8*/("""</div>
						""")))}),format.raw/*69.8*/("""
					"""),format.raw/*70.6*/("""</div>
					"""),_display_(/*71.7*/form(action = routes.HomeController.addUserSubmit(catId, filter), 'class -> "form-horizontal", 'role->"form")/*71.116*/ {_display_(Seq[Any](format.raw/*71.118*/("""

						"""),format.raw/*73.7*/("""<div class="form-row">
							<label>
							"""),_display_(/*75.9*/inputText(addUserForm("fName"), '_label -> "Fisrt Name",'class -> "form-control ")),format.raw/*75.91*/("""
							"""),format.raw/*76.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*81.9*/inputText(addUserForm("lName"), '_label -> "Second Name",'class -> "form-control")),format.raw/*81.91*/("""
							"""),format.raw/*82.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*87.9*/inputText(addUserForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*87.86*/("""
							"""),format.raw/*88.8*/("""</label>
						</div>

						<div class="form-row">
							<label>
							"""),_display_(/*93.9*/inputText(addUserForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*93.112*/("""
							"""),format.raw/*94.8*/("""</label>
						</div>
					
						<div class="form-row">
							<label>
							"""),_display_(/*99.9*/inputText(addUserForm("password2"), '_label -> "Repeat Password",'class -> "form-control", 'type -> "password")),format.raw/*99.120*/("""
							"""),format.raw/*100.8*/("""</label>
						</div>



						<div class="actions">
							<input type="submit" value="Save" class="btn btn-primary">
							<a href=""""),_display_(/*107.18*/routes/*107.24*/.LoginController.login(catId, filter)),format.raw/*107.61*/("""">
							</a>
						</div>


					</div>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section><!--/form-->

""")))}),format.raw/*119.2*/("""
""")))}),format.raw/*120.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],addUserForm:Form[models.users.User],user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,addUserForm,user,categories,catId,filter)

  def f:((Form[models.users.Login],Form[models.users.User],models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,addUserForm,user,categories,catId,filter) => apply(loginForm,addUserForm,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 16:35:40 IST 2017
                  SOURCE: /home/wdd/Desktop/project/04-04-17/app/views/login.scala.html
                  HASH: 0e409885ac66aba851cb3d2057703e50be317120
                  MATRIX: 839->1|1115->166|1142->184|1170->257|1197->259|1251->305|1290->307|1319->310|1557->522|1595->551|1635->553|1682->572|1759->622|1777->631|1818->651|1862->667|1904->679|1938->687|1977->717|2017->719|2056->730|2128->775|2142->780|2184->801|2223->812|2267->826|2310->842|2368->874|2383->880|2469->957|2509->959|2546->969|2607->1003|2732->1106|2768->1115|2844->1164|2979->1277|3015->1286|3057->1310|3094->1364|3131->1394|3167->1413|3203->1501|3238->1509|3369->1610|3408->1622|3859->2047|3900->2079|3939->2080|3974->2088|4042->2130|4056->2135|4092->2150|4127->2158|4171->2172|4205->2180|4243->2209|4282->2210|4317->2218|4384->2259|4398->2264|4431->2276|4466->2284|4510->2298|4543->2304|4582->2317|4701->2426|4742->2428|4777->2436|4849->2482|4952->2564|4987->2572|5088->2647|5191->2729|5226->2737|5327->2812|5425->2889|5460->2897|5561->2972|5686->3075|5721->3083|5827->3163|5960->3274|5996->3282|6160->3418|6176->3424|6235->3461|6396->3591|6429->3593
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|37->7|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|48->18|48->18|48->18|49->19|50->20|50->20|50->20|51->21|52->22|55->25|56->26|56->26|56->26|56->26|58->28|59->29|59->29|60->30|62->32|62->32|63->33|64->34|65->35|66->36|67->37|68->38|69->39|70->40|72->42|90->60|90->60|90->60|91->61|92->62|92->62|92->62|93->63|94->64|95->65|95->65|95->65|96->66|97->67|97->67|97->67|98->68|99->69|100->70|101->71|101->71|101->71|103->73|105->75|105->75|106->76|111->81|111->81|112->82|117->87|117->87|118->88|123->93|123->93|124->94|129->99|129->99|130->100|137->107|137->107|137->107|149->119|150->120
                  -- GENERATED --
              */
          