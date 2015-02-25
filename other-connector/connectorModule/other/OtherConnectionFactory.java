package other;
import java.io.Serializable;

import javax.resource.Referenceable;
import javax.resource.ResourceException;

/**
 * OtherConnectionFactory
 *
 * @version $Revision: $
 */
public interface OtherConnectionFactory extends Serializable, Referenceable
{
   /** 
    * Get connection from factory
    *
    * @return OtherConnection instance
    * @exception ResourceException Thrown if a connection can't be obtained
    */
   public OtherConnection getConnection() throws ResourceException;

}