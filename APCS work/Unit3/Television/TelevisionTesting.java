
/**
 *name: AbdielNie
 *date: 09/28/2017
 *description: Television  class testing
 */
public class TelevisionTesting extends Television
{
    public static void main (String [] args)
    {
        Television television = new Television();
        television.setChannel(50);
        television.setVolume(100);
        television.turnOn();
        System.out.println(television.getChannel() + " " + television.getVolume() + " " + television.getOn() + "");
        television.channelUp();
        television.channelDown();
        television.volumeUp();
        television.volumeDown();
        television.turnOff();
        television.setVolume(2500);
        television.testingmethod();
    
    }
    
}
