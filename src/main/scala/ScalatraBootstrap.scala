import com.memoriadeferrita._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  implicit val swagger = new ForlayosSwagger
  override def init(context: ServletContext) {
    context.mount(new ForlayosController, "/forlayos/*")
    context.mount(new ResourcesApp, "/api-docs")
  }
}
