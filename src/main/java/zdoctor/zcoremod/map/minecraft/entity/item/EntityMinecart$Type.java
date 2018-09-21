package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecart$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afe$a";
		else
			return "net/minecraft/entity/item/EntityMinecart$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afe$a";
		else
			return "EntityMinecart$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafe$a;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecart$Type;";
	}

	/**
	 * <p>
	 * Name: BY_ID
	 * </p>
	 */
	public static McObfPair field_184965_h = McMappingDatabase.getSRG("field_184965_h");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184954_b = McMappingDatabase.getSRG("EntityMinecart$Type.func_184954_b");

	/**
	 * <p>
	 * Name: getById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184955_a = McMappingDatabase.getSRG("EntityMinecart$Type.func_184955_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_184966_i = McMappingDatabase.getSRG("field_184966_i");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184956_a = McMappingDatabase.getSRG("EntityMinecart$Type.func_184956_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_184967_j = McMappingDatabase.getSRG("field_184967_j");

}
