package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class UsedTotemTrigger {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "be";
		else
			return "net/minecraft/advancements/critereon/UsedTotemTrigger";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "be";
		else
			return "UsedTotemTrigger";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbe;";
		else
			return "Lnet/minecraft/advancements/critereon/UsedTotemTrigger;";
	}

	/**
	 * <p>
	 * Name: removeAllListeners
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_192167_a = McMappingDatabase.getSRG("UsedTotemTrigger.func_192167_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192163_a = McMappingDatabase.getSRG("UsedTotemTrigger.func_192163_a");

	/**
	 * <p>
	 * Name: addListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192165_a = McMappingDatabase.getSRG("UsedTotemTrigger.func_192165_a");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_193189_b = McMappingDatabase.getSRG("field_193189_b");

	/**
	 * <p>
	 * Name: ID
	 * </p>
	 */
	public static McObfPair field_193188_a = McMappingDatabase.getSRG("field_193188_a");

	/**
	 * <p>
	 * Name: removeListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_192164_b = McMappingDatabase.getSRG("UsedTotemTrigger.func_192164_b");

	/**
	 * <p>
	 * Name: deserializeInstance
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/ICriterionInstance;, (Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/critereon/UsedTotemTrigger$Instance;]
	 * </p>
	 */
	public static McObfPair func_192166_a = McMappingDatabase.getSRG("UsedTotemTrigger.func_192166_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193187_a = McMappingDatabase.getSRG("UsedTotemTrigger.func_193187_a");

}
