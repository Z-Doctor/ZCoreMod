package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aj";
		else
			return "net/minecraft/advancements/critereon/EntityPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aj";
		else
			return "EntityPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laj;";
		else
			return "Lnet/minecraft/advancements/critereon/EntityPredicate;";
	}

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_193435_d = McMappingDatabase.getSRG("field_193435_d");

	/**
	 * <p>
	 * Name: ANY
	 * </p>
	 */
	public static McObfPair field_192483_a = McMappingDatabase.getSRG("field_192483_a");

	/**
	 * <p>
	 * Name: effects
	 * </p>
	 */
	public static McObfPair field_193436_e = McMappingDatabase.getSRG("field_193436_e");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_192484_b = McMappingDatabase.getSRG("field_192484_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_192482_a = McMappingDatabase.getSRG("EntityPredicate.func_192482_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonElement;)Lnet/minecraft/advancements/critereon/EntityPredicate;]
	 * </p>
	 */
	public static McObfPair func_192481_a = McMappingDatabase.getSRG("EntityPredicate.func_192481_a");

	/**
	 * <p>
	 * Name: distance
	 * </p>
	 */
	public static McObfPair field_192485_c = McMappingDatabase.getSRG("field_192485_c");

	/**
	 * <p>
	 * Name: nbt
	 * </p>
	 */
	public static McObfPair field_193437_f = McMappingDatabase.getSRG("field_193437_f");

}
