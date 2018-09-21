package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIVillagerInteract {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yn";
		else
			return "net/minecraft/entity/ai/EntityAIVillagerInteract";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yn";
		else
			return "EntityAIVillagerInteract";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyn;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIVillagerInteract;";
	}

	/**
	 * <p>
	 * Name: interactionDelay
	 * </p>
	 */
	public static McObfPair field_179478_e = McMappingDatabase.getSRG("field_179478_e");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIVillagerInteract.func_75246_d");

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_179477_f = McMappingDatabase.getSRG("field_179477_f");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIVillagerInteract.func_75249_e");

}
