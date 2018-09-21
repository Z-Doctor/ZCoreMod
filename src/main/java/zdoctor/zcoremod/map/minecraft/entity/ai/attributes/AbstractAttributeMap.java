package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractAttributeMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wg";
		else
			return "net/minecraft/entity/ai/attributes/AbstractAttributeMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wg";
		else
			return "AbstractAttributeMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwg;";
		else
			return "Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;";
	}

	/**
	 * <p>
	 * Name: getAllAttributes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_111146_a = McMappingDatabase.getSRG("AbstractAttributeMap.func_111146_a");

	/**
	 * <p>
	 * Name: descendantsByParent
	 * </p>
	 */
	public static McObfPair field_180377_c = McMappingDatabase.getSRG("field_180377_c");

	/**
	 * <p>
	 * Name: createInstance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_180376_c = McMappingDatabase.getSRG("AbstractAttributeMap.func_180376_c");

	/**
	 * <p>
	 * Name: attributes
	 * </p>
	 */
	public static McObfPair field_111154_a = McMappingDatabase.getSRG("field_111154_a");

	/**
	 * <p>
	 * Name: applyAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/common/collect/Multimap;)V]
	 * </p>
	 */
	public static McObfPair func_111147_b = McMappingDatabase.getSRG("AbstractAttributeMap.func_111147_b");

	/**
	 * <p>
	 * Name: removeAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/common/collect/Multimap;)V]
	 * </p>
	 */
	public static McObfPair func_111148_a = McMappingDatabase.getSRG("AbstractAttributeMap.func_111148_a");

	/**
	 * <p>
	 * Name: getAttributeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_111151_a = McMappingDatabase.getSRG("AbstractAttributeMap.func_111151_a");

	/**
	 * <p>
	 * Name: registerAttribute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_111150_b = McMappingDatabase.getSRG("AbstractAttributeMap.func_111150_b");

	/**
	 * <p>
	 * Name: onAttributeModified
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttributeInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180794_a = McMappingDatabase.getSRG("AbstractAttributeMap.func_180794_a");

	/**
	 * <p>
	 * Name: getAttributeInstanceByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/entity/ai/attributes/IAttributeInstance;]
	 * </p>
	 */
	public static McObfPair func_111152_a = McMappingDatabase.getSRG("AbstractAttributeMap.func_111152_a");

	/**
	 * <p>
	 * Name: attributesByName
	 * </p>
	 */
	public static McObfPair field_111153_b = McMappingDatabase.getSRG("field_111153_b");

}
