
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

     object products_Scope1 {
import models.Category
import models.Product
import models.users.User

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.123*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title and content """),format.raw/*7.34*/("""{"""),format.raw/*7.35*/("""html between braces"""),format.raw/*7.54*/("""}"""),format.raw/*7.55*/(""" """),format.raw/*7.56*/("""to the main view -->
"""),_display_(/*8.2*/main("Products", user, categories, catId: Long, filter: String)/*8.65*/ {_display_(Seq[Any](format.raw/*8.67*/("""
    """),format.raw/*9.5*/("""<!-- HTML content for the index view -->
    <div class="row">

        <div class="col-sm-12">

            """),_display_(/*14.14*/if(flash.containsKey("success"))/*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
                """),format.raw/*15.17*/("""<div class="alert alert-success">
                """),_display_(/*16.18*/flash/*16.23*/.get("success")),format.raw/*16.38*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<div class="features_items"><!--features_items-->
                <h2 class="title text-center">Products</h2>
                """),_display_(/*21.18*/for(p <- products) yield /*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
                    """),format.raw/*22.21*/("""<div class="col-sm-4">
                        <div class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    """),_display_(/*26.38*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*26.126*/ {_display_(Seq[Any](format.raw/*26.128*/("""
                                        """),format.raw/*27.41*/("""<img src="/assets/images/productImages/"""),_display_(/*27.81*/(p.getId)),format.raw/*27.90*/(""".jpg"/>
                                    """)))}/*28.39*/else/*28.44*/{_display_(Seq[Any](format.raw/*28.45*/("""
                                        """),format.raw/*29.41*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                                    """)))}),format.raw/*30.38*/("""

                                """),format.raw/*32.33*/("""<h2>&euro; """),_display_(/*32.45*/("%.2f".format(p.getPrice))),format.raw/*32.72*/("""</h2>
                                <p>"""),_display_(/*33.37*/p/*33.38*/.getName),format.raw/*33.46*/("""</p>
                               
                              
                                </div>
                                <div class="product-overlay">
                                    <div class="overlay-content">
                                        <h2>&euro; """),_display_(/*39.53*/("%.2f".format(p.getPrice))),format.raw/*39.80*/("""</h2>
                                        <p> """),_display_(/*40.46*/p/*40.47*/.getDescription),format.raw/*40.62*/("""</p>
                                        <a href=""""),_display_(/*41.51*/routes/*41.57*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*41.91*/("""" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="choose">
                                <ul class="nav nav-pills nav-justified">
                                    <li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
                                    <li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*53.18*/("""

            """),format.raw/*55.13*/("""</div>
        </div>
    </div>
        <!-- End of content for main -->
""")))}),format.raw/*59.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Product],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,catId,filter,user) => apply(env,categories,products,catId,filter,user)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 16:35:40 IST 2017
                  SOURCE: /home/wdd/Desktop/project/04-04-17/app/views/products.scala.html
                  HASH: b45d6f048e80e0a7392f398bdf2ce8b2866d169a
                  MATRIX: 912->75|1129->196|1157->198|1217->231|1245->232|1291->251|1319->252|1347->253|1394->275|1465->338|1504->340|1535->345|1672->455|1713->487|1753->489|1798->506|1876->557|1890->562|1926->577|1971->594|2022->614|2063->627|2217->754|2251->772|2291->774|2340->795|2615->1043|2713->1131|2754->1133|2823->1174|2890->1214|2920->1223|2984->1269|2997->1274|3036->1275|3105->1316|3238->1418|3300->1452|3339->1464|3387->1491|3456->1533|3466->1534|3495->1542|3809->1829|3857->1856|3935->1907|3945->1908|3981->1923|4063->1978|4078->1984|4133->2018|4859->2713|4901->2727|5006->2802
                  LINES: 32->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|51->19|53->21|53->21|53->21|54->22|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|64->32|64->32|64->32|65->33|65->33|65->33|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|85->53|87->55|91->59
                  -- GENERATED --
              */
          