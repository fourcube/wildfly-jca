package other;
import java.util.logging.Logger;

/**
 * OtherConnectionImpl
 *
 * @version $Revision: $
 */
public class OtherConnectionImpl implements OtherConnection
{
   /** The logger */
   private static Logger log = Logger.getLogger("OtherConnectionImpl");

   /** ManagedConnection */
   private OtherManagedConnection mc;

   /** ManagedConnectionFactory */
   private OtherManagedConnectionFactory mcf;

   /**
    * Default constructor
    * @param mc OtherManagedConnection
    * @param mcf OtherManagedConnectionFactory
    */
   public OtherConnectionImpl(OtherManagedConnection mc,
                                   OtherManagedConnectionFactory mcf)
   {
      this.mc = mc;
      this.mcf = mcf;
   }

   /**
    * Call helloWorld
    * @return String helloworld
    */
   public String other()
   {
      return other(((OtherResourceAdapter)mcf.getResourceAdapter()).getName());
   }

   /**
    * Call helloWorld
    * @param name String name
    * @return String helloworld
    */
   public String other(String name)
   {
      return mc.helloWorld(name);
   }

   /**
    * Close
    */
   public void close()
   {
      mc.closeHandle(this);
   }
}
