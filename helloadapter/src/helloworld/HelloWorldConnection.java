package helloworld;
/**
 * HelloWorldConnection
 *
 * @version $Revision: $
 */
public interface HelloWorldConnection
{
   /**
    * HelloWorld
    * @return String
    */
   public String helloWorld();

   /**
    * HelloWorld
    * @param name A name
    * @return String
    */
   public String helloWorld(String name);

   /**
    * Close
    */
   public void close();
}