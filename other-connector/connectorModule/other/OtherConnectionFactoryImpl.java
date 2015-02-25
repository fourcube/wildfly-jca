package other;
import javax.naming.NamingException;
import javax.naming.Reference;

import javax.resource.ResourceException;
import javax.resource.spi.ConnectionManager;

/**
 * OtherConnectionFactoryImpl
 *
 * @version $Revision: $
 */
public class OtherConnectionFactoryImpl implements OtherConnectionFactory
{
   /** The serialVersionUID */
   private static final long serialVersionUID = 1L;

   private Reference reference;

   private OtherManagedConnectionFactory mcf;
   private ConnectionManager connectionManager;

   /**
    * Default constructor
    * @param mcf ManagedConnectionFactory
    * @param cxManager ConnectionManager
    */
   public OtherConnectionFactoryImpl(OtherManagedConnectionFactory mcf,
                                          ConnectionManager cxManager)
   {
      this.mcf = mcf;
      this.connectionManager = cxManager;
   }

   /** 
    * Get connection from factory
    *
    * @return OtherConnection instance
    * @exception ResourceException Thrown if a connection can't be obtained
    */
   @Override
   public OtherConnection getConnection() throws ResourceException
   {
      return (OtherConnection)connectionManager.allocateConnection(mcf, null);
   }

   /**
    * Get the Reference instance.
    *
    * @return Reference instance
    * @exception NamingException Thrown if a reference can't be obtained
    */
   @Override
   public Reference getReference() throws NamingException
   {
      return reference;
   }

   /**
    * Set the Reference instance.
    *
    * @param reference A Reference instance
    */
   @Override
   public void setReference(Reference reference)
   {
      this.reference = reference;
   }
}