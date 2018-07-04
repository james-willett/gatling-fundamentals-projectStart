import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object MyGatlingRunner {

  def main(args: Array[String]): Unit = {

    val simClass = classOf[MyFirstTest].getName

    val props = new GatlingPropertiesBuilder
    props.simulationClass(simClass)

    Gatling.fromMap(props.build)
  }

}
