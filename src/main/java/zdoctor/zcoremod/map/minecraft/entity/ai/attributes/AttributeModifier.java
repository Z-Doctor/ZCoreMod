package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AttributeModifier {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "we";
		else
			return "net/minecraft/entity/ai/attributes/AttributeModifier";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "we";
		else
			return "AttributeModifier";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwe;";
		else
			return "Lnet/minecraft/entity/ai/attributes/AttributeModifier;";
	}

	/**
	 * <p>
	 * Name: isSaved
	 * </p>
	 */
	public static McObfPair field_111171_e = McMappingDatabase.getSRG("field_111171_e");

	/**
	 * <p>
	 * Name: getAmount
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111164_d = McMappingDatabase.getSRG("AttributeModifier.func_111164_d");

	/**
	 * <p>
	 * Name: amount
	 * </p>
	 */
	public static McObfPair field_111174_a = McMappingDatabase.getSRG("field_111174_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_111166_b = McMappingDatabase.getSRG("AttributeModifier.func_111166_b");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_111170_d = McMappingDatabase.getSRG("field_111170_d");

	/**
	 * <p>
	 * Name: isSaved
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_111165_e = McMappingDatabase.getSRG("AttributeModifier.func_111165_e");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_111173_c = McMappingDatabase.getSRG("field_111173_c");

	/**
	 * <p>
	 * Name: setSaved
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/entity/ai/attributes/AttributeModifier;]
	 * </p>
	 */
	public static McObfPair func_111168_a = McMappingDatabase.getSRG("AttributeModifier.func_111168_a");

	/**
	 * <p>
	 * Name: getOperation
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_111169_c = McMappingDatabase.getSRG("AttributeModifier.func_111169_c");

	/**
	 * <p>
	 * Name: operation
	 * </p>
	 */
	public static McObfPair field_111172_b = McMappingDatabase.getSRG("field_111172_b");

	/**
	 * <p>
	 * Name: getID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_111167_a = McMappingDatabase.getSRG("AttributeModifier.func_111167_a");

}
