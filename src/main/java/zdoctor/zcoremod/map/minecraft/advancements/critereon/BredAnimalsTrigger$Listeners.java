package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BredAnimalsTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "v$a";
		else
			return "net/minecraft/advancements/critereon/BredAnimalsTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "v$a";
		else
			return "BredAnimalsTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lv$a;";
		else
			return "Lnet/minecraft/advancements/critereon/BredAnimalsTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192340_b = McMappingDatabase.getSRG("BredAnimalsTrigger$Listeners.func_192340_b");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/passive/EntityAnimal;Lnet/minecraft/entity/passive/EntityAnimal;Lnet/minecraft/entity/EntityAgeable;)V]
	 * </p>
	 */
	public static McObfPair func_192342_a = McMappingDatabase.getSRG("BredAnimalsTrigger$Listeners.func_192342_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192343_a = McMappingDatabase.getSRG("BredAnimalsTrigger$Listeners.func_192343_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192341_a = McMappingDatabase.getSRG("BredAnimalsTrigger$Listeners.func_192341_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192345_b = McMappingDatabase.getSRG("field_192345_b");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_192344_a = McMappingDatabase.getSRG("field_192344_a");

}
