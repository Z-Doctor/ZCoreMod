package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VillagerTradeTrigger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bc";
		else
			return "net/minecraft/advancements/critereon/VillagerTradeTrigger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bc";
		else
			return "VillagerTradeTrigger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbc;";
		else
			return "Lnet/minecraft/advancements/critereon/VillagerTradeTrigger;";
	}

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192164_b = McMappingDatabase.getSRG("VillagerTradeTrigger.func_192164_b");

	/**
	 * <p>
	 * Name: removeAllListeners
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_192167_a = McMappingDatabase.getSRG("VillagerTradeTrigger.func_192167_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192238_b = McMappingDatabase.getSRG("field_192238_b");

	/**
	 * <p>
	 * Name: deserializeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/ICriterionInstance;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/critereon/VillagerTradeTrigger$Instance;]
	 * </p>
	 */
	public static McObfPair func_192166_a = McMappingDatabase.getSRG("VillagerTradeTrigger.func_192166_a");

	/**
	 * <p>
	 * Name: ID
	 * </p>
	 */
	public static McObfPair field_192237_a = McMappingDatabase.getSRG("field_192237_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/passive/EntityVillager;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_192234_a = McMappingDatabase.getSRG("VillagerTradeTrigger.func_192234_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192163_a = McMappingDatabase.getSRG("VillagerTradeTrigger.func_192163_a");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192165_a = McMappingDatabase.getSRG("VillagerTradeTrigger.func_192165_a");

}
