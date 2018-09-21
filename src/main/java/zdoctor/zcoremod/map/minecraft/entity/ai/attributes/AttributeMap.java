package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AttributeMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wi";
		else
			return "net/minecraft/entity/ai/attributes/AttributeMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wi";
		else
			return "AttributeMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwi;";
		else
			return "Lnet/minecraft/entity/ai/attributes/AttributeMap;";
	}

	/**
	 * <p>
	 * Name: dirtyInstances
	 * </p>
	 */
	public static McObfPair field_111162_d = McMappingDatabase.getSRG("field_111162_d");

	/**
	 * <p>
	 * Name: registerAttribute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_111150_b = McMappingDatabase.getSRG("AttributeMap.func_111150_b");

	/**
	 * <p>
	 * Name: instancesByName
	 * </p>
	 */
	public static McObfPair field_111163_c = McMappingDatabase.getSRG("field_111163_c");

	/**
	 * <p>
	 * Name: createInstance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_180376_c = McMappingDatabase.getSRG("AttributeMap.func_180376_c");

	/**
	 * <p>
	 * Name: onAttributeModified
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttributeInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180794_a = McMappingDatabase.getSRG("AttributeMap.func_180794_a");

	/**
	 * <p>
	 * Name: getWatchedAttributes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_111160_c = McMappingDatabase.getSRG("AttributeMap.func_111160_c");

	/**
	 * <p>
	 * Name: getAttributeInstanceByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;, (Ljava/lang/String;)Lnet/minecraft/entity/ai/attributes/ModifiableAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_111152_a = McMappingDatabase.getSRG("AttributeMap.func_111152_a");

	/**
	 * <p>
	 * Name: getDirtyInstances
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_111161_b = McMappingDatabase.getSRG("AttributeMap.func_111161_b");

	/**
	 * <p>
	 * Name: getAttributeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;, (Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/ModifiableAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_111151_a = McMappingDatabase.getSRG("AttributeMap.func_111151_a");

}
