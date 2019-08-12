
/**
 * name:AbdielNie
 * date:09/28/2017
 * description: Television  class
 */
public class Television
{
   private int channel;
   private int volumeLevel;
   private boolean on;
   
   public Television()
   {
   channel = 0;
   volumeLevel = 0;
   on = false;
   }
   
   
   public void turnOn()
   {
       on = true;
   }
   public void turnOff()
   {
       on = false;    
   }
   public void setChannel(int newChannel)
   {
       channel = newChannel;    
   }
   public void setVolume(int newVolume)
   {
       volumeLevel = newVolume;
   }
   public void channelUp()
   {
       channel++;
   }
   public void channelDown()
   {
       channel--;
   }
   public void volumeUp()
   {
       volumeLevel++;
   }
   public void volumeDown()
   {
       volumeLevel--;
   }
   
   //method
   public int getChannel()
   {
       return channel;
   }
   public int getVolume()
   {
       return volumeLevel;
   }
   public boolean getOn()
   {
       return on;
   }
   public void testingmethod()
   {
       System.out.println(on + "" +  channel + "" + volumeLevel + "");
   }
}
