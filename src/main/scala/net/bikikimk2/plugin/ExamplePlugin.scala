package net.bikikimk2.plugin
import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugin extends JavaPlugin {
  override def onEnable(): Unit = {
    super.onEnable()
    getLogger.info("StartPlugin")
  }

  override def onDisable(): Unit ={
    super.onDisable()
    getLogger.info("StopPlugin")
  }

}