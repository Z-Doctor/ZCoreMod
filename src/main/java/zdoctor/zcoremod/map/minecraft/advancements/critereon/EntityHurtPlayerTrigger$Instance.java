package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHurtPlayerTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ai$b";
		else
			return "net/minecraft/advancements/critereon/EntityHurtPlayerTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ai$b";
		else
			return "EntityHurtPlayerTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lai$b;";
		else
			return "Lnet/minecraft/advancements/critereon/EntityHurtPlayerTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/util/DamageSource;FFZ)Z]
	 * </p>
	 */
	public static McObfPair func_192263_a = McMappingDatabase.getSRG("EntityHurtPlayerTrigger$Instance.func_192263_a");

	/**
	 * <p>
	 * Name: damage
	 * </p>
	 */
	public static McObfPair field_192264_a = McMappingDatabase.getSRG("field_192264_a");

}
