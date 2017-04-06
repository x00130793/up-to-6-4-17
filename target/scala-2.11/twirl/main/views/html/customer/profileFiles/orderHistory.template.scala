
package views.html.customer.profileFiles

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderHistory_Scope0 {
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

class orderHistory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Long,List[models.shopping.ShopOrder],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, ord: List[models.shopping.ShopOrder], filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.162*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

"""),_display_(/*6.2*/main("Customer order history", user, categories, catId, filter)/*6.65*/  {_display_(Seq[Any](format.raw/*6.68*/("""


	"""),format.raw/*9.2*/("""<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				<h2 class="title text-center">Order history</h2>
				<div id="accordian">
					<div class="list-group">
						<!--List-->
							 <div class="col-sm-12">

            """),_display_(/*18.14*/if(flash.containsKey("success"))/*18.46*/ {_display_(Seq[Any](format.raw/*18.48*/("""
                """),format.raw/*19.17*/("""<div class="alert alert-success">
                """),_display_(/*20.18*/flash/*20.23*/.get("success")),format.raw/*20.38*/("""
                """),format.raw/*21.17*/("""</div>
            """)))}),format.raw/*22.14*/("""
			"""),format.raw/*23.4*/("""<table class="table table-bordered table-hover table-condensed">
				<thead>
					<!-- The header row-->
					<tr>
						<th>Order date</th>
						<th>Total Cost</th>
						<th></th>
					</tr>
         	 </thead>
			<tbody>
                """),_display_(/*33.18*/for(o <- ord) yield /*33.31*/ {_display_(Seq[Any](format.raw/*33.33*/("""
				
								"""),format.raw/*35.9*/("""<tr>	
								
									<td>"""),_display_(/*37.15*/o/*37.16*/.getOrderDate),format.raw/*37.29*/("""</td>
									<td>€"""),_display_(/*38.16*/o/*38.17*/.getOrderTotal),format.raw/*38.31*/("""</td>
									<td>
										<a href=""""),_display_(/*40.21*/routes/*40.27*/.CustomerCtrl.cancelOrder(catId, filter, o.getId)),format.raw/*40.76*/("""" class="btn-xs btn-danger"
											onclick="return confirmDel();">
											<span class="glyphicon glyphicon-trash"></span>
										</a>
										
									</td>
									</a>
								</tr>
                """)))}),format.raw/*48.18*/("""

			"""),format.raw/*50.4*/("""</tbody>
            </div>
			</table>

					<!--end list-->
					</div>
				</div>
				<div>
				</div>
			</div>


""")))}),format.raw/*62.2*/("""

"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,ord:List[models.shopping.ShopOrder],filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,ord,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,List[models.shopping.ShopOrder],String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,ord,filter) => apply(customer,user,categories,catId,ord,filter)

  def ref: this.type = this

}


}

/**/
object orderHistory extends orderHistory_Scope0.orderHistory
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 16:35:40 IST 2017
                  SOURCE: /home/wdd/Desktop/project/04-04-17/app/views/customer/profileFiles/orderHistory.scala.html
                  HASH: e37da48c8bf19c00e43934336a0740c70a208271
                  MATRIX: 880->1|1136->161|1163->162|1476->450|1547->513|1587->516|1617->520|1900->776|1941->808|1981->810|2026->827|2104->878|2118->883|2154->898|2199->915|2250->935|2281->939|2550->1181|2579->1194|2619->1196|2660->1210|2716->1239|2726->1240|2760->1253|2808->1274|2818->1275|2853->1289|2920->1329|2935->1335|3005->1384|3252->1600|3284->1605|3433->1724
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|40->9|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|53->22|54->23|64->33|64->33|64->33|66->35|68->37|68->37|68->37|69->38|69->38|69->38|71->40|71->40|71->40|79->48|81->50|93->62
                  -- GENERATED --
              */
          