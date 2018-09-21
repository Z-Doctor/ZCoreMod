package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class KilledTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ao$b";
		else
			return "net/minecraft/advancements/critereon/KilledTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ao$b";
		else
			return "KilledTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lao$b;";
		else
			return "Lnet/minecraft/advancements/critereon/KilledTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: killingBlow
	 * </p>
	 */
	public static McObfPair field_192272_b = McMappingDatabase.getSRG("field_192272_b");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/DamageSource;)Z]
	 * </p>
	 */
	public static McObfPair func_192270_a = McMappingDatabase.getSRG("KilledTrigger$Instance.func_192270_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_192271_a = McMappingDatabase.getSRG("field_192271_a");

}
