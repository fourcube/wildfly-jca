package other;
/**
 * OtherConnection
 *
 * @version $Revision: $
 */
public interface OtherConnection
{
   /**
    * Other
    * @return String
    */
   public String other();

   /**
    * Other
    * @param name A name
    * @return String
    */
   public String other(String name);

   /**
    * Close
    */
   public void close();
}