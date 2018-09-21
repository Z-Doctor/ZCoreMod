package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SummonedEntityTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "az$b";
		else
			return "net/minecraft/advancements/critereon/SummonedEntityTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "az$b";
		else
			return "SummonedEntityTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laz$b;";
		else
			return "Lnet/minecraft/advancements/critereon/SummonedEntityTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_192284_a = McMappingDatabase.getSRG("field_192284_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_192283_a = McMappingDatabase.getSRG("SummonedEntityTrigger$Instance.func_192283_a");

}
