package flyweight


import java.util.HashMap
import java.util.Map

object PlatformFactory {

  private var map: Map[String, Platform] = new HashMap[String, Platform]()

  def getPlatformInstance(platformType: String): Platform ={

    if(map.containsKey(platformType)){
      map.get(platformType)
    }else{
      map.put(platformType, new ScalaPlatform)
      map.get(platformType)
    }

  }
  // this method will probably need to be synchronized

}
