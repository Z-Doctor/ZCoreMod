package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBoat$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd$b";
		else
			return "net/minecraft/entity/item/EntityBoat$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afd$b";
		else
			return "EntityBoat$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafd$b;";
		else
			return "Lnet/minecraft/entity/item/EntityBoat$Type;";
	}

	/**
	 * <p>
	 * Name: byId
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/item/EntityBoat$Type;]
	 * </p>
	 */
	public static McObfPair func_184979_a = McMappingDatabase.getSRG("EntityBoat$Type.func_184979_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_184980_a = McMappingDatabase.getSRG("EntityBoat$Type.func_184980_a");

	/**
	 * <p>
	 * Name: getTypeFromString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/entity/item/EntityBoat$Type;]
	 * </p>
	 */
	public static McObfPair func_184981_a = McMappingDatabase.getSRG("EntityBoat$Type.func_184981_a");

	/**
	 * <p>
	 * Name: metadata
	 * </p>
	 */
	public static McObfPair field_184991_h = McMappingDatabase.getSRG("field_184991_h");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_184990_g = McMappingDatabase.getSRG("field_184990_g");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184982_b = McMappingDatabase.getSRG("EntityBoat$Type.func_184982_b");

}
