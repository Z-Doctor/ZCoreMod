package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySenses {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zj";
		else
			return "net/minecraft/entity/ai/EntitySenses";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zj";
		else
			return "EntitySenses";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzj;";
		else
			return "Lnet/minecraft/entity/ai/EntitySenses;";
	}

	/**
	 * <p>
	 * Name: unseenEntities
	 * </p>
	 */
	public static McObfPair field_75525_c = McMappingDatabase.getSRG("field_75525_c");

	/**
	 * <p>
	 * Name: canSee
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_75522_a = McMappingDatabase.getSRG("EntitySenses.func_75522_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_75526_a = McMappingDatabase.getSRG("field_75526_a");

	/**
	 * <p>
	 * Name: seenEntities
	 * </p>
	 */
	public static McObfPair field_75524_b = McMappingDatabase.getSRG("field_75524_b");

	/**
	 * <p>
	 * Name: clearSensingCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75523_a = McMappingDatabase.getSRG("EntitySenses.func_75523_a");

}
