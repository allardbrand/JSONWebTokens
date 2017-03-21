// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package deeplink.proxies;

public class Attribute
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject attributeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DeepLink.Attribute";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Attribute_Entity("DeepLink.Attribute_Entity");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Attribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DeepLink.Attribute"));
	}

	protected Attribute(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attributeMendixObject)
	{
		if (attributeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DeepLink.Attribute", attributeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DeepLink.Attribute");

		this.attributeMendixObject = attributeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Attribute.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static deeplink.proxies.Attribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return deeplink.proxies.Attribute.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static deeplink.proxies.Attribute initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new deeplink.proxies.Attribute(context, mendixObject);
	}

	public static deeplink.proxies.Attribute load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return deeplink.proxies.Attribute.initialize(context, mendixObject);
	}

	public static java.util.List<deeplink.proxies.Attribute> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<deeplink.proxies.Attribute> result = new java.util.ArrayList<deeplink.proxies.Attribute>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DeepLink.Attribute" + xpathConstraint))
			result.add(deeplink.proxies.Attribute.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Attribute_Entity
	 */
	public final deeplink.proxies.Entity getAttribute_Entity() throws com.mendix.core.CoreException
	{
		return getAttribute_Entity(getContext());
	}

	/**
	 * @param context
	 * @return value of Attribute_Entity
	 */
	public final deeplink.proxies.Entity getAttribute_Entity(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		deeplink.proxies.Entity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attribute_Entity.toString());
		if (identifier != null)
			result = deeplink.proxies.Entity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attribute_Entity
	 * @param attribute_entity
	 */
	public final void setAttribute_Entity(deeplink.proxies.Entity attribute_entity)
	{
		setAttribute_Entity(getContext(), attribute_entity);
	}

	/**
	 * Set value of Attribute_Entity
	 * @param context
	 * @param attribute_entity
	 */
	public final void setAttribute_Entity(com.mendix.systemwideinterfaces.core.IContext context, deeplink.proxies.Entity attribute_entity)
	{
		if (attribute_entity == null)
			getMendixObject().setValue(context, MemberNames.Attribute_Entity.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attribute_Entity.toString(), attribute_entity.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return attributeMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final deeplink.proxies.Attribute that = (deeplink.proxies.Attribute) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DeepLink.Attribute";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
