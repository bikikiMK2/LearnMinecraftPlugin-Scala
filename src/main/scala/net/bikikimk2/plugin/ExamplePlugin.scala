package net.bikikimk2.plugin
import org.bukkit.command.{Command, CommandSender}
import org.bukkit.plugin.java.JavaPlugin

class ExamplePlugin extends JavaPlugin {
  
  override def onEnable(): Unit = {
    super.onEnable()
    getLogger.info("StartPlugin")
  }
  
  override def onDisable(): Unit = {
    super.onDisable()
    getLogger.info("StopPlugin")
  }
  
  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    super.onCommand(sender, command, label, args)
    sender.sendMessage("aaa")
    true
  }
  
}