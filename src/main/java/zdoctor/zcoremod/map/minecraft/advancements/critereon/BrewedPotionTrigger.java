package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BrewedPotionTrigger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "w";
		else
			return "net/minecraft/advancements/critereon/BrewedPotionTrigger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "w";
		else
			return "BrewedPotionTrigger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lw;";
		else
			return "Lnet/minecraft/advancements/critereon/BrewedPotionTrigger;";
	}

	/**
	 * <p>
	 * Name: ID
	 * </p>
	 */
	public static McObfPair field_192176_a = McMappingDatabase.getSRG("field_192176_a");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192164_b = McMappingDatabase.getSRG("BrewedPotionTrigger.func_192164_b");

	/**
	 * <p>
	 * Name: deserializeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/ICriterionInstance;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/critereon/BrewedPotionTrigger$Instance;]
	 * </p>
	 */
	public static McObfPair func_192166_a = McMappingDatabase.getSRG("BrewedPotionTrigger.func_192166_a");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192165_a = McMappingDatabase.getSRG("BrewedPotionTrigger.func_192165_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_192177_b = McMappingDatabase.getSRG("field_192177_b");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192163_a = McMappingDatabase.getSRG("BrewedPotionTrigger.func_192163_a");

	/**
	 * <p>
	 * Name: removeAllListeners
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_192167_a = McMappingDatabase.getSRG("BrewedPotionTrigger.func_192167_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/potion/PotionType;)V]
	 * </p>
	 */
	public static McObfPair func_192173_a = McMappingDatabase.getSRG("BrewedPotionTrigger.func_192173_a");

}
