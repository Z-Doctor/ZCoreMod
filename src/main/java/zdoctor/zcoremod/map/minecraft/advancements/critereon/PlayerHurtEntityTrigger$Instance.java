package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerHurtEntityTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ax$b";
		else
			return "net/minecraft/advancements/critereon/PlayerHurtEntityTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ax$b";
		else
			return "PlayerHurtEntityTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lax$b;";
		else
			return "Lnet/minecraft/advancements/critereon/PlayerHurtEntityTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/DamageSource;FFZ)Z]
	 * </p>
	 */
	public static McObfPair func_192278_a = McMappingDatabase.getSRG("PlayerHurtEntityTrigger$Instance.func_192278_a");

	/**
	 * <p>
	 * Name: damage
	 * </p>
	 */
	public static McObfPair field_192279_a = McMappingDatabase.getSRG("field_192279_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_192280_b = McMappingDatabase.getSRG("field_192280_b");

}
